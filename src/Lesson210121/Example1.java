package Lesson210121;

public class Example1 {
    public static void main(String[] args) {

    }

    int convertBall(int ball){
        int result=0;
        if(ball<60){
            result=2;
        }else if(ball<75){
            result=3;
        }else if(ball<90){
            result=4;
        }else{
            result=5;
        }
        return result;
    }
}
