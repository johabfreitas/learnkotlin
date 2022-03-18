package readline

/**
 *Se você precisar ler dois valores em uma linha, você pode usar esta construção:
 * A propriedade split do readln faz essa divisão delimitando por espaço.
 */

/**
 * Descomente o código a baixo para rodar e comente o outro código
 */

//fun main() {
//    val (a, b) = readln().split(" ")
//    println(a)
//    println(b)
//}

/**
 * Lendo mais valores em uma linha
 */

fun main() {
    val (a, b, c, d) = readln().split(" ")
    println(a)
    println(b)
    println(c)
    println(d)
}