package com.example.codingtest.stepbystep.twentytwo.november.programmers

//옹아리 (2)
class Babbling2 {
    fun solution(babbling: Array<String>): Int {
        //할수 있는 발음
        val babblingBabyCan = arrayOf("aya", "ye", "woo", "ma")

        val sb = StringBuilder()

        var cnt = 0

        babbling.forEach { bab ->
            sb.append(bab)
            for(canBab in babblingBabyCan) {

                //만약 같은 발음 연속으로 되면 그건 해당 안됨
                if(sb.contains(Regex("$canBab$canBab"))) {
                    break
                }

                //이렇게 둔 이유는 replace 과정 중에 myea 같이
                //ye를 먼저 지우고, 그 사이가 없어져 ma도 같이 없어지는 경우를 방지하기
                //위해서이다.
                replace(sb, canBab, " ")
            }

            //위해서 주었던 띄어쓰기를 빈칸으로 바꾼다.
            replace(sb, " ", "")

            if(sb.toString() == "") {
                cnt++
            }
            sb.clear()
        }
        return cnt
    }

    private fun replace(sb: StringBuilder, old: String, new: String) = sb.replace(0, sb.length, sb.toString().replace(old, new))

}