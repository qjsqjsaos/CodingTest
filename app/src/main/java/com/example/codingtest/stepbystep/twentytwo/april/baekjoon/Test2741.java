package com.example.codingtest.stepbystep.twentytwo.april.baekjoon;

import java.io.*;

public class Test2741 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());

        for(int i = 1; i <= value; i++) {
            System.out.println(i);
        }
    }
}
