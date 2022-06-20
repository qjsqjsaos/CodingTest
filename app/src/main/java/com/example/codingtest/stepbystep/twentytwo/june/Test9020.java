package com.example.codingtest.stepbystep.twentytwo.june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test9020 {

    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
//

        getPrime(); //소수 구하기

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        int[] arr = new int[5001];
        for(int i = 2; i <= 5001; i++) {
            if(!prime[i]) { //소수면
                arr[cnt] = i;
                cnt++;
            }

        }
        
        while(br.ready()) {
            int N = Integer.parseInt(br.readLine());
            int first = 0;
            int second = 0;
            int difference = 1000;

            for (int k : arr) {

                for (int i : arr) {

                    if (k + i > N) break;

                    if (k + i == N) {

                        if(difference > Math.abs(k - i)) {
                            difference = Math.abs(k - i);
                            first = Math.min(k, i);
                            second = Math.max(k, i);
                        }
                    }
                }

            }

        sb.append(first).append(" ").append(second).append("\n");
        }

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

// TODO: 2022-06-20 답안 보기
