package com.example.codingtest.stepbystep.twentytwo.september.programmers

//음양 더하기
class AddYinAndYang {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.also {
            signs.mapIndexed { i, b ->
                if(!b) it[i] *= -1
            }
        }.sum()

    // TODO: 더 효율적인 foldIndexed에 대해 더 알아보고 풀이 마무리 하기 
}

fun main() {
    val intArr = intArrayOf(4, 7, 12)
    val boolArr = booleanArrayOf(true, false, true)
    val result = intArr.foldIndexed(0) {
            idx, acc, num -> if (boolArr[idx]) num else -num  }
    print(result)
}