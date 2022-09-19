package com.example.codingtest.stepbystep.twentytwo.june.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10870 {

    public static int[] arr = new int[21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        getBonacci();
        sb.append(arr[value]);
        System.out.println(sb);
    }

    private static void getBonacci() {
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= 20; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
}
