package com.example.codingtest.stepbystep.twentytwo.september.programmers

import kotlin.math.abs

//두 정수 사이의 합
//찾은 답변
class SumBetweenTwoIntegers {
    fun solution(a: Int, b: Int): Long = (abs(a - b) + 1L) * (a + b) / 2
}

//원래 문제풀이
//class Solution {
//    fun solution(a: Int, b: Int): Long {
//        var result = 0L
//        when {
//            a == b -> result = a.toLong()
//            a < b -> for(n in a .. b) result += n
//            a > b -> for(n in b .. a) result += n
//        }
//        return result
//    }
//}