package basicSyntax.readFromStandardInput

import kotlin.time.times

fun main() {
//    Inisialisasikan nilai 0.5 didalam variabel setengah
    val setengah = 0.5

    println("Rumus menghitung Luas Segitiga")

//    Baris kode untuk memasukkan nilai Alas
    println("Masukkan nilai Alas : ")
    val storeAlas = readln().toDouble()

//    Baris kode untuk memasukkan nilai tinggi
    println("Masukan nilai tinggi : ")
    val storeTinggi = readln().toDouble()

//    Variabel yang menyimpan rumus luas segitiga
    val luasSegitiga = setengah * storeAlas * storeTinggi

//    Step terakhir sekaligus pemanggilan rumus luas segitiga
    println("Luas Segitiga diatas adalah : $luasSegitiga")
}