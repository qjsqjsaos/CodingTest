package com.example.codingtest.stepbystep.twentytwo.october.programmers

//두 개 뽑아서 더하기
class TakeTwoAndAdd {
    fun solution(numbers: IntArray): IntArray =
        numbers.withIndex().flatMap { i -> numbers.withIndex().map { j -> i to j } }
            .filter { it.first.index != it.second.index }
            .map { it.first.value + it.second.value }
            .toSortedSet()
            .toIntArray()
}
