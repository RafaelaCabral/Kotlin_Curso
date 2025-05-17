package org.example

fun anagramas (palavra1: String, palavra2: String): String{
    val letras1 = palavra1.toCharArray().sorted()
    val letras2 = palavra2.toCharArray().sorted()

    if (letras1 == letras2){
        return "Sim"
    } else{
        return "Não"
    }


}
fun main() {
    print("Digite duas palavras, separadas por vírgula:")

    val entrada = readLine()?.toString()?: ""

    val palavras= entrada.split(",")

    if (palavras.size != 2){
        println("Por favor, digite exatamente duas palavras separadas por vírgula.")
        return
    }
    val palavra1 = palavras[0].trim().lowercase()
    val palavra2 = palavras[1].trim().lowercase()

    val resultado = anagramas(palavra1, palavra2)


    println("Palavras anagramas? ${resultado}")

}