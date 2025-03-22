package basicSyntax.function

// tempat untuk memanggil fungsi yang sudah didefinisikan
fun main() {
    println("Jumlah dari 2 + 10 adalah : ${penjumlahan(2, 10)}")
}

// bentuk fungsi yang tidak memiliki function body, function body nya berupa persamaan
fun penjumlahan(a: Int, b: Int) = a + b