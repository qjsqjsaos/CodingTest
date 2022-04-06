package com.example.codingtest.stepbystep.twentytwo.april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2438 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        String star = "*";

        StringBuilder sb = new StringBuilder();
        sb.append(star);

        for(int i = 0; i < length; i++) {
            System.out.println(sb);
            sb.append(star);
        }
    }
}
