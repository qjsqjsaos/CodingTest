package com.example.codingtest.stepbystep.twentytwo.october.programmers

//K번째수
class KthNumber {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray =
        commands.map { intArray ->
            array.sliceArray((intArray[0] - 1) until (intArray[1])).sorted()[intArray[2] - 1]
        }.toIntArray()
}