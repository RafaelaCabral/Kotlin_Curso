package org.example

//Crie uma função que receba uma lista de números separados por vírgula e retorne a soma total.

//Com lib
fun somarNumeros(numeros: Array<Double>): Double{
    var soma = numeros.sum()
    return soma
}
//Sem lib
//fun somarNumeros(numeros: Array<Double>): Double{
//    var soma = 0.0
//    for(numero in numeros){
//        soma += numero
//    }
//    return soma
//}
fun main() {
    print("Digite uma lista de numeros separadas por vírgula. Ex. 1, 2, 3.32: ")
    val entrada = readLine()?: " "


    val numeros = entrada.split(",").map { it.trim().toDouble() }.toTypedArray()

    val resultado = somarNumeros(numeros)

    println("A soma total é: ${resultado}")

}