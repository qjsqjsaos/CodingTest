package com.example.codingtest.stepbystep.twentytwo.may.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); //고정비용
        int B = Integer.parseInt(st.nextToken()); //재료비, 인건비
        int C = Integer.parseInt(st.nextToken()); //노트북 가격

        if(C <= B) {
            System.out.print("-1");
        } else {
            System.out.print((A / (C - B)) + 1);
        }
    }
}
