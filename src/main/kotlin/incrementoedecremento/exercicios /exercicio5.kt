package incrementoedecremento.`exercicios `

/**
 * No código a seguir, organize as operações na ordem de execução:
 * Ordem: -, ++, %, +, *=
*/

fun main() {
    var a = 5
    val b = 9
    val c = 11
    var d = 1
    d *= ++a + b%(c - 3) // order of execution in this line
    println(d)
}