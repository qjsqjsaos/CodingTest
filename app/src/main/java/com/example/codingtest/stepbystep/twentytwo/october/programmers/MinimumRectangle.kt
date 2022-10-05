package com.example.codingtest.stepbystep.twentytwo.october.programmers

//최소직사각형
class MinimumRectangle {
    fun solution(sizes: Array<IntArray>): Int {
        val sorted = sizes.map { it.sorted() }
        return (sorted.map { it[0] }.maxOrNull() ?: 0) * (sorted.map { it[1] }.maxOrNull() ?: 0)
    }
}