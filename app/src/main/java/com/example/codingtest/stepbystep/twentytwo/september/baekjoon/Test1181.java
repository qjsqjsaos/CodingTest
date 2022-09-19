package com.example.codingtest.stepbystep.twentytwo.september.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1.length() == e2.length()) {
                return e1.compareTo(e2);
            } else if(e1.length() < e2.length()) {
                return -1;
            }
            return 1;
        });

        //중복제거
        String[] newArr = Arrays.stream(arr).distinct().toArray(String[]::new);

        for (String s : newArr) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
