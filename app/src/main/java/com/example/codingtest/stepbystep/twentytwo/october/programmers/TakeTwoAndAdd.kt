package com.example.codingtest.stepbystep.twentytwo.october.programmers

class TakeTwoAndAdd {
}

fun main() {
    val numbers = intArrayOf(
        2,1,3,4,1
    )
    val arr = arrayListOf<Int>()
    numbers.forEachIndexed { index, i ->
        repeat(numbers.size) { re ->
            if(index != re) {
                arr.add(i + numbers[re])
            }
        }
    }
    val list = arr.toList().distinct().sorted().toIntArray()
    print(list)
}

// TODO: 다 풀긴했는데, 아직 제대로된 풀이는 보지 못함