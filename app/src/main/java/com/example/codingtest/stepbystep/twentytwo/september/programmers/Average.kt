package com.example.codingtest.stepbystep.twentytwo.september.programmers


class Average {
    fun solution(arr: IntArray): Double {
        var sum = 0.0
        arr.forEach {
            sum += it
        }
        return sum / arr.size
    }
}
