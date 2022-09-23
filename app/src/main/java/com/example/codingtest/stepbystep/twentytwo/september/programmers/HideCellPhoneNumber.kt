package com.example.codingtest.stepbystep.twentytwo.september.programmers

//핸드폰 번호 가리기
class HideCellPhoneNumber {
    fun solution(phone_number: String): String =
        phone_number.mapIndexed { index, c ->
            if (phone_number.length - 5 < index) c else "*"
        }.joinToString(separator = "")
}