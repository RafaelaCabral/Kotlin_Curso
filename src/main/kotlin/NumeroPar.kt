package org.example

//Crie uma função que receba um array de inteiros e retorne apenas os números pares.

//Com lib
fun numeroPar(numeros: Array<Int>): Array<Int> {
    return numeros.filter { it % 2 == 0 }.toTypedArray()
}

//Sem lib
//fun numeroPar(numeros: Array<Int>): Array<Int>{
//    val numerosPares = mutableListOf<Int>()
//
//    for(numero in numeros){
//        if (numero % 2==0){
//            numerosPares.add(numero)
//        }
//    }
//
//    return numerosPares.toTypedArray()
//
//}
fun main() {
    print("Digite uma lista de números, separados por vírgula:")

    val entrada = readLine()?.toString()?: ""
    val numeros = entrada.split(",").map { it.trim().toInt()}.toTypedArray()

    val resultado = numeroPar(numeros)

    println("Os números pares são: ${resultado.joinToString(", ")}")

}