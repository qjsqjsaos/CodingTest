package com.example.codingtest.stepbystep.twentytwo.june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test9020 {

    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        getPrime(); //소수 구하기

//        while(br.ready()) {
            int N = 8;
            int cnt = 0;
            int[] arr = new int[N - 2];

            for(int i = 2; i <= N; i++) {
                if(!prime[i]) { //소수면
                    arr[cnt] = i;
                }
                cnt++;
            }

            for(int i = 0; i < arr.length; i++) {

                for(int j = 0; j < arr.length; j++) {
                    if(arr[i] + arr[j] == N) {

                        int first = i < j ? i : j;
                        int second = i < j ? j : i;

                        sb.append(first).append(" ").append(second);
                    }
                }
            }
//        }

        System.out.println(sb);

    }

    private static void getPrime() {
        //소수가 아니면 true
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
