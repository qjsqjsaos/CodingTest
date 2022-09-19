package com.example.codingtest.stepbystep.twentytwo.april.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        String star = "*";

        for(int i = 1; i < length; i++) {
            sb.append(" ");
        }
        sb.append(star);

        System.out.println(sb);


        for (int i = length - 1; i > 0; i--) {
            sb.replace(i - 1, i, star);

            System.out.println(sb);
        }
    }
}
