package com.example.codingtest.stepbystep.twentytwo.august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine()); //총 금액
        int cnt = Integer.parseInt(br.readLine()); // 물건 산 갯수
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int price = 0; //총 가격

        for(int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int pay = Integer.parseInt(st.nextToken()); //가격
            int num = Integer.parseInt(st.nextToken()); //해당 물건 갯수
            price += pay * num;
        }

        if(total == price) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        System.out.print(sb);
    }
}
