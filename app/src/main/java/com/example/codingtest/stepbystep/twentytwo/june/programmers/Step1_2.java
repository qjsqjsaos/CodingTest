package com.example.codingtest.stepbystep.twentytwo.june.programmers;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//40점 맞음 (가장 큰 수)
public class Step1_2 {

    public static void main(String[] args) throws IOException {
        int[] test = {
                6, 10, 2
        };

        String answer = IntStream.of(test)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.joining());

        if(answer.startsWith("0")) answer = "0";

        System.out.println(answer);
    }
}
