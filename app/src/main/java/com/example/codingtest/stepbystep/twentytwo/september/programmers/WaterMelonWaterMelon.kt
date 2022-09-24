package com.example.codingtest.stepbystep.twentytwo.september.programmers

import java.lang.StringBuilder

//수박수박수박수박수박수?
class WaterMelonWaterMelon {
    fun solution(n: Int): String =
        String(CharArray(n) { i -> if (i % 2 == 0) '수' else '박' })
}


//내 첫 문제 풀이
//StringBuilder().apply {
//    repeat(n) {
//        append(if(it % 2 == 0) "수" else "박")
//    }
//}.toString()