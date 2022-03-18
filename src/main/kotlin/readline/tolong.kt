package readline

/**
 * Caso precisemos processar um número maior, por exemplo,
 * o custo de um iate grande e luxuoso, use a função toLong():
 */

fun main() {
    println("Qual o valor do seu iate?")
    val custo = readln().toLong()
    print("Você imprimiu: ")
    print(custo)
}