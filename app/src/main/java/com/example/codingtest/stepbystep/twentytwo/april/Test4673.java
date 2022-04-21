package com.example.codingtest.stepbystep.twentytwo.april;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test4673 {
    public static void main(String[] args) {
        selfNum();
    }

    public static void selfNum() {
        int n = 1; //시작 값
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        while (n <= 10000) {
            int value;
            
            int length = String.valueOf(n).length();

            if (n < 10) {
                value = n + n;
                System.out.println(value);
            } else {
                value = forFun(n, length);

            }
            list.add(value);
            n++;
        }

        IntStream.range(0, 10000)
                .filter(v -> !list.contains(v))
                .forEach(i -> result.add(i));

//        result.forEach(System.out::println);
    }

    private static int forFun(int n, int cnt) {
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += parseInt(n, i, i + 1);
        }
        return sum;
    }

    private static int parseInt(int n, int start, int end) {
        return Integer.parseInt(String.valueOf(n).substring(start, end));
    }
}

// TODO: 2022/04/22 이건 답안 보자.. 너무 어렵다ㅣ.. 
