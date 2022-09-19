package com.example.codingtest.stepbystep.twentytwo.september.programmers

//자릿수 더하기
class EditDigits {
    fun solution(n: Int): Int {
        var result = 0
        for(i in n.toString().toCharArray()) result += (i - '0')
        return result
    }
}