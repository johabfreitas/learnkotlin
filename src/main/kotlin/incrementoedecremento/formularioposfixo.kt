package incrementoedecremento

/**
 *  Primeiro, o valor da variável a é atribuído à variável b e, em
 *  seguida, o valor da variável a é aumentado em um. Desta forma, a é 11 e b é 10.
 */

fun main() {
    var a = 10
    val b = a++
    println("Postfix incremento")
    println(a)  // a = 11
    println(b)  // b = 10

/** Da mesma forma, o decremento postfix retorna o seguinte:
 *  Primeiro, o valor da variável c é atribuído à variável d e, em
 *  seguida, o valor da variável c é diminuído em um. Desta forma, c é 9 e d é 10.
 * */

    var c = 10
    val d = c--
    println("Postfix decremento")
    println(c)  // a = 9
    println(d)  // b = 10
}