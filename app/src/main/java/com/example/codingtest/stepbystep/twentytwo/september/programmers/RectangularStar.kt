package com.example.codingtest.stepbystep.twentytwo.september.programmers

//직사각형 별찍기
class RectangularStar {
    fun main(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        repeat(b) {
            repeat(a) { print("*") }
            println()
        }
    }
}