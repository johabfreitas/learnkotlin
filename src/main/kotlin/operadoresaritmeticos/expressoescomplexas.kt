package operadoresaritmeticos

/**
 *  A ordem de cálculo coincide com as regras das operações aritméticas.
 *  A multiplicação tem uma prioridade mais alta do que a
 *  adição ou subtração, então 3 * 4 é calculado primeiro.
 */

fun main() {

    println("(1 + 3 * 4 - 2) = " + (1 + 3 * 4 - 2)) // prints 11
    println()
    println("Use parênteses para especificar a ordem de execução. Vamos dar uma olhada no exemplo abaixo:")
    println("((1 + 3) * (4 - 2)) = " + (1 + 3) * (4 - 2)) // prints 8
    println()
    println("Os parênteses podem ser aninhados. Você também pode usá-los para simplificar a notação.")
    println()
    println("54 % 10 = " + 54 % 10) // it prints 4
    println("(54 / 10) % 10 = " + (54 / 10) % 10) // it prints 5
    println("2 + 4 * 5 - 10 / (2 + 1) = " + (2 + 4 * 5 - 10 / (2 + 1)))
    println("(3 + 4) * (5 / 2) = " + ((3 + 4) * (5 / 2)))
    println("30 / 7 + 5 / 7 = " + ((30 / 7) + (5 / 7)))
    println(12 % 13)

}