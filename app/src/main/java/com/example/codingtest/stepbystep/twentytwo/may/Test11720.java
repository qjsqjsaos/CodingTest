package com.example.codingtest.stepbystep.twentytwo.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), "");

        int count = 0;
        int result = 0;
        while (st.hasMoreTokens()) {
            result += st.nextToken().charAt(count) - '0';
            count++;
        }
        System.out.print(result);
    }
}

// TODO: 2022/05/03 답 보고 풀기 
