package com.example.codingtest.stepbystep.twentytwo.april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 1;
        while (br.ready()) {
            result = result * Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 10; i++)
            System.out.println(countChar(String.valueOf(result), Character.forDigit(i, 10)));
    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
