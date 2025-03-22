package basicSyntax.function

fun main() {
    perkalian(5, 9)
}

// fungsi yang mempunyai value yang tidak memiliki nilai
// Unit return type bisa dihapus karna tidak berpengaruh
fun perkalian(a: Int, b: Int):Unit {
    println("Perkalian $a dan $b menghasilkan: ${a * b}")
}