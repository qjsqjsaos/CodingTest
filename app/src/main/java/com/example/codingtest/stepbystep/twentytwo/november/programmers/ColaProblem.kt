package com.example.codingtest.stepbystep.twentytwo.november.programmers

//콜라 문제
class ColaProblem {
    fun solution(a: Int, b: Int, n: Int): Int {
        //가지고 있는 빈병 갯수
        var empty = n
        //받은 콜라 개수
        var recieved = 0
        while (empty > a - 1) {
            //몫
            val share = (empty / a) * b
            //나머지
            val remainder = empty % a
            //남은 콜라수
            empty = share + remainder
            //받은 콜라수
            recieved += share
        }
        return recieved
    }
}