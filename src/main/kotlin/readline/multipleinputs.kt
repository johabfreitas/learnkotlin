package readline

/**Como você pode ver, obter vários valores de diferentes tipos de dados
 * não é difícil. Você só precisa declarar várias variáveis,
 * atribuir a elas a readln()função desejada e exibi-las corretamente no console.
 *
 */

fun main() {
    val a = readln()
    val b = readln().toInt()
    val c = readln()

    print(a)
    print(" ")
    print(b)
    print(" ")
    print(c)
}