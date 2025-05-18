package org.example

//Com lib
//fun inverterFrase(frase: String): String{
//    return frase.reversed()
//}

//Sem lib
fun inverterFrase(frase: String): String {
    var invertida = ""
    for (i in frase.length - 1 downTo 0) {
        invertida += frase[i]
    }
    return invertida
}

fun main() {
    print("Digite uma frase: ")

    val entrada = readLine()?.toString()?: ""
    val frase = entrada.lowercase()

    val resultado = inverterFrase(frase)

    print("A frase invertida é: ${resultado}")

}