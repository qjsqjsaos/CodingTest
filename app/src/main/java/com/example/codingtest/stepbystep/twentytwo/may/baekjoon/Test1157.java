package com.example.codingtest.stepbystep.twentytwo.may.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1157 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();

       //알파벳 배열
       int[] arr = new int[26];

       //각 문자의 갯수를 올려준다.
       for(int i = 0; i < str.length(); i++) {
           //대문자 범위
           if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
               //A를 뺌으로서, 해당 배열에 숫자에 카운트를 올려준다.
               arr[str.charAt(i) - 'A']++;
           }
           else { //소문자 범위
               arr[str.charAt(i) - 'a']++;
           }
       }

       //최댓값 찾고 출력하기

        int max = -1;
        char result = '?';
        for(int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                result = (char) (i + 65); //대문자로 바꾸어 줘야 하기 때문이다.
            }
            else if(arr[i] == max) {
                result = '?';
            }
        }

        System.out.print(result);
    }
}
