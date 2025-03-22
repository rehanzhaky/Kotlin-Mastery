package basicSyntax.variable

fun main() {
//    Keyword var
    var y = 8
    println("Nilai dari variabel y pertama kali adalah $y")

//    ketika menggunakan keyword var, kita bisa mengganti value dari variabel yang awal nya sudah kita tentukan
    y = 10
    println("Nilai dari variabel y setelah diubah adalah $y")

//    kita boleh tidak menjelaskan type data nya, karna kotlin dapat otomatis membaca tipe data
    val a = 8
    println(a)

//    kita mendeklarasikan nya tanpa inisialisasi maka kita harus menspesifikasikan tipe data nya
    val b: Int
//    baru kemudian kita isikan value nya, sesuai tipe data yang sudah dideklarasikan
    b = 0
    println(b)
}