package com.example.codingtest.stepbystep.twentytwo.june.programmers;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int solution(int[] budgets, int M) {
        HashSet<Integer> set = new HashSet<>();
        int answer;
        int sum = getArraySum(budgets);

        while (sum >= M) {
            //평균
            int average = sum / budgets.length;

            for(int i = 0; i < budgets.length; i++) {
                if(budgets[i] >= average) { //작거나인지 작거나 같은거인지 확인
                    budgets[i] = budgets[i] - 1;
                    //변화가 있는 index값 넣어주기

                    if(!set.contains(budgets[i])) set.add(i);
                }
            }
            if(!set.isEmpty())
                sum = getArraySum(budgets);
        }

        if(!set.isEmpty()) {
            Iterator<Integer> it = set.iterator();
            int upper = 0;
            int cnt = 0;
            while(it.hasNext()) {
                int index = it.next();
                upper += budgets[index];
                cnt++;
            }
            answer = upper / cnt;
        } else {
            answer = getMax(budgets);
        }

        return answer;
    }

    public static int getArraySum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
