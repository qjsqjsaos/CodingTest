package com.example.codingtest.stepbystep.twentytwo.june.programmers;

import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class JoongGan_2 {
    static SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");

    public static void main(String[] args) throws IOException, ParseException {

////        isOverTen("dasd","asdsa");
//
//        String[] str = {
//                "09:55", "10:05", "09:10"
//        };
//
//        Arrays.sort(str);
//
////        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
////
//        Date date1 = sdf.parse("09:55");
//        Date date2 = sdf.parse("09:10");
//
//
//        if (date1.before(date2)) {
//            System.out.println("Date1 is before Date2");
//        }
//
//        if (date1.after(date2)) {
//            System.out.println("Date1 is after Date2");
//        }
//
//

//
//
//        System.out.println(arr[0][1]);
//
////        for(String i : str) {
////            System.out.println(i);
////        }
//
//        Person dd = new Person("09:10","dasdas", false);
//        Person dd2 = new Person("09:55","dasdas", false);
//        Person dd3 = new Person("10:05","dasdas", false);
////
////        System.out.println(dd.time); //3
////        System.out.println(dd2.time); //3
//
//
//        Person[] people = {
//                dd,
//                dd2,
//                dd3
//        };
//
//
//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person person, Person person2) {
//                return person.time.compareTo(person2.time);
//            }
//        });








        String[][] booked = {{"09:10", "lee"}, {"09:55", "hea"}, {"10:05", "jee"}};
        String[][] unbooked = {{"09:10", "lee"}, {"09:55", "hea"}, {"10:05", "jee"}};


        String[] answer = new String[booked.length + unbooked.length];
        Person[] people = new Person[booked.length + unbooked.length];

        int lastIndex = 0;


        //예약 고객
        for(int i = 0; i < booked.length; i++) {
            people[i] = new Person(booked[i][0], booked[i][1], true);

            //마지막 인덱스 넣어주기
            if(i == booked.length - 1) lastIndex = i;
        }


        //일반 고객
        for(int i = lastIndex; i < unbooked.length; i++) {
            people[i] = new Person(unbooked[i][0], unbooked[i][1], false);
        }


        //결과 계산
        for(int i = 0; i < people.length; i++) {

            //마지막 사람은 마지막 줄에 한명 넣어준다.
            if(i == people.length - 1) {
                answer[i] = people[people.length - 1].name;
                break;
            }

            //예약과 일반 시간이 10분 초과 된다면 일반 우선
            if(isOverTen(people[i + 1].time, people[i].time)) {
                answer[i] = people[i].name;
            }
            else {
                //예약 우선

                if(people[i].isReserved) {
                    answer[i] = people[i].name;
                    answer[i] = people[i + 1].name;
                    break;
                }

                if(people[i + 1].isReserved) {
                    answer[i] = people[i + 1].name;
                    answer[i] = people[i].name;
                    break;
                }

            }



        }


        for(String i : answer){
            System.out.println(i);
        }


    }

    static class Person implements Comparable<Person> {
        public Person (String time, String name, boolean isReserved) {
            this.time = time;
            this.name = name;
            this.isReserved = isReserved;
        }
        String time;
        String name;
        boolean isReserved;


        @Override
        public int compareTo(Person o) {
            try {
                return sdf.parse(o.time).compareTo(sdf.parse(this.time));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return 0;
        }
    }

    //시간 차이 구하기
    private static boolean isOverTen(String str1, String str2) throws ParseException {

        Date date1 = sdf.parse(str1);
        Date date2 = sdf.parse(str2);

        //10초가 초과 하면 true
        return (((date1 != null ? date1.getTime() : 0) - (date2 != null ? date2.getTime() : 0)) / 1000) > 10;
    }
}
