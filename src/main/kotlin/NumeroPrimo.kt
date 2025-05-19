package org.example

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