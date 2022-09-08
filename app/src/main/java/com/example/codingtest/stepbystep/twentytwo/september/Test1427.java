package com.example.codingtest.stepbystep.twentytwo.september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Test1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[N.length()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = N.charAt(i) - '0';
        }

        //배열은 primitive type을 Wrapper type으로 변경해야 sort 메서드를 사용 가능하다.
        Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());

        for(int i : tmp) {
            sb.append(i);
        }
        System.out.print(sb);
    }
}
