package com.example.algorithm.programmers.Level1;

import java.util.Stack;

public class lessons76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i= 0; i< absolutes.length;i++){
            if(signs[i]== false )
                answer-= absolutes[i];
            else
                answer+= absolutes[i];
        }
        return answer;

    }

    public static void main(String[] args) {


    }
}
