package com.example.codingtest.stepbystep.twentytwo.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int count = 0;

        //그룹단어이냐 아니냐의 불리언
        boolean isGroup;

        while (br.ready()) {
            String str = br.readLine();
            isGroup = true;
            ArrayList<Character> list = new ArrayList<>();

            for(int i = 0; i < str.length(); i++) {
                //배열에 포함되어 있아도 되는데, 다음 문자로 바뀐 다음에 한 번 더 나오면 안됨

                //포함안되어 있으면 배열에 넣어준다.
                if(!contains(list, str.charAt(i))) {
                    list.add(str.charAt(i));
                } else {
                    //포함이 되어있을때,
                    //전에 문자와 다를때 (이건 같은 문자가 한번 더 추가 되었다는 뜻)
                    //그렇다면 이건 그룹 단어가 아니다.
                    //첫 실행을 하면 Array 예외가 생기므로, 처음엔 체크하지 않는다.
                    if(i != 0) {
                        if(str.charAt(i) != str.charAt(i - 1)) isGroup = false;
                    }
                }
            }
            //그룹 단어라면 카운트를 하나 추가한다.
            if(isGroup) {
                count++;
            }
        }

        System.out.print(count);
    }

    //char배열안에 char가 속해있는지 확인하는 메서드
    private static boolean contains(ArrayList<Character> chs, char ch) {
        int length = chs.size();

        for(int i = 0; i < length; i++) {
            if(chs.get(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
