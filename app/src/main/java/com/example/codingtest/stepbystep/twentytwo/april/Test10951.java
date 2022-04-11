package com.example.codingtest.stepbystep.twentytwo.april;

import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test10951 {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            if(br.ready()) {
                st = new StringTokenizer(br.readLine(), " ");

                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
                System.out.println(first + second);
            }
            else break;
        }
    }
}
