package org.example

fun contarLetras(frase: String, letraProcurada: Char): Int {
    var contador = 0
    val fraseMinuscula = frase.lowercase()
    val letra = letraProcurada.lowercaseChar()  // garantir que seja minúscula

    for (caractere in fraseMinuscula) {
        if (caractere == letra) {
            contador++
        }
    }

    return contador
}

fun main() {
    print("Digite uma frase: ")
    val frase = readLine() ?: ""

    print("Digite a letra que deseja contar: ")
    val letraEntrada = readLine() ?: ""

    if (letraEntrada.length != 1) {
        println("Por favor, digite apenas UMA letra.")
        return
    }

    val letra = letraEntrada[0] // pega o primeiro caractere digitado
    val resultado = contarLetras(frase, letra)

    println("A letra '$letra' aparece $resultado vezes na frase.")
}
