package operadoresaritmeticos.exercicios

/**
 *  Suponha que você tenha o seguinte valor Int positivo: val n = 12345.
 *  Como podemos calcular os dois dígitos mais à esquerda (12)?
 *  Escolha as opções de resposta corretas:
 */

fun main() {
    val n = 12345

    println(n / 10 % 100)
    println(n / 1000)
    println(n % 100)
    println((20 / 3) + (4 * 3))
}