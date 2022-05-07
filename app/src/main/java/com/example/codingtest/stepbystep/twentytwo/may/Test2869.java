package com.example.codingtest.stepbystep.twentytwo.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); //낮에 올라가는 미터
        int B = Integer.parseInt(st.nextToken()); //밤에 미끄러지는 미터
        int V = Integer.parseInt(st.nextToken()); //나무 높이


        int meter = 0; //현재 올라간 미터

        int day = 0;

        while(true) {

            //만약 meter가 V를 넘어버렸다면,
            //초기화하고, A를 -1하고 다시 시작한다.
            //이 문제에 함정은 낮에 A미터 올라갈 수 있다고했지
            //A미터보다 더 적게도 올라갈 수 있다는 것이다.
            if(meter > V) {
                day = 0;
                A--;
                meter = 0;
            }

            //낮 - 밤
            meter += A;

            //정상 도착
            if(meter == V) {
                day++;
                break;
            }

            meter -= B;

            //정상 도착
            if(meter == V) {
                day++;
                break;
            }

            //하루 지남
            day++;
        }

        System.out.print(day);
    }
}
