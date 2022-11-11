package com.example.codingtest.stepbystep.twentytwo.november.programmers

import java.lang.StringBuilder

//성격 유형 검사하기
class TestYourPersonalityType {
    //유형 점수 매기기 맵
    val categories = mutableMapOf(
        'R' to 0,
        'T' to 0,
        'C' to 0,
        'F' to 0,
        'J' to 0,
        'M' to 0,
        'A' to 0,
        'N' to 0
    )

    fun solution(survey: Array<String>, choices: IntArray): String {
        //선택지에 따른 점수
        val scores = mapOf(
            1 to 3,
            2 to 2,
            3 to 1,
            4 to 0,
            5 to 1,
            6 to 2,
            7 to 3
        )

        survey.forEachIndexed { i, s ->
            val choice = choices[i]
            var categoryStr: Char

            if(choice < 4) {
                //선택지가 비동의 일때

                //문자열에 첫번째 문자
                categoryStr = s[0]

            } else if(choice > 4) {
                //선택지가 동의 일때

                //문자열에 두번째 문자
                categoryStr = s[1]
            } else {
                //선택지가 4번일때
                //어떤 유형도 점수를 얻지 못한다.
                return@forEachIndexed
            }

            //해당 카테고리에 선택지에 따른 점수 넣어주기
            categories[categoryStr] = categories[categoryStr]!! + scores[choice]!!
        }

        val result = StringBuilder()
            .append(compareCategory('R', 'T'))
            .append(compareCategory('C', 'F'))
            .append(compareCategory('J', 'M'))
            .append(compareCategory('A', 'N')).toString()

        return result

    }

    //두개의 카테고리 중 점수가 더 높은 카테고리를 반환하는 메서드
    //만약 점수가 같다면, 사전순으로 반환
    private fun compareCategory(firstCate: Char, secondCate: Char): Char {
        val firstScore = categories[firstCate] ?: 0
        val secondScore = categories[secondCate] ?: 0

        return if(firstScore > secondScore) {
            firstCate
        } else if(firstScore < secondScore) {
            secondCate
        } else {
            (firstCate + secondCate.toString()).toSortedSet().first()
        }
    }
}