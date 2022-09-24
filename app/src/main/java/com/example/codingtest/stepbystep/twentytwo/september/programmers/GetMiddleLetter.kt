package com.example.codingtest.stepbystep.twentytwo.september.programmers

import java.lang.StringBuilder

//가운데 글자 가져오기
class GetMiddleLetter {
    fun solution(s: String): String =
        s.toCharArray()
            .let {
                StringBuilder().apply {
                    val half = s.length / 2
                    if(s.length % 2 == 0) append(it[half - 1]).append(it[half])
                    else append(s[half])
                }
            }.toString()
}