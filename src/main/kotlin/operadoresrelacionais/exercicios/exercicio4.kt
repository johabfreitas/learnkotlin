package operadoresrelacionais.exercicios

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val result = a >= b && b != c

    println(result)
}