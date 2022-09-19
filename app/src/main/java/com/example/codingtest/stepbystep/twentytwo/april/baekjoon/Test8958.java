package com.example.codingtest.stepbystep.twentytwo.april.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());

        while(br.ready()) {
            int sum = 0;
            int point = 0;
            char[] arr = br.readLine().toCharArray();

            for(char item : arr) {
                if(item == 'O') {
                    point++;
                    sum += point;
                }else{
                    point = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
