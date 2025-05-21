package org.example.week03;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
//        while(i<3){
//            System.out.println("현재 숫자는:"+1);
//            i++;
//        }
        do{
            System.out.println("현재 숫자는:"+i);
            i++;
        }while(i<3);
    }
}
