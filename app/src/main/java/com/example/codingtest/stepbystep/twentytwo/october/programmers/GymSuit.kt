package com.example.codingtest.stepbystep.twentytwo.october.programmers

//체육복
class GymSuit {
}

fun main() {
    val n = 4
    //체육복을 도난당한 학생
    val lost = intArrayOf(3, 4)
    //여벌의 체육복을 가져온 학생
    val reserve = intArrayOf(1, 2, 3, 4)

    val sortedLost = lost.sortedArray()
    val sortedReserve = reserve.sortedArray()

    println(sortedReserve - sortedLost)

    val nLost = sortedLost - sortedReserve
    val nReserve = sortedReserve - sortedLost

    nReserve.forEach {
        when {
            it - 1 in nLost -> nLost.remove(it - 1)
            it + 1 in nLost -> nLost.remove(it + 1)
        }
    }

    print(n - nLost.size)
}

operator fun IntArray.minus(arr: IntArray): MutableList<Int> =
    this.filter { it !in arr }.toMutableList()


// TODO: 풀이를 봤으나, 이해하지 못해 해설을 보자
//https://kinetic27.github.io/2020/03/03/programmers-gym-suit/