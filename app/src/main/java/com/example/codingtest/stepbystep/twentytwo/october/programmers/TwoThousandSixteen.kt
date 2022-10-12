package com.example.codingtest.stepbystep.twentytwo.october.programmers

import java.time.LocalDate

//2016년
class TwoThousandSixteen {
    fun solution(a: Int, b: Int): String {
        val date = LocalDate.of(2016, a, b)
        val dayOfWeek = date.getDayOfWeek()
        val dayOfWeekNumber = dayOfWeek.getValue()

        var strWeek: String? = null

        strWeek = when (dayOfWeekNumber) {
            1 -> "MON"
            2 -> "TUE"
            3 -> "WED"
            4 -> "THU"
            5 -> "FRI"
            6 -> "SAT"
            else -> "SUN"
        }
        return strWeek
    }
}