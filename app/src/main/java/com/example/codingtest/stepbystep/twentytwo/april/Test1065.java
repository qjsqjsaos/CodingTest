package com.example.codingtest.stepbystep.twentytwo.april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test1065 {
    public static void main(String[] args) throws IOException {
        //N이 주어졌을때 N보다 같거나 작은 한수의 개수를 출력하는 프로그램을 만든다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        getIsHanSoo(N);

    }

    //한수의 갯수를 반환한다.
    public static void getIsHanSoo(int num) {
        boolean[] check = new boolean[num];
        String nums;
        //자릿수를 구한다.
        for(int i = 1; i <= num; i++) {
            //1 ~ 9와 10 ~ 99까지는 등차 수열이다.
            if(i < 100) {
                check[i] = true;
            } else { //세자리수이상
                nums = String.valueOf(i);

                int[] arr = new int[nums.length()];

                List<Integer> split = Arrays.stream(nums.split("")).map(Integer::parseInt).collect(Collectors.toList());
                for(int j = 0; j < nums.length(); j++) {
                    //마지막 요소는 반복문 이탈
                    if(i != (nums.length() - 1))
                        break;

                    //값의 차이를 담아준다.
                    arr[j] = split.get(i) - split.get(i + 1);
                }

                if(getDuplicateCount(arr) != 0)
                    check[i] = true;
            }
        }

        int cnt = 0;
        for(int i = 0; i < check.length; i++) {
            if(check[i])
                cnt++;
        }
        System.out.println(cnt);
    }

    //배열안에 요소가 같은 갯수가 몇개 인지 반환한다.
    public static int getDuplicateCount(int[] arr){
        int count = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i]))
                count++;
            set.add(arr[i]);
        }
        return count;
    }
}
