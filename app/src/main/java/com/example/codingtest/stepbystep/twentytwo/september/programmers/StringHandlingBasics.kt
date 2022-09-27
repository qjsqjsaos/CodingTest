package com.example.codingtest.stepbystep.twentytwo.september.programmers

//문자열 다루기 기본
class StringHandlingBasics {
    fun solution(s: String): Boolean = (s.length == 4 || s.length == 6) && s.toIntOrNull() != null
}
