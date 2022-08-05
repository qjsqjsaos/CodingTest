package com.example.codingtest.stepbystep.twentytwo.august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        // 배열에 숫자들을 넣어준다.
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //M에 가까운 숫자 조합 가져오기
        int result = getLargeNumCombinations(arr, N, M);
        System.out.print(result);
    }

    private static int getLargeNumCombinations(int[] arr, int N, int M) {
        // 결과
        int result = 0;

        for(int i = 0; i < N - 2; i++) {

            if(arr[i] > M) continue;

            for(int j = i + 1; j < N - 1; j++) {

                if(arr[i] + arr[j] > M) continue;

                for(int k = j + 1; k < N; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if(sum == M) {
                        result = sum;
                        return result;
                    }

                    if(result < sum && sum < M) {
                        result = sum;
                    }

                }

            }

        }
        return result;
    }
}
