package com.example.codingtest.stepbystep.twentytwo.april.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Test3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        Set<Integer> set = new HashSet<>();


        int cnt = 0;
        while(br.ready()) {
            arr[cnt++] = Integer.parseInt(br.readLine()) % 42;
        }

        for(int item : arr) {
            set.add(item);
        }

        System.out.print(set.size());
    }
}
