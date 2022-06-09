package com.example.codingtest.stepbystep.twentytwo.june.programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Step1_3 {
    public static void main(String[] args) throws IOException {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[] {
                120, 110, 140, 150
        };
        int M = 485;

        int answer = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            M -= arr[i];
            if(M < 0) break;
            answer++;
        }
        System.out.println(answer);
    }

}
