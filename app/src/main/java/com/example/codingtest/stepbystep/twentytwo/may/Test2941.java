package com.example.codingtest.stepbystep.twentytwo.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        //크로아티아 알파벳 갯수
        int count = 0;

        //알파벳 조건
        String[] arr = {
                "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="
        };

        //카운트용 스트링
        String cntStr = str;

        //조건에 맞는 값 전부 1로 바꾸기
        for (String i : arr) {
            //조건에 포함되어있을때
            if (str.contains(i))
                //카운트를 세기 위한
                cntStr = cntStr.replaceAll(i, "1");
        }

        //변환된 카운트 받기
        count += countStar(cntStr, '1');

        String result = cntStr.replaceAll("1", "");

        //제거 하고 남은 문자 갯수
        int leave = result.length();

        System.out.print(count + leave);
    }

    //문자열에 몇개나 있는지 세주는 메서드
    private static int countStar(String str, char ch) {
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                cnt++;
            }
        }
        return cnt;
    }
}
