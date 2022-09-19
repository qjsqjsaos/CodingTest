package com.example.codingtest.stepbystep.twentytwo.september.programmers

import kotlin.math.pow
import kotlin.math.sqrt

//정수 제곱근 판별
class DetermineTheSquareRootOfAnInteger {
    fun solution(n: Long): Long {
        val squareRoot = sqrt(n.toDouble()).toLong()
        return if(squareRoot * squareRoot == n) (squareRoot + 1).toDouble().pow(2).toLong()
        else -1
    }
}