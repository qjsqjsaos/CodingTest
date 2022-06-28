package com.example.codingtest.stepbystep.twentytwo.june.programmers;

import java.io.IOException;

public class Step2_1 {
    public static void main(String[] args) throws IOException {
        int[][] maps = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };


        int cnt = 1;

        int y = 0;
        int x = 0;

        while(true) {
            if(maps[y][x] == 1) {

                if(y == 0 && x == 0) {

                    //둘다 0일때 첫 시작
                    //1인곳으로 먼저 출발
                    //둘다 1이면 오른쪽으로 먼저가기
                    if(maps[1][0] == 1) {
                        y++;
                    }else if(maps[0][1] == 1) {
                        x++;
                    } else {
                        x++;
                    }

                    cnt++;

                } else {

                    boolean isX = false;
                    boolean isY = false;


                    //만약 오른쪽이 1이면 오른쪽으로 이동
                    //오른쪽이 0이고, 아래가 1이면 아래로 이동 (오른쪽 먼저 보고 아니면 아래)
                    //둘 다 0이면 위쪽으로 이동
                    try {
                        isX = true;
                        if(maps[y][x + 1] == 1) {
                            isY = true;
                            x++;
                        } else if(maps[y + 1][x] == 1) {
                            y++;
                        } else {
                            y--;
                        }
                    }catch (ArrayIndexOutOfBoundsException e) {

                        if(isX) {
                            try {
                                if(maps[y][x + 1] == 1) {
                                    x++;
                                }else {
                                    y++;
                                }
                            }catch (ArrayIndexOutOfBoundsException e1) {
                                y++;
                            }

                        }else if(isY) {
                            try {
                                if(maps[y][x + 1] == 1) {
                                    x++;
                                }else {
                                    y--;
                                }
                            }catch (ArrayIndexOutOfBoundsException e1) {
                                x++;
                            }

                        }

                    }

                    //칸 카운팅
                    cnt++;

                    //끝 지점에 도착시 프로그램 종료
                    if(x == maps.length - 1 && y == maps[0].length - 1) break;
                }

            } else {
                //정답으로 가는 길이 없을 경우
                cnt = -1;
                break;
            }
        }

        System.out.println(cnt);
    }
}
