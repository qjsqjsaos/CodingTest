package com.example.codingtest.stepbystep.twentytwo.june.programmers;

public class Step2_3 {
    public int solution(int[][] triangle) {
        for (int i = triangle.length - 2; i >= 0; i--) {

            for (int j = 0; j <= triangle[i].length - 1; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }

        }
        return triangle[0][0];
    }
}
