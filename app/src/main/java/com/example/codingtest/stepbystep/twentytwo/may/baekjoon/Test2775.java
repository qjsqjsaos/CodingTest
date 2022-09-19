package com.example.codingtest.stepbystep.twentytwo.may.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2775 {
    public static int[][] APT = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        make_APT();

        for (int i = 0; i < cnt; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(APT[k][n]).append('\n');
        }

        System.out.println(sb);
    }

    private static void make_APT() {
        //초기화
        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1; //각층 1호는 다 1
            APT[0][i] = i; //0층 1,2,3,4~~ 넣어준다.
        }

        for (int i = 1; i < 15; i++) { // 1층부터 14층까지
            for (int j = 2; j < 15; j++) { // 2호부터 14호까지
                APT[i][j] = APT[i - 1][j] + APT[i][j - 1];
            }
        }
    }
}
