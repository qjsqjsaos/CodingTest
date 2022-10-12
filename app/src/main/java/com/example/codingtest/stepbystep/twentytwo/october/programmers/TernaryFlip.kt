package com.example.codingtest.stepbystep.twentytwo.october.programmers

import java.lang.StringBuilder

//3진법 뒤집기
class TernaryFlip {
    fun solution(n: Int): Int = n.toString(3).reversed().toInt(3)
}