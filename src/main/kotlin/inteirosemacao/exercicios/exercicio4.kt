package inteirosemacao.exercicios

/**
 * Nesquilos encontraram Knozes e decidiram dividi-las igualmente. Descubra quantas
 * nozes sobrarão depois que cada um dos esquilos pegar uma quantidade igual de nozes.
 * Formato de dados de entrada. Existem dois inteiros positivos N e K, cada um
 * deles não é maior que 10000.
 */

fun main() {
    val n = readln().toInt()
    val k = readln().toInt()
    val result = k % n

    println(result)

}