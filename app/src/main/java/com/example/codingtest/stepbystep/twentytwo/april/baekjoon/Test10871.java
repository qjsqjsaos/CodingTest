package com.example.codingtest.stepbystep.twentytwo.april.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        int firstRange = Integer.parseInt(st.nextToken());
        int secondRange = Integer.parseInt(st.nextToken());

        List<Integer> results = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < firstRange; i++) {
            int value = Integer.parseInt(st.nextToken());

            if(value < secondRange) {
                results.add(value);
            }
        }

        for(int i : results) {
            sb.append(i);
            sb.append(' ');
        }
        String answer = sb.toString().trim();

        System.out.print(answer);

    }
}
