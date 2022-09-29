package com.example.codingtest.stepbystep.twentytwo.september.programmers

//부족한 금액 계산하기
class CalculateTheShortfall {
    fun solution(price: Int, money: Int, count: Int): Long =
        (1..count).sumOf { it * price.toLong() }.let { if (money > it) 0 else it - money }
}

//내풀이
//        class Solution {
//            fun solution(price: Int, money: Int, count: Int): Long =
//                (1..count).foldIndexed(0L) { idx, acc, i ->
//                    acc + (price * i)
//                }.minus(money).let {
//                    if(it < 0) 0 else it
//                }
//        }