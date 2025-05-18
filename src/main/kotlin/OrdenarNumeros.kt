package org.example

//Uma função que receba um array de números e retorne esse array ordenado de maneira crescente

fun ordernarNumeros(numeros: Array<Double>) : Array<Double>{
    val numerosOrdenados = numeros.sorted().toTypedArray()
    return numerosOrdenados
}
//Mais direta
fun main (){
    print("Digite uma lista de números, separados por vírgula:")

    val entrada = readLine()?.toString()?: ""

    val listaNumeros = entrada.split(",").map { it.trim().toDouble() }.toTypedArray()

    val resultado = ordernarNumeros(listaNumeros)


    println("Números ordenados: ${resultado.joinToString(", ")}")
}

//Passo a passo

//fun main() {
//    print("Digite uma lista de números, separados por vírgula:")
//
//    val entrada = readLine()?.toString()?: ""
//
//
//    val listaOriginal = entrada.split(",")
//    val listaSemEspacos = mutableListOf<String>()
//
//    for (palavra in listaOriginal){
//        val limpa = palavra.trim()
//        listaSemEspacos.add(limpa)
//    }
//
//    val arraySemEspacos = listaSemEspacos.toTypedArray()
//
//    val listaDeNumeros = arraySemEspacos.map {it.toDouble()}.toTypedArray()
//
//    val resultado = ordernarNumeros(listaDeNumeros)
//
//
//    println("Números ordenados: ${resultado.joinToString(", ")}")
//
//}