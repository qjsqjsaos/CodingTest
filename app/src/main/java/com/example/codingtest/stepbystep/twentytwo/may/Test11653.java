package com.example.codingtest.stepbystep.twentytwo.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11653 {

    public static int[] arr = new int[1000];
    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = 9991;
        int cnt2 = 0;

        for(int i = 0; i < 7920; i++) {
            makePrime(i);
        }

//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        if(value != 1) {
            while (true) {
                try {
                    if(value % arr[cnt2] == 0) {
                        value = value / arr[cnt2];
                        System.out.println(arr[cnt2]);
                    } else {
                        cnt2++;
                    }
                } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                    break;
                }
            }
        }

    }

    //소수 구하기
    public static void makePrime(int num) {

        if(num < 2) return;

        if(num == 2) {
            arr[cnt] = num;
            cnt++;
            return;
        }

        for(int i = 2; i < num; i++) {
            // 소수가 아닐경우 종료
            if(num % i == 0) {
                return;
            }
        }

        arr[cnt] = num;
        cnt++;
        return;
    }
}

// TODO: 2022-05-30 조금 더 풀어보자 
