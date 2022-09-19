package com.example.codingtest.stepbystep.twentytwo.may.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); //테스트 수

        for(int i = 0; i < T; i++) {
          st = new StringTokenizer(br.readLine(), " ");
          int R = Integer.parseInt(st.nextToken()); //각 문자열 반복 횟수
          String str = st.nextToken(); // 반복해야할 문자열

          for(int j = 0; j < str.length(); j++) {
              char ch = str.charAt(j);
              for(int k = 0; k < R; k++) {
                  System.out.print(ch);
              }
          }
            System.out.println();
        }
    }
}
