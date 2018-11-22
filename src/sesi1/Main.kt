package sesi1

import java.util.*

//pertemuan pertama
//perbedaan deklarasi dan inisiasi
//deklarasi dan inisiasi variable
val nama: String = "Tricahyo"
val usia: Int = 24
val beratBadan: Double = 57.5
val tinggiBadan: Int = 167
val isStudent: Boolean = false
val pekerjaan: Array<String> = arrayOf("programer", "")
val nilaiPerSemester: Array<Int> = arrayOf(2,3,5,-2)
val hobi: List<String> = listOf("futsal", "basket")
var jeniskelamin: String = "L"

//deklarasi variable
lateinit var namaDepan: String
fun main(args:Array<String>){
    println("Hello World!")
    namaDepan = "Danang"

    println("Nama : $namaDepan $nama")
    println("Usia : $usia")
    println("Berat Badan : $beratBadan")
    println("Seorang Pelajar : $isStudent")
    println("Pekerjaan: ${Arrays.toString(pekerjaan)}")
    println("Nilai  Semester Akhir : ${nilaiPerSemester.last()}")
    println("Hobi: ${hobi.get(1)}")
    println("Jenis Kelamin: $jeniskelamin")
    println("Berat Badan Ideal :${tinggiBadan-100}")
}

