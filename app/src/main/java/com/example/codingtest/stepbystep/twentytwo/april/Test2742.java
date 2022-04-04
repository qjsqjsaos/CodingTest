package com.example.codingtest.stepbystep.twentytwo.april;

import java.io.*;

public class Test2742 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine());

        while (value > 0) {
            System.out.println(value);
            value--;
        }
    }
}
