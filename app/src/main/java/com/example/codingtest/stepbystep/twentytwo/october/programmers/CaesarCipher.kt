package com.example.codingtest.stepbystep.twentytwo.october.programmers

//시저암호
class CaesarCipher {
    fun solution(s: String, n: Int): String = s.map {
        when (it) {
            in 'A'..'Z' -> it.caesar(n, 'A', 'Z')
            in 'a'..'z' -> it.caesar(n, 'a', 'z')
            else -> it
        }
    }.joinToString("")

    private fun Char.caesar(c: Int, n: Char, m: Char): Char =
        (n.code + (code - n.code + c) % (m - n + 1)).toChar()
}