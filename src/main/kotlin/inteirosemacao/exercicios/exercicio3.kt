package inteirosemacao.exercicios

/**
 * Dado um número natural N, não maior que 10.000. Emita o número par que segue este N.
 */

fun main() {
    val n = readln().toInt()
    if (n % 2 == 0) {
        println(n + 2)
    } else {
        println(n + 1)
    }
}