package org.example.week02_test;

public class test1 {
    public static void main(String[] args) {
        int score=85;
        if(score>=90){
            System.out.println("score :"+score);
            System.out.println("출력 :  학점은 A입니다.");
        } else if (score>=80&&score<90) {
            System.out.println("score :"+score);
            System.out.println("출력 :  학점은 B입니다.");
        } else if (score>=70&&score<80) {
            System.out.println("score :"+score);
            System.out.println("출력 :  학점은 C입니다.");
        } else if (score>=60&& score<70) {
            System.out.println("score :"+score);
            System.out.println("출력 :  학점은 D입니다.");

        } else if (score<60) {System.out.println("score :"+score);
            System.out.println("출력 :  학점은 F입니다.");

        }
    }
}
