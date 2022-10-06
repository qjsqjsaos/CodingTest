package com.example.codingtest.stepbystep.twentytwo.october.programmers

//문자열 내 마음대로 정렬하기
class SortingStringsMyOwnWay {
    fun solution(strings: Array<String>, n: Int): Array<String> =
        strings.sortedWith(
            compareBy(
                { it[n] },
                { it }
            )
        ).toTypedArray()
}