package operadoresrelacionais.exercicios

/**
 * Escreva um programa que leia três números e verifique se eles são diferentes
 * (os números não são iguais entre si). Saída trueou false.
 *
 */

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val result = a != b && b != c && a != c

    println(result)
}