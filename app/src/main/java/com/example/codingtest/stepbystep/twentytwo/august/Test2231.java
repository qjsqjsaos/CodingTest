package com.example.codingtest.stepbystep.twentytwo.august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        int valueLength = N.length();
        int value = Integer.parseInt(N);

        int result = getInitialNum(value, valueLength);
        System.out.print(result);
    }

    private static int getInitialNum(int value, int valueLength) {
        for(int i = (value - (valueLength * 9)); i < value; i++) {
            int sum = i + getCharNumSum(i);
            if(sum == value) {
                return i;
            }
        }
        return 0;
    }

    // 각 자릿수의 합
    private static int getCharNumSum(int value) {
        int returnValue = 0;
        while (value != 0) {
            returnValue += value % 10;
            value /= 10;
        }
        return returnValue;
    }
}
