package inteirosemacao.exercicios

/**
 * N esquilos encontraram K nozes e decidiram dividi-las igualmente.
 * Calcule quantas nozes vão para cada esquilo.
    Formato de dados de entrada
    Existem dois números positivos Ne K, cada um deles não é maior que 10000.
 */

fun main() {
    val n = readln().toInt()
    val k = readln().toInt()
    val result = k / n

    println(result)

}