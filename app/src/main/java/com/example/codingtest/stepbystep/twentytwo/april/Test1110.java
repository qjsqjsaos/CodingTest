package com.example.codingtest.stepbystep.twentytwo.april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//이거 아직 풀다 말음

public class Test1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int value = 26;

        int start = value;
        //싸이클 카운 횟수
        int count = 0;

        do {
            start = (start % 10) + ((start / 10) + (start % 10));
            count++;
        } while(value != start);

        System.out.print(count);
    }
}
