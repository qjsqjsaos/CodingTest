package com.example.codingtest.stepbystep.twentytwo.september.programmers

import kotlin.collections.min

//제일 작은 수 제거하기
class RemoveSmallestNumber {
}

// TODO: 문제 푸는중 

fun main() {
    val arr = intArrayOf(4, 3, 2, 1)

    var result = if(arr.size == 1) intArrayOf(-1)
    else arr.filter{ it != arr.min() }.toIntArray()
    print(result)
}