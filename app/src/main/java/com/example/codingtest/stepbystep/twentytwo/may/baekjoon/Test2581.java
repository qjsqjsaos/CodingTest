package com.example.codingtest.stepbystep.twentytwo.may.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Test2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (isSosu(i))
                arr.add(i);
        }

        if (arr.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(arr.stream().mapToInt(Integer::intValue).sum());
            System.out.println(Collections.min(arr));
        }
    }

    //이 값이 소수인지 아닌지 체크
    private static boolean isSosu(int value) {

        if (value == 1) return false;

        //제곱을 했을때, 자연수 만을 넘기기 전까지의 소수들
        int[] arr = new int[]{
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                49, 53, 59, 61, 67, 71, 73, 77, 79, 83, 89, 91, 97
        };

        for (int j : arr) {
            if (!(value / j <= 1 || value % j != 0)) {
                //나눠지는게 하나라도 나오면 소수가 아님
                return false;
            }
        }
        //나눠지는게 하나도 안나온다면 소수
        return true;
    }
}
