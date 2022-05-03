package com.example.codingtest.stepbystep.twentytwo.may;

import androidx.core.content.res.TypedArrayUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test10809 {
    //알파벳은 총 26개
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        //모든 값 -1로 초기화
        Arrays.fill(arr, -1);

        String s = "d";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            System.out.println(i);
            System.out.println(ch - 'a');

            if(arr[ch - 'a'] == -1) { //ch에 char "a"를 빼야 문자
                arr[ch - 'a'] = i;
            }
        }
        
        for(int result : arr) {
            System.out.print(result + " ");
        }
    }
}

// TODO: 2022-05-03 풀다 말음 
