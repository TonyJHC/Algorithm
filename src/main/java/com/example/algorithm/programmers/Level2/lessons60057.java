package com.example.algorithm.programmers.Level2;

import com.example.algorithm.programmers.Level1.lessons77484;

import java.util.ArrayList;

public class lessons60057 {
    public int solution(String s) {
        int answer = 0;
//        s.substring(k,k+i+i);
        String[] str = new String[s.length() / 2]; // 자르는 단위만큼 String 객체 수가 정해질테니까.

        for (int i = 1; i < s.length() / 2; i++) { // 자르는 단위
            str[i] = "";
            for (int k = 0; k <= s.length() -2*i; k += i) { // s.length()-2*i
                if (s.substring(k, k + i).equals(s.substring(k + i, k + i + i))) { // 단위로 자른 요소들 비교 (옆에 있는 것 끼리)
                    str[i] += (s.substring(k, k + i + i).replace(s.substring(k, k + i + i), "2" + s.substring(k, k + i)));
                    k += i;
                    System.out.println(k + " : " + str[i]);
                } else
                    str[i] += s.substring(k, k + i);
            }
        }

        for (int i = 1; i < str.length; i++) {
            System.out.println(i + 1 + " 개 단위로 압축 : " + str[i]);
        }


        return answer;


    }

    public static void main(String[] args) {
        lessons60057 lessons60057 = new lessons60057();

        lessons60057.solution("aabbaccc");

    }

}
