package operadoresaritmeticos

/**
 * Desde o Kotlin 1.5, você também pode usar outro tipo de divisão.
 * Tudo que você precisa é usar floorDiv em vez de "/" e a palavra reservada "mod" vez de %:
 */

fun main() {
    println("Exemplos de divisão em Kotlin com floorDiv:")

    println("11.floorDiv(-4) = " + 11.floorDiv(-4))    // prints -3
    println("11.mod(-4) = " + 11.mod(-4))         // prints -1
    println("(-11).floorDiv(4) = " + (-11).floorDiv(4))  // prints -3
    println("(-11).mod(4) = " + (-11).mod(4))       // prints 1
    println("(-11).floorDiv(-4) = " + (-11).floorDiv(-4)) // prints 2
    println("(-11).mod(-4) = " + (-11).mod(-4))      // prints -3
}