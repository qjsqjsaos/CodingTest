package com.example.codingtest.stepbystep.twentytwo.october.programmers

//삼총사
class ThreeMusketeers {
    fun solution(number: IntArray): Int {
        var cnt = 0
        for (i in 0 until number.size - 2) {
            for (j in i + 1 until number.size - 1) {
                for (k in j + 1 until number.size) {
                    if ((number[i] + number[j] + number[k]) == 0) cnt++
                }
            }
        }
        return cnt
    }
}