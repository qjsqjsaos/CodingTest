package com.example.codingtest.stepbystep.twentytwo.september.programmers

//자연수 뒤집어 배열로 만들기
class FlipNaturalNumbersToFormAnArray {
    fun solution(n: Long): IntArray =
        n.toString()
            .reversed()
            .map { it.toString().toInt() }
            .toIntArray()
}