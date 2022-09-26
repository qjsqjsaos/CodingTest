package com.example.codingtest.stepbystep.twentytwo.september.programmers

//없는 숫자 더하기
class AddMissingNumbers {
    fun solution(numbers: IntArray): Int = 45 - numbers.sum()
}

//내 풀이
//class Solution {
//    fun solution(numbers: IntArray): Int = (0..9).fold(0) { acc, num ->
//        acc + if(!numbers.contains(num)) num else 0
//    }
//}

