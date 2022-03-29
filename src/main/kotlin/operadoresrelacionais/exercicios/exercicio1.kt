package operadoresrelacionais.exercicios

/**
 * Marmotas gostam de dar festas divertidas e, em suas festas, gostam de mastigar os copos de
 * manteiga de amendoim de Reese. Mas não muito, ou eles vão se sentir doentes! Uma festa de marmota bem-sucedida deve
 * ter entre 10 e 20 xícaras de manteiga de amendoim de Reese (inclusive), a menos que seja o fim de semana.
 * Nesse caso, eles precisam de 15 a 25 xícaras de manteiga de amendoim Reeses (inclusive).
    Escreva um programa Kotlin que leia dois valores:
    o primeiro é o número de xícaras de manteiga de amendoim de Reese;
    o segundo é um valor booleano que representa se é fim de semana ou não.
    Emita o valor booleano que nos diz se a festa foi bem-sucedida ou não.
 */

fun main() {
    val cups = readln()!!.toInt()
    val weekend = readln().toBoolean()

    val inRange = weekend == true && cups >= 15 && cups <= 25 || weekend == false && cups >= 10 && cups <= 20


    println(inRange)
}