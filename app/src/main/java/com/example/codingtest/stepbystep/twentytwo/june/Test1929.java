package com.example.codingtest.stepbystep.twentytwo.june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1929 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int first = Integer.parseInt(st.nextToken());
//        int last = Integer.parseInt(st.nextToken());
//
//        for(int i = first; i <= last; i++) {
//            if(isPrime(i)) {
//                System.out.println(i);
//            }
//        }

        System.out.println(isPrime(17));

    }

    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}

// TODO: 2022-06-02 더 효율적인 방법 찾고, 수소 구하는 알고리즘 블로그 글 읽어 보기  https://st-lab.tistory.com/81
