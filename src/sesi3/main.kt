package sesi3

import java.util.*

fun main(args:Array<String>){
    //blockList()
    //blockArray()
    blockMap()
    //blockLooping()
}
fun blockLooping(){
    //for
    var star = "*"
    for (i in 4 downTo 0){
        println(star)
        star += "*"

    }

    //for dalam for
    for(i in 0 ..10){
        for(j in 0 .. 2){
            println("$i. = $j")
            if (i==5) break
        }
    }


    //while
    var x = 0
    while (x<5){
        println("x:$x")
        x++
    }


    //do while
    var y = 0
    do {
        println("y : $y")
        y++
    }while (y<5)
}

fun blockList(){
    val staticList: List<String> = listOf("Ilham","Faisal","Ardi")
    println("Static List: $staticList")
    val dynamicList:MutableList<String> = mutableListOf("Ilham","Faisal","Ardi")
    dynamicList.add("Ahmad")
    dynamicList.add("Putri")
    dynamicList.add("Putra")
    dynamicList.add("Dewi")
    dynamicList.removeAt(0)
    dynamicList.remove("Dewi")
    dynamicList.set(1,"Rio")
    dynamicList.addAll(staticList)
    dynamicList.sortBy { it }
    println("Dinamis List : $dynamicList")

    dynamicList.forEachIndexed{index, data ->
        println("Data Ke-${index.plus(1)} : $data")
    }

}

fun blockMap(){
    val map = mapOf(Pair(0,"Ilham"),Pair(10,"Ahmad"),Pair(3,"Tri"))
    println(map)

    //mutable/dynamic map
    val mMap = mutableMapOf<Int, String>()
    mMap[1] = "Joko"
    mMap[11] = "Rizal"
    mMap[13] = "Cahyo"
    println(mMap)
}

fun blockArray(){
    //blockArray
    // deklarasi array string dengan jumlah data (size5):5
    val strings: Array<String> = Array(size= 5, init ={index-> "Index #$index"})
    println(Arrays.toString(strings))
    strings.forEach { item->
        println("Data : $item")
    }
    (0..4).forEach{
        println("Nilai Awal:${strings[it]}")
        strings[it]= "Data $it"
        println("menjadi ${strings[it]}")
    }

    //list
    val list: List<String> = listOf("Ilham", "Faisal", "Ardi")
    println("List: $list")

}