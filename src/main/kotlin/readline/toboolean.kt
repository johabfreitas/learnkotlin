package readline

fun main() {
    print("A terra é plana. Digite true ou false: ")
    val answer = readln().toBoolean()
    print("A terra plana: É " + answer)
}