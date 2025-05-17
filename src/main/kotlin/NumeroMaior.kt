package org.example
//Função que receba array de números e retorne o maior número dessa lista
fun numeroMaior(numeros: Array<Double>): Double {
    var maior = numeros[0]
    for (numero in numeros) {
        if (numero > maior) {
            maior = numero
        }
    }
    return maior
}

fun main() {
    print("Digite uma lista de números, separados por vírgula:")

    val entrada = readLine()?.toString()?: ""


    val listaOriginal = entrada.split(",")
    val listaSemEspacos = mutableListOf<String>()

    for (palavra in listaOriginal){
        val limpa = palavra.trim()
        listaSemEspacos.add(limpa)
    }

    val arraySemEspacos = listaSemEspacos.toTypedArray()

    val listaDeNumeros = arraySemEspacos.map {it.toDouble()}.toTypedArray()

    val resultado = numeroMaior(listaDeNumeros)

    println("Maior número: ${resultado}")
}