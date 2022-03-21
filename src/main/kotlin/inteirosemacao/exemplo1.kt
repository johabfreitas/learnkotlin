package inteirosemacao

/**
 *  A readln()parte é responsável pela leitura dos dados. Funciona para números positivos,
 *  negativos e zero porque o Inttipo suporta todos eles.
 */

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    val sum = a + b

    println(sum)
}

/**
 *  Se soubermos que os números de entrada podem ser grandes, podemos ler Longsem vez de Ints:
 *  val a = readln().toLong()
 *  val b = readln().toLong()
 */
