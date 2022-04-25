package com.example.codingtest.stepbystep.twentytwo.april;


public class Test4673 {

    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int self = getSelf(i);

            //true는 셀프넘버가 아닌 숫자이다.
            if (self < 10001)
                check[self] = true;

        }

        StringBuilder sb = new StringBuilder();

        //false인 값만 출렧한다.
        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.print(sb);
    }


    //셀프넘버를 구한다. 1에서 10000까지 포함되지 않는 숫자가 셀프넘버이다.
    public static int getSelf(int num) {
        int total = num;
        while (num != 0) { //0이 될때 까지 돌린다.
            total += (num % 10);
            num /= 10;
        }
        return total;
    }

}

