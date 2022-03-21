package incrementoedecremento

/**
 *  1.Parênteses ( (expr) );
    2.Incremento/decremento pós-fixado ( expr++, expr--);
    3.Mais/menos unário, incremento/decremento de prefixo ( -expr, ++expr, --expr );
    4.Multiplicação, divisão e módulo ( *, /, %);
    5.Adição e subtração ( +, - );
    6.Operações de atribuição ( =, +=, -=, *=, /=, %= ).
 */

fun main() {
//    val a = 2
//    var b = 3
//    val c = a + 4 * --b
    println("""Na expressão, primeiro resolvo o decremento prefixo,
segundo a multiplicação e terceiro a adição""")
    //println(c)   // this is 10
    println()
    var a = 5
    val b = 9
    val c = 3
    val d = a++ + (b / 2) - c - 4
    println(d)   // this is 2

    /**
     * Você deve está se perguntando pq o resultado final é dois? Lembra da operação pós fixada, primeiro
     * o valor da variável A está sendo atribuído como 5 a variável D logo ela não é incrementada.
     * Se ela fosse atribuída como prefixada aí sim, o valor iria ser atribuído como 6.
     */
}