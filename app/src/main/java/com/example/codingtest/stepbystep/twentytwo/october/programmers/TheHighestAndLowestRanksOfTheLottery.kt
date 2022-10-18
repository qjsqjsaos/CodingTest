package com.example.codingtest.stepbystep.twentytwo.october.programmers

//로또의 최고 순위와 최저 순위
class TheHighestAndLowestRanksOfTheLottery {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val map = mapOf(
            6 to 1,
            5 to 2,
            4 to 3,
            3 to 4,
            2 to 5
        )

        //최고 맞춘 수
        var bestCnt = 0
        //최저 맞춘 수
        var lowestCnt = 0
        //0의 갯수
        var zeroCnt = 0

        lottos.forEach { l ->
            if(l != 0) {
                if(win_nums.contains(l)) lowestCnt++
            } else {
                zeroCnt++
            }
        }
        //0의 갯수와 최저로 맞춘 수를 합친 것이 최고로 맞춘 수이다.
        bestCnt = zeroCnt + lowestCnt
        return intArrayOf(map[bestCnt] ?: 6, map[lowestCnt] ?: 6)
    }
}