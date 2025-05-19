package org.example


fun contarOcorrencias(lista: Array<String>): Map<String, Int> {
    val contagem = mutableMapOf<String, Int>()

    for (palavra in lista) {
        if (palavra in contagem) {
            contagem[palavra] = contagem[palavra]!! + 1
        } else {
            contagem[palavra] = 1
        }
    }
    return contagem
}
fun main() {
    print("Digite uma lista de palavras, separados por vírgula:")

    val entrada = readLine()?.toString()?: ""
    val palavras = entrada.split(",").map { it.trim().toString().lowercase()}.toTypedArray()

    val resultado = contarOcorrencias(palavras)

    println("Ocorrências:")
    for ((palavra, quantidade) in resultado) {
        println("$palavra: $quantidade")
    }
}