package tipoexpressaonumerica

/**
 * Embora resultseja apenas 1100, é a soma de Long e Int variáveis, portanto,
 * o tipo é convertido automaticamente para Long.
 * Se você tentar declarar um resultado como Int, receberá um erro
 * porque não pode atribuir o valor do tipo Long a uma variável Int .
 * Você pode atribuir apenas um Intvalor ou um número inteiro a uma
 * variável do tipo Int.
 */

fun main() {
    println("Int para Long")
    val num: Int = 100
    val longNum: Long = 1000
    val result = num + longNum // 1100, Long
    println("" + result + " Tipo Long ")
    println()

    println("De Long para Double:")
    val bigNum: Long = 100000
    val doubleNum: Double = 0.0
    val bigFraction = bigNum - doubleNum
    println("" + bigFraction + " Tipo Double")
    println()

    println("Byte e Byte")
    val one: Byte = 1
    val two: Byte = 2
    val three = one + two // 3, Int
    println("" + three + " Tipo Int")
    println()

    println("Short e Short")
    val fourteen: Short = 14
    val ten: Short = 10
    val four = fourteen - ten // 4, Int
    println("" + four + " Tipo Int")
    println()

    println("Short e Byte")
    val hundred: Short = 100
    val five: Byte = 5
    val zero = hundred % five // 0, Int
    println("" + zero + " Tipo Int")
    println()

    /**
     * O que devemos fazer se quisermos somar duas Byte variáveis
     * e obter um Byte resultado? Temos que fazer a conversão de tipo
     */

    println("Byte e Byte")
    val onE: Byte = 1
    val fivE: Byte = 5
    val siX = (one + five).toByte() // 6, Byte
    println("" + siX + " Tipo Byte")
    println()

    val s0:Short = 10
    val n: Int = s0.toByte() + 2
    println(n)
    println()

    val l0:Long = 14
    val f: Float = l0.toFloat() + 1
    println(f)

    val b0: Byte = 2
    val s0: Short = 10
    val n0: Int = 5
    val l0: Long = 14
    val f0: Float = 11.4f

    val b: Byte = 5                 //1
    val s: Short = 2 + b0           //2
    val n: Int = s0.toByte() + 2    //3
    val l: Long = n0 + 4            //4
    val f: Float = l0.toFloat() + 1 //5
    val d: Double = f0 / 1          //6

}