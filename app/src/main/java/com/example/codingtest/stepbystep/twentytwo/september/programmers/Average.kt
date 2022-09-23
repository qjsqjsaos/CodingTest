package com.example.codingtest.stepbystep.twentytwo.september.programmers

//평군 구하기
class Average {
    fun solution(arr: IntArray): Double {
        var sum = 0.0
        arr.forEach {
            sum += it
        }
        return sum / arr.size
    }
}
