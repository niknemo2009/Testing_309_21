package com.company;

import java.sql.SQLOutput;

public class Example1 {
    int convertBall(int ball){
        int result =  0;
        if (ball<60){
            System.out.println("3");
        }
        else if (ball<75){
            System.out.println("3");
        }
        else if (ball<90){
            System.out.println("4");
        }
        else {
            System.out.println("5");
        }
        return result;
    }
}
