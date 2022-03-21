package incrementoedecremento.`exercicios `

/**
 * Lembre-se, o incremento postfix ainda retorna o valor antigo na primeira vez.
 */

fun main() {
    var a = 5
    var b = 9
    val c = a++ * 1 - b--
    println(c)
}