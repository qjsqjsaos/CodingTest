package com.example.codingtest.stepbystep.twentytwo.october.programmers

//키패드 누르기
class KeypadPress {

    var left = intArrayOf(1, 4, 7, 10)
    var right = intArrayOf(3, 6, 9, 12)
    var now = intArrayOf(10, 12) // 왼손 오른손 위치 리셋

    fun solution(numbers: IntArray, hand: String): String {

        var answer = ""
        numbers.forEach {
            answer +=
                when (it) {
                    in left -> {
                        checkLeft(it)
                    }
                    in right -> {
                        checkRight(it)
                    }
                    else -> {
                        checkHand(hand, it)
                    }
                }
        }

        return answer
    }

    private fun checkLeft(n: Int): String {
        now[0] = n
        return "L"
    }

    private fun checkRight(n: Int): String {
        now[1] = n
        return "R"
    }

    private fun checkHand(hand: String, num: Int): String {

        var n = if (num == 0) 11 else num

        var leftDistance = kotlin.math.abs(((now[0] - n) / 3) + ((now[0] - n) % 3))
        var rightDistance = kotlin.math.abs(((now[1] - n) / 3) + ((now[1] - n) % 3))

        return if (leftDistance > rightDistance) {
            checkRight(n)
        } else if (leftDistance < rightDistance) {
            checkLeft(n)
        } else {
            if (hand == "left") checkLeft(n) else checkRight(n)
        }
    }
}