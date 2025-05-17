package org.example


/*Uma função que receba um array e retorne ele invertido.
Sem usar funções da linguagem q façam isso já, como o reverse(), a ideia é praticar a lógica por traz
*/

fun inverterLista(lista: Array<String>): Array<String> {
    val tamanho = lista.size
    val novaLista = Array(tamanho) { "" }

    for (i in lista.indices) {
        novaLista[i] = lista[tamanho - 1 - i]
    }

    return novaLista
}



fun main() {
    println("Digite uma lista de palavras separadas por vírgula. Ex. Banana, Maça, Carro:  ")
    val entrada = readLine()?.toString()?: ""


    val listaOriginal = entrada.split(",")


    val listaSemEspacos = mutableListOf<String>()

    for (palavra in listaOriginal){
        val limpa = palavra.trim()
        listaSemEspacos.add(limpa)
    }

    val arraySemEspacos = listaSemEspacos.toTypedArray()
    val resultado = inverterLista(arraySemEspacos)

    println("Resultado invertido: ${resultado.joinToString(", ")}")

}


