package com.example.codingtest.stepbystep.twentytwo.november.programmers

//숫자 짝꿍
class NumberMate {
}

fun main() {
    val X = "5525"
    val Y = "1255"

    var calX: String
    var calY: String

    if (X.length > Y.length) {
        calX = X
        calY = Y
    } else {
        calX = Y
        calY = X
    }

    val sb = StringBuilder()

    for(x in calX.toCharArray()) {
        y@for(y in calY.toCharArray()) {
            if(x == y) {
                sb.append(y)
                calY = calY.replaceFirst(x.toString(), "")
                break@y
            }
        }
    }

    if (sb.toString() == "") {
        sb.append("-1")
    } else if (sb.count { it.toString() == "0" } >= 2) {
        //0이 2개 이상일 경우
        //0 하나로 교체
        sb.replace(0, sb.length, "0")
    } else {
        //위에 조건이 다 아니라면 내림차순 정렬
        sb.replace(0, sb.length,
            sb.map {
                it.digitToInt()
            }.sortedDescending().joinToString("")
        )
    }

    print(sb.toString())

}

// TODO: 이거 힌트보고 다시 풀어보자..시간초과가 됨 