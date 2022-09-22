package com.example.codingtest.stepbystep.twentytwo.september.programmers

//콜라츠 추측
class CollatzGuess {

    fun solution(num: Int): Int = runCollatz(num.toLong(), 0)

    private tailrec fun runCollatz(n: Long, c: Int): Int =
        when {
            n == 1L -> c
            c > 500 -> -1
            else -> runCollatz(
                if(n.toInt().rem(2) == 0) n.div(2)
                else n.times(3).plus(1), c.plus(1)
            )
        }
}
