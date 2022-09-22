package com.example.codingtest.stepbystep.twentytwo.september.programmers

//나머지가 1이 되는 수 찾기
class FindANumberWhoseRemainderIs1 {
    fun solution(n: Int): Int {
        var x = 1
        while(true) if(n.rem(++x) == 1) break
        return x
    }
}