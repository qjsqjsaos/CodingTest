package com.example.codingtest.stepbystep.twentytwo.may.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sosu = 0;
        for(int i = 0; i < cnt; i++) {
            int value = Integer.parseInt(st.nextToken());
            
            if(!((value / 2 > 1 && value % 2 == 0)
                    || (value / 3 > 1 && value % 3 == 0)
                    || (value / 5 > 1 && value % 5 == 0)
                    || (value / 7 > 1 && value % 7 == 0)
                    || (value / 11 > 1 && value % 11 == 0)
                    || (value / 13 > 1 && value % 13 == 0)
                    || (value / 17 > 1 && value % 17 == 0)
                    || (value / 19 > 1 && value % 19 == 0)
                    || (value / 21 > 1 && value % 21 == 0)
                    || (value / 23 > 1 && value % 23 == 0)
                    || (value / 27 > 1 && value % 27 == 0)
                    || (value / 29 > 1 && value % 29 == 0)
                    || value == 1))
                sosu++;
        }

        System.out.print(sosu);
    }
}
