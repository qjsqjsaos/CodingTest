package com.example.codingtest.stepbystep.twentytwo.june.programmers;

import java.io.IOException;

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int[] tshirts) {

        int answer = 0;

        //둘 다 오름차순으로 정렬을 해준다.
        Arrays.sort(people);
        Arrays.sort(tshirts);

        //중첩 for문 사용 (두 배열을 비교하기 위해)
        for(int person : people) {

            for(int j = 0; j < tshirts.length; j++) {

                //만약 한 사람에 사이즈가 티셔츠 사이즈와 같거나 작다면
                //answer카운트를 하나 올려주고,
                //해당 인덱스에 티셔츠를 0으로 만든다(한번 줬던 티셔츠의 중복을 막기 위해)
                if(person <= tshirts[j]) {
                    answer++;
                    tshirts[j] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
