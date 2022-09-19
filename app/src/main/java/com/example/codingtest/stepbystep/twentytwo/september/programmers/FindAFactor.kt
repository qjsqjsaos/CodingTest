package com.example.codingtest.stepbystep.twentytwo.september.programmers

//약수의 합
class FindAFactor {
    fun solution(n: Int): Int {
        var count = 0
        for(i in 1..n) if(n % i == 0) count += i
        return count
    }
}