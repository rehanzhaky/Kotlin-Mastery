package basicSyntax.function

// tempat untuk memanggil function yang sudah kita buat
fun main() {
    println("Total 3 - 5 adalah : ${pengurangan(3,5)}")
}

// function yang mempunyai body block
fun pengurangan(a: Int, b: Int): Int {
    return a - b
}