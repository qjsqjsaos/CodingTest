package com.example.codingtest.stepbystep.twentytwo.may.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String A = st.nextToken();
        String B = st.nextToken();

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for(int i = 2; i >= 0; i--) {
            a.append(A.charAt(i));
        }

        for(int i = 2; i >= 0; i--) {
            b.append(B.charAt(i));
        }
        System.out.print(
                parseInt(a.toString()) > parseInt(b.toString())
                        ? a : b
                );

    }

    private static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
