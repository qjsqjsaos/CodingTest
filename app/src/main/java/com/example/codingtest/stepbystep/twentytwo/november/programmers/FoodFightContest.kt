package com.example.codingtest.stepbystep.twentytwo.november.programmers

import java.lang.StringBuilder

//푸드 파이트 대회
class FoodFightContest {
    fun solution(food: IntArray): String {
        val sb = StringBuilder()
        for(i in 1 until food.size) {
            val foodNum = food[i]
            val cnt = foodNum / 2
            repeat(cnt) {
                sb.append(i)
            }
        }
        sb.append(0)
        sb.append(sb.replaceFirst(Regex("0"), "").reversed())
        return sb.toString()
    }
}