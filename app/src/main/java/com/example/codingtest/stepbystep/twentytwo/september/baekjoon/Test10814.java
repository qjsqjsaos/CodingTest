package com.example.codingtest.stepbystep.twentytwo.september.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Person[] people = new Person[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people[i] = new Person(i, age, name);
        }

        Arrays.sort(people);

        for(Person person : people) {
            sb.append(person.age).append(" ").append(person.name).append("\n");
        }

        System.out.print(sb);
    }

    static class Person implements Comparable<Person> {
        private final int id;
        private final int age;
        private final String name;
        Person(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person person) {

            if(this.age == person.age) {
                if(this.id < person.id) {
                    return -1;
                }
                return 1;
            } else if(this.age < person.age) {
                return -1;
            }
            return 1;
        }
    }
}
