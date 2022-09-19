package com.example.codingtest.stepbystep.twentytwo.september.programmers


//class Average {
//    fun solution(arr: IntArray): Double {
//        var sum = 0.0
//        arr.forEach {
//            sum += it
//        }
//        return sum / arr.size
//    }
//}

fun main() {
    var intArr = (1..10000000).toList().toIntArray()
    unBuiltInFunction(intArr)
    builtInFunction(intArr)
}

//내장함수를 사용하지 않을때
fun unBuiltInFunction(intArr: IntArray) {
    val before = System.currentTimeMillis()
    var sum = 0.0
    intArr.forEach {
        sum += it
    }
    println("unBuiltInFunction value : ${sum / intArr.size}")
    val after = System.currentTimeMillis()
    println("unBuiltInFunction time : ${after - before} m/s")
}

//내장함수를 사용할 때
fun builtInFunction(intArr: IntArray) {
    val before = System.currentTimeMillis()
    println("builtInFunction value : ${intArr.average()}")
    val after = System.currentTimeMillis()
    print("builtInFunction time : ${after - before} m/s")
}
