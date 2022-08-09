package com.example.codingtest.stepbystep.twentytwo.august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test3003 {

    static int[] correct = {
            1, 1, 2, 2, 2, 8
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < correct.length; i++) {
            int num = Integer.parseInt(st.nextToken());
            String diff = String.valueOf(correct[i] - num);
            if(i == 5) {
                sb.append(diff);
            } else {
                sb.append(diff).append(" ");
            }
        }
        System.out.print(sb);
    }
}
