package com.example.codingtest.stepbystep.twentytwo.august.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[2000001];

        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for(int i = 0; i < 2000001; i++) {
            if(arr[i]) {
                sb.append(i - 1000000).append('\n');
            }
        }
        System.out.print(sb);
    }
}

// TODO: 2022-08-17 문제 푸는중 
