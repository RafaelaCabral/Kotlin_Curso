package org.example
//Crie uma função que receba uma palavra e diga se ela é um palíndromo (lida igual de trás para frente, como "ovo", "radar").

//Com lib
//fun palindromo(palavra: String): String{
//    val palavraFormatada = palavra.lowercase()
//    val palavraInvertida = palavraFormatada.reversed()
//
//    if(palavraFormatada == palavraInvertida){
//        return "Simmmm"
//    } else{
//        return "Nãooooo"
//    }
//}

//Sem lib
fun palindromo(palavra: String): String{
    val palavraFormatada = palavra.lowercase()
    val palavraInvertida = inverterPalavra(palavraFormatada)

    if(palavraFormatada == palavraInvertida){
        return "Simmmm"
    } else{
        return "Nãooooo"
    }
}
fun inverterPalavra(palavra: String): String {
    var invertida = ""
    for (i in palavra.length - 1 downTo 0) {
        invertida += palavra[i]
    }
    return invertida
}
fun main() {
    print("Digite uma palavra:")
    val entrada = readLine()?: ""

    val resultado = palindromo(entrada)

    println("É palindromo? ${resultado}")
}