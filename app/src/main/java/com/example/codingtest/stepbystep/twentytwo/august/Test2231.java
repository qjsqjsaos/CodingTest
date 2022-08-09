package com.example.codingtest.stepbystep.twentytwo.august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());

        int result = getInitialNum(value);
        System.out.print(result);
    }

    private static int getInitialNum(int value) {
        int initNum = 1;
        while (true) {
            int sum = initNum + getCharNumSum(initNum);
            if(sum == value) {
                return initNum;
            }
            initNum++;
        }
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
