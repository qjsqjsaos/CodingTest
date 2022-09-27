package com.example.codingtest.stepbystep.twentytwo.september.programmers

//문자열 내림차순으로 배치하기
class PlacingStringsInDescendingOrder {
    fun solution(s: String): String = String(s.toCharArray().sortedArrayDescending())
}