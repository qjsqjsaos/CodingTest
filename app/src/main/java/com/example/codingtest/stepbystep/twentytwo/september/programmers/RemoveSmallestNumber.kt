package com.example.codingtest.stepbystep.twentytwo.september.programmers

//제일 작은 수 제거하기
class RemoveSmallestNumber {
    fun solution(arr: IntArray): IntArray {
        return if(arr.size == 1) intArrayOf(-1)
        else arr.filter {  it != arr.minOrNull() }.toIntArray()
    }
}