package readline

/**
 * E se precisarmos obter valores mais precisos? Por exemplo, suponha que
 * precisamos saber o preço exato de um litro de gasolina. Nesse caso,
 * não podemos usar toInt()ou toLong()provavelmente não teremos um número inteiro.
 * Para isso, use a função toDouble():
 */

fun main() {
    print("Digite qualquer número do tipo double: ")
    val number = readln().toDouble()
    println()
    println("Você digitou o número: " + number)
    println()
}