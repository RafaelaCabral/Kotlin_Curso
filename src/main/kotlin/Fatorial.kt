package org.example

fun fatorial(numero: Int): Long {
    var resultado = 1L
    for (i in 1..numero) {
        resultado *= i
    }
    return resultado
}

fun main() {
    print("Digite um número inteiro: ")
    val entrada = readLine()?.toIntOrNull()

    if (entrada == null || entrada < 0) {
        println("Digite um número inteiro positivo!")
    } else {
        val resultado = fatorial(entrada)
        println("O fatorial de $entrada é: $resultado")
    }
}
