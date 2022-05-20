package com.example.codingtest.stepbystep.twentytwo.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10250 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine()); // 테스트 횟수
//
//        StringTokenizer st;
//        for(int i = 0; i < T; i++) {
            StringBuffer sb = new StringBuffer();
//            st = new StringTokenizer(br.readLine(), " ");
            int H = 3;
            int W = 4;
            int N = 5;

            int first;
            int last = 1;
            if(N > H) {
                first = N % H;

                //몫이 0이면 맨 끝층에 있는 것이다.
                //해당 층이 몇번쨰 방인지 알려면 다음과 같이 나누어 준다.
                if(first == 0) {
                    first = N / H;
                    last = H;
                } else {
                    //그렇지 않다면 아래 식대로 간다.
                    last = (N / H) + 1;
                }
            } else {
                first = N;
            }
            sb.append(first).append("0").append(last);
            System.out.println(sb);
//        }
    }
    // TODO: 2022-05-20 이거맞는데.. 
}
