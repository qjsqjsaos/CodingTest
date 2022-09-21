package com.example.codingtest.stepbystep.twentytwo.september.programmers

//정수 내림차순으로 배치하기
class PlacingIntegersInDescendingOrder {
    fun solution(n: Long): Long =
        n.toString()
            .toCharArray()
            .sortedDescending()
            .joinToString("")
            .toLong()
}