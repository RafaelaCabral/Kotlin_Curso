package org.example
//Crie uma função que receba uma frase e retorne a mesma frase com espaços duplicados removidos (ou seja, só um espaço entre as palavras).

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