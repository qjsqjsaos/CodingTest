package com.example.codingtest.stepbystep.twentytwo.september.programmers

//음양 더하기
class AddYinAndYang {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.foldIndexed(0) { idx, acc, num ->
            acc + if(signs[idx]) num else -num }
}