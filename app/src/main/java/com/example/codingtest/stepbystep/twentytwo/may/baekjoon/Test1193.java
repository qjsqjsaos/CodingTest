package com.example.codingtest.stepbystep.twentytwo.may.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        //몇번째 항인가
        int count = 0;

        //분자
        int mole = 1;

        //분모
        int deno;

        //범위중 시작 ex) 11 ~ 15 -> 11
        int first = 0;

        //범위중 끝 ex) 11 ~ 15 -> 15
        int last = 0;

        //초항(고정값)
        int hang = 1;

        for (int i = 0; i < 10000001; i++) {
            //계차함수처럼 1 2 3 4씩 값을 더해준다.
            hang += i;

            // X보다 크면 break
            // 동시에 해당 항에 범위를 넣어준다.
            if (X < hang) {
                //이 다음 첫번째 항 숫자 - 전 항 카운트 = 현재 첫번째 숫자
                first = hang - count;
                //이 다음 첫번째 항 숫자 - 1 = 현재 마지막 숫자
                last = hang - 1;
                break;
            }

            //아니면 다음 항으로 가기 때문에 1을 올려준다.
            count++;
        }

        //분모 업데이트 (현재 항이 분모값과 동일)
        deno = count;

        // 범위 안에 숫자 갯수 (마지막 숫자 - 첫번째 숫자 + 1 = 숫자 범위 길이)
        int length = (last - first) + 1;

        // 범위 안에 숫자들을 담을 배열
        String[] arr = new String[length];

        //분자는 증가를, 분모는 증감을 해주며 배열에 넣어준다.
        for (int i = 0; i < length; i++) {
            arr[i] = mole++ + "/" + deno--;
        }

        //현재 항이 짝수 일때
        //순서가 바뀌어서 나와 순서를 바꾸어준다.
        if(count % 2 > 0) {
            arr = changeReverse(arr);
        }

        //배열안에 원하는 값 인덱스 (받은 값 - 현재 항에 첫 숫자 = 받은 값에 인덱스)
        int index = X - first;

        System.out.print(arr[index]);

    }

    //배열에 순서를 바꾸어준다.
    private static String[] changeReverse(String[] arr) {
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        return list.toArray(arr);
    }
}
