package com.example.codingtest.stepbystep.twentytwo.october.programmers

//체육복
class GymSuit {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {

        val arr = Array(n+1){1}
        var answer = -1

        // 체육복 도난
        for(i in lost) arr[i]--

        // 여벌의 체육복
        for(i in reserve) arr[i]++

        for(i in 1..n){
            // 체육복이 도난 당했다면
            if(arr[i]==0){

                // 왼쪽 친구가 있으면 빌림
                if(arr[i-1] == 2){
                    arr[i-1]--
                    arr[i]++
                }

                // 오른쪽 친구가 있으면 빌림
                else if(i<n){
                    if(arr[i+1] == 2){
                        arr[i+1]--
                        arr[i]++
                    }
                }
            }
        }


        //수업을 들을 수 있는 학생 계산
        for(i in arr) if(i >= 1) answer++

        return answer
    }
}