package incrementoedecremento

/**
 *  Além disso, existem operações de atribuição compostas que
 *  combinam operações aritméticas e atribuições. O operador de atribuição tem várias
 *  formas que o combinam com uma operação para evitar repetir a variável duas vezes:=
 *   +=atribuição após adição: A += B é igual a A = A + B
 *   -=atribuição após a subtração: A -= B é igual a A = A - B
 *   *=atribuição após a multiplicação: A *= B é igual a A = A * B
 *   /=atribuição após divisão: A /= B é igual a A = A / B
 *   %=atribuição do resto após a divisão: A %= B é igual a A = A % B
 */

fun main() {
    var a:Int = 3
    print("a += 2 = ") // 5
    a += 2 // 5
    println(a)

    print("a -= 2 = ")
    a -= 2 // 3
    println(a)

    print("a *= 2 = ")
    a *= 2 // 6
    println(a)

    print("a /= 2 = ")
    a /= 2 // 3
    println(a)

    print("a %= 2 = ")
    a %= 2 // 1
    println(a)

/**
*   Aqui, realizamos cálculos com o número 2 e nossa variável ae, em seguida,
 *   atribuímos os valores a ela. Como você pode ver, essas operações
 *   tornaram o código mais curto e claro. Os operadores de atribuição compostos
 *   podem ser aplicados apenas a uma variável que já está definida e não
 *   podem ser usados ​​para declarar uma nova variável:
 *
 *   var a: Int
 *   a += 5 // compile-time error, Variable 'a' must be initialized
*/


}