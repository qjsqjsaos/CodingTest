package com.example.codingtest.stepbystep.twentytwo.september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Location[] locations = new Location[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            locations[i] = new Location(x, y);
        }

        Arrays.sort(locations);

        for(Location loc : locations) {
            sb.append(loc.x).append(" ").append(loc.y).append("\n");
        }

        System.out.print(sb);
    }

    static class Location implements  Comparable<Location>{

        private final int x;
        private final int y;

        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Location location) {
            //만약 기존 x좌표가 새로운 x좌표보다 작으면 뒤로감 -1 0 1
            if(this.x < location.x) {
                return -1;
            } else if(this.x == location.x) {
                //만약 x는 같은데 기존 y좌표가 새로운 y좌표보다 작으면 뒤로감 -1 0 1
                if(this.y < location.y) {
                    return -1;
                }
                //앞으로 감
                return 1;
            }
            //앞으로 감
            return 1;
        }
    }
}
