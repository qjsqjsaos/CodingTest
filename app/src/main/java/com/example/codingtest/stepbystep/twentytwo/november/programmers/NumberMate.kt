package com.example.codingtest.stepbystep.twentytwo.november.programmers

//숫자 짝꿍
class NumberMate {
    fun solution(X: String, Y: String): String {
        val answer = StringBuilder()

        val arrX = IntArray(10)
        val arrY = IntArray(10)

        countNumInArr(X, arrX)
        countNumInArr(Y, arrY)

        for (i in arrX.indices.reversed()) {
            while (arrX[i] >= 1 && arrY[i] >= 1) {
                arrX[i]--
                arrY[i]--
                answer.append(i)
            }
        }

        val result = if (answer.toString() == "") {
            "-1"
        } else if (answer.toString().startsWith("0")) {
            "0"
        } else {
            answer.toString()
        }
        return result
    }

    private fun countNumInArr(str: String, arr: IntArray) {
        for (element in str) {
            val index = element - '0'
            arr[index]++
        }
    }
}