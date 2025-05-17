package org.example
/*
Fazer uma função que receba como argumentos um número e um expoente, e retorne a potência calculada
*/

import kotlin.math.pow

//Calcular com lib
//fun calcularPotencia (base: Double, expoente: Int): Double{
//    return base.pow(expoente)
//}

//Calcular sem lib
fun calcularPotencia(base: Double, expoente: Int): Double {
    var resultado = 1.0

    if (expoente == 0) {
        return 1.0
    } else {
        var i = 1
        while (i <= expoente) {
            resultado *= base
            i++
        }
        return resultado
    }
}

fun main() {
    print("Digite o número base: ")
    val base = readLine()?.toDoubleOrNull()?: 0.0


    print("Digite o número expoente: ")
    val expoente = readLine()?.toIntOrNull() ?: 0

    val resultado = calcularPotencia(base, expoente)

    println("O resultado é: ${resultado} ")

}