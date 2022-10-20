package com.example.codingtest.stepbystep.twentytwo.october.programmers

import java.lang.Math.abs
import java.lang.StringBuilder
import kotlin.math.absoluteValue

//키패드 누르기
class KeypadPress {
}

fun main() {
    val numbers = intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5)
    val hand = "right"
    val sb = StringBuilder()
    //키패드 0번은 4라는 밸류를 준다.(배열 사이즈가 하나라 다른 3개의 요소 배열들과 계산이 다르다)
    val padNum = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9), intArrayOf(0))

    //왼손 위치 (첫위치 -1)
    var leftPos: Pair<Int, Int> = -1 to -1
    //오른손 위치 (첫위치 -1)
    var rightPos: Pair<Int, Int> = -1 to -1

    "LRLLLRLLRRL"
    numbers.forEach { n -> //누른 숫자

        loop@ for(i in padNum) {
            for(j in i.indices) {
                if(padNum[padNum.indexOf(i)][j] == n) {
                    // 패드 번호 전체 배열 및 인덱스
                    val firstIndex = padNum.indexOf(i)
                    val secondIndex = j

                    //각 손이 첫위치가 -1일때
                    if(leftPos.first == -1 && secondIndex == 0) {
                        //두번쨰 인덱스가 0이면 왼손
                        sb.append("L")
                        leftPos = leftPos.copy(first = firstIndex, second = secondIndex)
                    } else if(rightPos.first == -1 && secondIndex == 2) {
                        //두번째 인덱스가 2이면 오른손
                        sb.append("R")
                        rightPos = rightPos.copy(first = firstIndex, second = secondIndex)
                    } else if(rightPos.first == -1 && secondIndex == 1) {
                        //가운데 숫자패드라면
                        //어느손잡이인지 따라 정한다.
                        if(hand == "right") {
                            sb.append("R")
                            rightPos = rightPos.copy(first = firstIndex, second = secondIndex)
                        } else {
                            sb.append("L")
                            leftPos = leftPos.copy(first = firstIndex, second = secondIndex)
                        }
                    } else {
                        //첫 실행이 아닐때

                        //왼손 위치 인덱스들의 합
                        val leftPosSum = leftPos.first + leftPos.second
                        //오른손 위치 인덱스들의 합
                        val rightPosSum = rightPos.first + rightPos.second


                        //firstIndex가 3일때 키패드 0이다.
                        val keypadPosSum: Int = if(firstIndex == 3) {
                            //만약 키패드가 0을 눌렀을때는 값이 달라진다. -> 4로 해주어야함.
                            4
                        } else {
                            //0이 아니라면 다음과 같이 계산한다.
                            //현재 눌러진 키패드 인덱스들의 합
                            firstIndex + secondIndex
                        }

                        //키패드 합 - 왼손(절대값)
                        val keyMinusLeft = kotlin.math.abs(keypadPosSum - leftPosSum)
                        //키패드 합 - 오른손(절대값)
                        val keyMinusRight = kotlin.math.abs(keypadPosSum - rightPosSum)

                        //두 값을 비교할 때 더 작은 값이 현재 키패드 위치랑 더 가까운 것이다.

                        //먼저 첫번째 인덱스와 두번째 인덱스를 비교해준다.
                        if(firstIndex > secondIndex) {
                            sb.append("L")
                            leftPos = leftPos.copy(first = firstIndex, second = secondIndex)
                        } else if(firstIndex < secondIndex) {
                            //오른손이 더 가까울 때
                            sb.append("R")
                            rightPos = rightPos.copy(first = firstIndex, second = secondIndex)
                        } else {
                            if(keyMinusLeft > keyMinusRight) {
                                //오른손이 더 가까울 때
                                sb.append("R")
                                rightPos = rightPos.copy(first = firstIndex, second = secondIndex)

                            } else if(keyMinusLeft < keyMinusRight) {
                                //왼손이 더 가까울 때
                                sb.append("L")
                                leftPos = leftPos.copy(first = firstIndex, second = secondIndex)
                            } else {
                                //둘 다 가까운 거리가 같을 때
                                //어느 손잡이냐의 따라서 정한다.
                                if(hand == "right") {
                                    sb.append("R")
                                    rightPos = rightPos.copy(first = firstIndex, second = secondIndex)
                                } else {
                                    sb.append("L")
                                    leftPos = leftPos.copy(first = firstIndex, second = secondIndex)
                                }
                            }
                        }
                    }
                    break@loop
                }
            }
        }
    }

    print(sb.toString())


}

// TODO: 답안 보기 ㅠㅠ 