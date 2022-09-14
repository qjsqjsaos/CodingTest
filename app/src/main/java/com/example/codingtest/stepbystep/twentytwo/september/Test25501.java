package com.example.codingtest.stepbystep.twentytwo.september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test25501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int[] values = isPalindromeArray(br.readLine());
            int isPalindrome = values[0];
            int recursionCnt = values[1];

            sb.append(isPalindrome).append(" ").append(recursionCnt).append("\n");
        }
        System.out.println(sb);
    }

    static int recursionCnt = 0;

    public static int[] recursion(String s, int l, int r){
        recursionCnt++;
        if(l >= r) {
            return new int[] {1, recursionCnt};
        }
        else if(s.charAt(l) != s.charAt(r)) {
            return new int[] {0, recursionCnt};
        }
        else return recursion(s, l+1, r-1);
    }

    public static int[] isPalindromeArray(String s){
        // recursionCnt 초기화
        recursionCnt = 0;
        return recursion(s, 0, s.length()-1);
    }
}
