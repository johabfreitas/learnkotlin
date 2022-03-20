package operadoresaritmeticos

/**
 * Um operador unário recebe um único valor como operando.
 * Ordem de precedência:
 *   1.Parênteses;
 *   2.Mais/menos unário;
 *   3.Multiplicação, divisão e módulo;
 *   4.Adição e subtração.
 */

fun main() {
    println()
    println("Unário mais(+) lhe dá apenas um valor:")
    println("(+5) = " +5) // prints 5
    println("+(-5) = " +(-5)) // prints -5
    println()
    println("Unário menos(-) nega um valor ou expressão:")
    println("(-8) = " + -8)  // prints -8
    println("-(100 + 4) = " + -(100 + 4)) // prints -104
    println()
    println("Ambos têm precedência mais alta do que os operadores de multiplicação e divisão.")
}