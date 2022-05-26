package com.example.codingtest.stepbystep.twentytwo.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Test10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger first = new BigInteger(st.nextToken());
        BigInteger second = new BigInteger(st.nextToken());

        System.out.println(first.add(second));
    }
}
