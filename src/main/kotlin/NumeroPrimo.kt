package org.example

//Crie uma função que receba um número inteiro e retorne se ele é primo ou não.

fun numeroPrimo(numero: Int): String {
    for (i in 2 until numero) {
        if (numero % i == 0) {
            return "Não é primo"
        }
    }
    return "É primo"
}

fun main() {
    print("Digite um número: ")
    val numero = readLine()?.toIntOrNull()?: 0

    if(numero <= 1){
        println("Por favor, digite um número maior que 1!")
    }

    val resultado = numeroPrimo(numero)

    println("É primo: ${resultado} ")

}