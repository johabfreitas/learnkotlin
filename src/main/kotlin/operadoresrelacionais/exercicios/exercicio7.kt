package operadoresrelacionais.exercicios

/**
 * Escreva um programa que leia três números inteiros e imprima true se apenas um número for positivo.
 * Caso contrário, é para imprimir  false
 *
 */

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val result = a >= 1 && b <= 0 && c <= 0

    println(result)

}