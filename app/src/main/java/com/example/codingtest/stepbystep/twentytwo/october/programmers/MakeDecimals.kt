package com.example.codingtest.stepbystep.twentytwo.october.programmers

//소수 만들기
class MakeDecimals {
    fun solution(nums: IntArray): Int {

        var answer = 0
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) answer++
                }
            }
        }
        return answer

    }

    fun isPrime(n: Int): Boolean = n > 1 && (2 until n).none { n % it == 0 }
}