package com.example.codingtest.stepbystep.twentytwo.october.programmers

//크레인 인형뽑기 게임
class CranePuppetGame {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var disappearCnt = 0

        //바구니 intarray 만들기
        val bucket = IntArray(moves.size)

        var bucketIndex = 0

        moves.forEach { move ->
            val peek = move - 1
            //인형뽑은 자리를 0으로 바꾸어 준다.
            board.firstOrNull { it[peek] != 0 }.also {
                //뽑은 인형이 존재 할때
                if(it != null) {
                    //바구니에 뽑은 인형을 넣어준다.
                    bucket[bucketIndex] = it[peek]
                    //0으로 바꾸어준다.
                    it[peek] = 0
                } else {
                    //존재하지 않으면 넘어가기
                    return@forEach
                }
            }

            //버켓에 같은 인형이 두개 있다면 지워준다.
            if(bucketIndex != 0) {
                val currentDoll = bucket[bucketIndex]
                val beforeDoll = bucket[bucketIndex - 1]
                if(currentDoll == beforeDoll) {
                    bucket[bucketIndex] = 0
                    bucket[bucketIndex - 1] = 0
                    bucketIndex -= 1

                    //사라진 인형 개수 채우기
                    disappearCnt += 2
                } else {
                    bucketIndex++
                }
            } else {
                bucketIndex++
            }
        }
        return disappearCnt
    }
}