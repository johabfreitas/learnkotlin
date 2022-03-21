package incrementoedecremento

/**
 * Na função abaixo a variável num é declarada com o valor 3(num=3) e em seguida é acrescentado
 * mais 1(incremento ++), fica num=4, depois ela é diminuída em menos 1(decrementada --),
 * num=4 ficou valendo num=3 novamente.
 */

fun main() {
    var num = 3
    num++ //incremento
    println(num)
    num-- //decremento
    println(num)
}