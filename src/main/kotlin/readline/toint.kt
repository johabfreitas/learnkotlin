package readline

/**
 * Às vezes, precisamos obter dados numéricos do usuário. Por exemplo,
 * suponha que precisamos obter informações sobre a idade ou o ano de
 * graduação do usuário. Para trabalhar com valores numéricos, use a função toInt().
 * Para converter a entrada em um inteiro, use a toInt()sintaxe de função e ponto:
 */

fun main() {
    print("Imprima algum número: ")
    val number = readln().toInt()
    println()
    print("Você imprimiu o número: " + number)
}
