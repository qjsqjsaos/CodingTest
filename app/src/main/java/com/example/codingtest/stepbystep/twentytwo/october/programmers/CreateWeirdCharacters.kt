package com.example.codingtest.stepbystep.twentytwo.october.programmers

//이상한 문자 만들기
class CreateWeirdCharacters {
    fun solution(s: String): String = s.split(" ").map { str ->
        str.mapIndexed { index, c ->
            if(index % 2 == 0) c.uppercaseChar() else c.lowercaseChar()
        }.joinToString("")
    }.joinToString(" ")
}