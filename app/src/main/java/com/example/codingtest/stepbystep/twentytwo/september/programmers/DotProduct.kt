package com.example.codingtest.stepbystep.twentytwo.september.programmers

//내적
class DotProduct {
    fun solution(a: IntArray, b: IntArray): Int =
        a.foldIndexed(0) { idx, acc, num ->
            acc + num * b[idx]
        }
}