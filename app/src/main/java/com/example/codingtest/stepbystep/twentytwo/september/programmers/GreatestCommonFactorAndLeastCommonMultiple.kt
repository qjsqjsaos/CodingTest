package com.example.codingtest.stepbystep.twentytwo.september.programmers

//최대공약수와 최소공배수
class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val gcd = gcd(n, m)
        return intArrayOf(gcd, n * m / gcd)
    }

    private tailrec fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}