package com.example.codingtest.stepbystep.twentytwo.april.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Test1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(in.readLine());

        int x = N;
        //싸이클 카운 횟수
        int cnt = 0;

        while (true) {
            int q = x / 10; // 십의 자리
            int r = x % 10;

            int sum = q + r;

            x = r * 10 + sum % 10;
            cnt++;

            if(x == N) {
                break;
            }
        }

        out.write(cnt + "\n");

        out.flush();
        out.close();

        in.close();
    }
}
