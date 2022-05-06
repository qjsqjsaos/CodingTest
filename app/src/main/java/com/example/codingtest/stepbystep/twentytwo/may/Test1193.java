package com.example.codingtest.stepbystep.twentytwo.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        //분자
        int mole = 1;

        //분모
        int deno = 1;

        if(X == 1) {
            System.out.print(mole + "/" + deno);
        } else {

            deno = X;

            for(int i = 0; i < X; i++) {

            }
        }
    }
}
