package org.example

//Usando lib
//fun contarVogais (frase: String): Int{
//    val vogais = frase.lowercase().count { it in "aeiou" }
//    return vogais
//}


//Passo a passo
fun contarVogais (frase: String): Int{
    var contador = 0
    val fraseMinuscula = frase.lowercase()
    for (letra in fraseMinuscula){
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            contador++
        }
    }
    return contador
}
fun main() {
    print("Digite uma frase:")
    val entrada = readLine()?: ""

    val resultado = contarVogais(entrada)

    println("Quantidade de vogais: ${resultado}")

}