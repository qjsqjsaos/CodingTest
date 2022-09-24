package com.example.codingtest.stepbystep.twentytwo.september.programmers

//나누어 떨어지는 숫자 배열
class DivisibleArrayOfNumbers {
    fun solution(arr: IntArray, divisor: Int): IntArray =
        arr.filter { it % divisor == 0 }
            .sorted()
            .toMutableList()
            .also {
                if(it.isEmpty()) it.add(-1)
            }.toIntArray()
}