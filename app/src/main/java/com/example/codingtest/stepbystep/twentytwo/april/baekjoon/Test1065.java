package com.example.codingtest.stepbystep.twentytwo.april.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1065 {
    public static void main(String[] args) throws IOException {
        //N이 주어졌을때 N보다 같거나 작은 한수의 개수를 출력하는 프로그램을 만든다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= N; i++) {
           if(i <= 99) {
               count++;
           }
           else {
               String[] numStr = Integer.toString(i).split("");
               if((parseInt(numStr[1]) - parseInt(numStr[0])) == (parseInt(numStr[2]) - parseInt(numStr[1])))
                   count++;
           }
        }
        System.out.println(count);
    }

    private static int parseInt(String str) {
        return Integer.parseInt(str);
    }

}
