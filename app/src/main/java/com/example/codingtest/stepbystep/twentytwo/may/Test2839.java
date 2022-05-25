package com.example.codingtest.stepbystep.twentytwo.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2839 {


    public static int five = 0;
    public static int three = 0;

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
        int N = 6;
        //5와 3으로 각각 나누어서 더 높은 값을 출력하자.

        if(factorization(N) == -1) {
            System.out.println(-1);
        } else {

        }

        // 5로 먼저나누고 3으로 나눌때
        int first = five(N);

        int second = third(N);

        if (first == -1 && second == -1) {
            System.out.println(-1);
        } else {
            if (first >= 0 && second >= 0)
                System.out.println(Math.min(first, second));
            else
                System.out.println(first < 0 ? second : first);
        }
    }

    //소인수 분해
    public static int factorization(int num) {

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {

                if (i == 3) three++;
                else if (i == 5) five++;
                else return -1;

                num = num / i;
            }
        }

    }

    private static int five(int N) {
        int mok = N / 5; //몫
        int dumb = N % 5;//나머지

        if (dumb % 3 == 0) {
            return mok + (dumb / 3);
        } else {
            return -1;
        }
    }

    private static int third(int N) {
        int mok = N / 3; //몫
        int dumb = N % 3;//나머지

        if (dumb % 5 == 0) {
            return mok + (dumb / 5);
        } else {
            return -1;
        }
    }
}

// TODO: 2022-05-25 문제풀이를 본 후이다. 중요한 것은 수학문제의 대표적인 특징은 규칙성이다.
// 표를 나열하고 그 안에 규칙을 찾는 것이 중요하다.
// 이 문제를 다시푸는 시도를 하자.
