package com.example.codingtest.stepbystep.twentytwo.june.programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//40점 맞음 (가장 큰 수)
public class Step1_2 {

    public static int[] arr = new int[999];

    public String solution(int[] numbers) {

        arr = numbers.clone();

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        List<Integer> join = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 10 && !isFirstDigit(numbers[i], i) && numbers[i] != 0) {
                //한자리 수이면서 첫째자리가 겹치지 않는 수들
                first.add(numbers[i]);
            } else {
                //한자리 수가 아니면서 앞자리수가 같은 수들
                second.add(numbers[i]);
            }
        }

        Collections.sort(first, Collections.reverseOrder());
        Collections.sort(second, new CustomComparator());
        join.addAll(first);
        join.addAll(second);

        join.forEach((i) -> {
            sb.append(i);
        });
        return sb.toString();
    }

    //해당 숫자가 배열 중에서 첫번째 자리수가 맞는 녀석이 있는지
    public static boolean isFirstDigit(int num, int index) {
        for(int i = 0; i < arr.length; i++) {
            //첫번째 자릿수 중에 같은게 있는지 확인
            //num의 index는 포함시키지 않는한에서이다.
            if(Integer.parseInt(String.valueOf(arr[i]).substring(0, 1)) == num && i != index) {
                return true;
            }
        }
        return false;
    }

    public static class CustomComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            Integer value;
            if(String.valueOf(o1).length() == 1 && String.valueOf(o2).length() == 2) {
                value = o1 + (o1 * 10);
                return o2.compareTo(value);
            } else if(String.valueOf(o1).length() == 1 && String.valueOf(o2).length() == 3) {
                value = o1 + (o1 * 100) + (o1 * 10);
                return o2.compareTo(value);
            } else if(String.valueOf(o1).length() == 1 && String.valueOf(o2).length() == 4) {
                value = o1 + (o1 * 100) + (o1 * 10) + (o1 * 1000);
                return o2.compareTo(value);
            } else if(String.valueOf(o2).length() == 1 && String.valueOf(o1).length() == 2) {
                value = o2 + (o2 * 10);
                return value.compareTo(o1);
            } else if(String.valueOf(o2).length() == 1 && String.valueOf(o1).length() == 3) {
                value = o2 + (o2 * 100) + (o2 * 10);
                return value.compareTo(o1);
            } else if(String.valueOf(o2).length() == 1 && String.valueOf(o1).length() == 4) {
                value = o2 + (o2 * 100) + (o2 * 10) + (o2 * 1000);
                return value.compareTo(o1);
            } else {
                return o2.compareTo(o1);
            }
        }
    }
}
