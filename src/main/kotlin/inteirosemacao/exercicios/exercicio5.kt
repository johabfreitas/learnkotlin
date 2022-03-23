package inteirosemacao.exercicios

/**
 * Escreva um programa que ajude as pessoas que vão de férias. O programa deve
 * calcular a soma total (em $) necessária para um determinado período de férias.
    Considere quatro parâmetros:
    duração em dias
    custo total de alimentos por dia
    custo de voo só de ida
    custo de uma noite em um hotel (o número de noites é a duração menos uma)
    Leia os valores desses parâmetros da entrada padrão e imprima o resultado.
    Não se esqueça da passagem de volta.


 */

fun main() {
    var ndays = readln().toInt()
    val nfood = readln().toInt()
    val cvoo = readln().toInt()
    val cdaily = readln().toInt()
    val result = ndays * nfood + --ndays * cdaily + cvoo * 2

    println(result)
}