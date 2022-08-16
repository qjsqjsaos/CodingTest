package com.example.codingtest.stepbystep.twentytwo.august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test7568 {

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st;

        arr = new int[cnt][2];

        for(int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        calculateRankCount(cnt);
    }

    private static void calculateRankCount(int cnt) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cnt; i++) {
            int rank = 1;

            for(int j = 0; j < cnt; j++) {
                //같은 카운트는 생략
                if(i == j) continue;

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(' ');
        }
        System.out.print(sb);
    }
}
