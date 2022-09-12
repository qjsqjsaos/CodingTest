package com.example.codingtest.stepbystep.twentytwo.september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        Item[] arr = new Item[N];


        for(int i = 0; i < N; i++) {
            arr[i] = new Item(i, Integer.parseInt(st.nextToken()));
        }

        //value형식으로 sort해주기
        Arrays.sort(arr, (e1, e2) -> {
            if(e1.value < e2.value) {
                return -1;
            }
            return 1;
        });

        int rank = 0;
        //이전 값
        Integer beforevalue = null;

        for(int i = 0; i < N; i++) {
            //이전 값이 null이 아니고, 이전값과 값이 같으면
            if(beforevalue != null && beforevalue == arr[i].value) {
                beforevalue = arr[i].value;
                arr[i].value = rank - 1;
                continue;
            }
            beforevalue = arr[i].value;
            arr[i].value = rank;
            rank++;
        }


        //여기서는 id형식으로 sort해주기
        Arrays.sort(arr, (e1, e2) -> {
            if(e1.id < e2.id) {
                return -1;
            }
            return 1;
        });


        for(int i = 0; i < N; i++) {
            sb.append(arr[i].value).append(" ");
        }

        System.out.print(sb);

        // TODO: 2022/09/13  런타임 에러 (IllegalArgument) 

    }

    static class Item {

        final int id;
        int value;

        Item(int id, int value) {
            this.id = id;
            this.value = value;
        }
    }
}
