package org.example

//Com lib
fun mediaNumeros(numeros: Array<Double>): Double {
    return numeros.average()
}

//Sem lib
//fun mediaNumeros(numeros: Array<Double>): Double{
//    val tamanhoLista = numeros.size
//    var soma = 0.0
//    for(numero in numeros){
//        soma += numero
//
//    }
//    val media = soma / tamanhoLista
//    return media
//}
fun main() {
    print("Digite uma lista de numeros separadas por vírgula. Ex. 1, 2, 3.32: ")
    val entrada = readLine()?: " "


    val numeros = entrada.split(",").map { it.trim().toDouble() }.toTypedArray()

    val resultado = mediaNumeros(numeros)

    println("A média é: ${resultado}")

}