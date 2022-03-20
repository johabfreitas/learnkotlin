package operadoresaritmeticos.exercicios

/**
 *  Suponha que você tenha o seguinte valor Int positivo: val n = 5678.
 *  Como podemos calcular o terceiro ao último dígito do número (a casa dos 100)?
 *  Neste caso, é 6.Escolha as opções de resposta corretas:
 */

fun main() {
    val n = 5678

    println(n / 1000 / 10)

    println(n / 10 / 10)

    println(n / 100 % 10)

    println(n % 1000 / 100)

}