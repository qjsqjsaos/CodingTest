package com.example.codingtest.stepbystep.twentytwo.september.programmers

//x만큼 간격이 있는 n개의 숫자
class NNumbersSpacedByX {
    fun solution(x: Int, n: Int): LongArray = LongArray(n) { x.toLong() * (it + 1) }
}