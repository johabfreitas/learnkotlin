package incrementoedecremento

/**
 * Primeiro, o valor da variável aé aumentado em um e, em seguida,
 * seu valor é atribuído à variável b. Então, ae bambos são 11.
 *
 * Segundo, você vê a mesma coisa acontecendo: o valor da variável é diminuído em um,
 * e então seu valor é atribuído à variável d.
 */

fun main() {
    var a = 10
    val b = ++a
    println("Prefixo incremento")
    println(a)  // a = 11
    println(b)  // b = 11

    var c = 10
    val d = --c
    println("Prefixo decremento")
    println(c)  // a = 9
    println(d)  // b = 9
}