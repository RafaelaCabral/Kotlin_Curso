package org.example

//Com lib
fun remocaoEspaco(frase: String): String{
    return frase.trim().replace("  ", " ")
}
//Sem lib
//fun remocaoEspaco(frase: String): String {
//    var resultado = frase.trim()
//    while (resultado.contains("  ")) {
//        resultado = resultado.replace("  ", " ")
//    }
//    return resultado
//}

fun main() {
    print("Digite uma frase com espaço duplo: ")

    val entrada = readLine()?.toString()?: ""

    val resultado = remocaoEspaco(entrada)

    print("A frase sem espaço duplo é: ${resultado}")
}