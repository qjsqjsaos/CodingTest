package com.example.codingtest.stepbystep.twentytwo.june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int value = Integer.parseInt(br.readLine());
        int result = 1;

        if (value == 0) {
            sb.append(1);
        } else {
            for (int i = 1; i <= value; i++)
                result *= i;

            sb.append(result);
        }

        System.out.print(sb);
    }
}
