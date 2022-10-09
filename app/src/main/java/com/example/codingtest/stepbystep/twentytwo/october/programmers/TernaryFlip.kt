package com.example.codingtest.stepbystep.twentytwo.october.programmers

import java.lang.StringBuilder

//3진법 뒤집기
class TernaryFlip {
    fun solution(n: Int): Int = n.toString(3).reversed().toInt(3)
}

fun main() {
    val my_string = "hello"
    val num1 = 1
    val num2 = 2
    val result = StringBuilder(my_string).also {
        it.setCharAt(num1, my_string[num2])
        it.setCharAt(num2, my_string[num1])
    }
    print(result)
}