package inteirosemacao.exercicios

import java.lang.Double.sum

/**
 *  Questão:
 *  Há um inteiro de três dígitos (um inteiro de 100 a 999). Encontre a soma de seus dígitos.
*   Não se esqueça de que você pode obter dígitos em um número com /10e %10.
 */

/**
 *  Qualquer número inteiro quando dividido por 10 o resto no último dígito, o quociente é o dígito restante.
 *  Converter Char para String antes de converter Int para Int
 *  Em vez de converter o caractere para seu valor numérico (por exemplo, '3' → 3), o método "toInt()"
    na verdade converte o Char para o valor Int ASCII correspondente (51)
 */

fun main() {
    val num1 = readln().toInt()
    val result1 = num1 % 10 //476 mod 10 = 6
    val result2 = num1 / 10 // 476 / 10 = 47
    val result3 = result2 % 10 //47 mod 10 = 7
    val result4 = result2 / 10 // 47 / 10 = 4
    val result5 = result4 % 10 // sobra 1
    val sum = result1 + result3 + result5

    println(sum)

//    //println(result1)
//    println(result1)
//    println(result3)
//    println(result5)



}
