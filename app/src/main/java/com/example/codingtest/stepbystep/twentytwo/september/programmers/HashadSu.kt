package com.example.codingtest.stepbystep.twentytwo.september.programmers

//하샤드 수
class HashadSu {
    fun solution(x: Int): Boolean {
        val sum = x.toString().map {
            it.toString().toInt()
        }.sum()
        return x % sum == 0
    }
}