package com.example.codingtest.stepbystep.twentytwo.september.programmers

//약수의 개수와 덧셈
class NumberAndAdditionOfFactors {
    fun solution(left: Int, right: Int): Int =
        (left..right).sumOf { i -> if ((1..i).filter { i % it == 0 }.size % 2 == 0) i else -i }
}

//내 풀이
//class Solution {
//    fun solution(left: Int, right: Int): Int {
//    var cnt: Int
//    var result = 0
//    for(i in left..right) {
//        cnt = 0
//
//        for(j in 1..i) if(i % j == 0) cnt++
//
//        if(cnt % 2 == 0) result += i
//        else result -= i
//
//        }
//        return result
//    }
//}