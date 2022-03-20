package operadoresaritmeticos.exercicios

/**
 * Suponha que você tenha o seguinte valor Int positivo: val n = 1234.
 * Como podemos calcular o penúltimo dígito do número (a casa dos 10)?
 * Neste caso, é 3.Escolha as opções de resposta corretas:
 */
fun main() {
    val n = 1234

    println(n % 100 / 10)

    println(n / 10 % 10)

    // println(n // 100)

    //println(n % 10 / 10)

}