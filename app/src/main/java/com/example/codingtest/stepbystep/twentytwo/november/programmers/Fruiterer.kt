package com.example.codingtest.stepbystep.twentytwo.november.programmers

//과일 장수
class Fruiterer {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var sum = 0

        score.sortedArrayDescending().also { arr ->
            repeat(arr.size / m) { i ->

                val start = i * m
                val end = start + m

                arr.copyOfRange(start, end).also { copy ->
                    sum += (copy.minOrNull() ?: 1) * m
                }
            }
        }
        return sum
    }
}