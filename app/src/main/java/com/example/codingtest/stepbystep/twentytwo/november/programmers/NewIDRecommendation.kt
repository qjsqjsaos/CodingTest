package com.example.codingtest.stepbystep.twentytwo.november.programmers

import java.lang.StringBuilder

//신규 아이디 추천
class NewIDRecommendation {
    val sb = StringBuilder()

    fun solution(new_id: String): String {
        // 1. 대문자 소문자로 변환
        for (i in new_id) {
            sb.append(Character.toLowerCase(i))
        }
        // 2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        sb.replace(0, sb.length, toRegex("[^a-z0-9-_.]", ""))
        // 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        sb.replace(0, sb.length, toRegex("\\.{2,}", "."))
        // 4.  마침표(.)가 처음이나 끝에 위치한다면 제거
        sb.replace(0, sb.length, toRegex("^[.]|[.]\$", ""))
        // 5. 빈 문자열이라면, new_id에 "a"를 대입합니다.
        sb.ifBlank { sb.replace(0, sb.length, "a") }
        // 6. 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(sb.length >= 16) {
            sb.replace(15, sb.length, "").also {
                sb.replace(0, sb.length, toRegex("[.]\$", ""))
            }
        }
        // 7. 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(sb.length <= 2) {
            while (sb.length < 3) {
                sb.append(sb[sb.length - 1])
            }
        }
        return sb.toString()
    }

    private fun toRegex(regex: String, replacement: String): String = sb.replace(Regex(regex), replacement)
}
