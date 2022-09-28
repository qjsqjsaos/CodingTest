package com.example.codingtest.stepbystep.twentytwo.september.programmers

//행렬의 덧셈
class AdditionOfMatrices {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> =
        arr1.mapIndexed { pIndex, i ->
            i.mapIndexed { cIndex, j ->
                j + arr2[pIndex][cIndex]
            }.toIntArray()
        }.toTypedArray()
}