package com.example.codingtest.stepbystep.twentytwo.june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;

            int cnt = 0;

            for(int i = N + 1; i <= (N * 2); i++) {
                if(isPrime(i))
                    cnt++;
            }

            System.out.println(cnt);
        }
    }

    public static boolean isPrime(int number) {

        // 0 과 1 은 소수가 아니다
        if(number < 2) {
            return false;
        }

        // 2 는 소수다
        if(number == 2) {
            return true;
        }

        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(number); i++) {

            // 소수가 아닐경우
            if(number % i == 0) {
                return false;
            }
        }
        // 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
        return true;
    }
}
