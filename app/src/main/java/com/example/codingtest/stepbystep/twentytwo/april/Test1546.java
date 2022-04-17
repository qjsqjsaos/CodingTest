package com.example.codingtest.stepbystep.twentytwo.april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        double[] arr = new double[N];

        int cnt = 0;
        while (st.hasMoreTokens()) {
            arr[cnt++] = Double.parseDouble(st.nextToken());
        }

        double M = Arrays.stream(arr).max().getAsDouble();

        double sum = 0;

        for(int i = 0; i < N; i++) {
            sum += arr[i] / M * 100;
        }

        System.out.print(sum / N);

    }
}
