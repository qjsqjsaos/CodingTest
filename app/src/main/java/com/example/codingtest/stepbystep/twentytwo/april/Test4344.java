package com.example.codingtest.stepbystep.twentytwo.april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

public class Test4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int C = parseInt(br.readLine());

        int cnt = 0;

        while (cnt++ < C) {
            st = new StringTokenizer(br.readLine(), " ");

            int peopleCnt = parseInt(st.nextToken());

            int[] peoples = new int[peopleCnt];

            int sum = 0;
            for(int i = 0; i < peopleCnt; i++) {
                int point = parseInt(st.nextToken());
                sum += peoples[i] = point;
            }

            int average = sum / peopleCnt;

            long result = Arrays.stream(peoples).filter(v -> v > average).count();

            System.out.println(round(((double) result / peopleCnt) * 100) + "%");
        }
    }

    public static String round(double dou) {
        return String.format(Locale.getDefault(),"%.3f", dou);
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
