package incrementoedecremento.`exercicios `

fun main() {
    var num = 0
        num = num++
    println(num)

    /**
     *  O incremento é executado primeiro, num++ retorna 0 e num é 1.
     *  Em seguida, a atribuição é executada num = 0. Portanto, a resposta é 0.
     */
}