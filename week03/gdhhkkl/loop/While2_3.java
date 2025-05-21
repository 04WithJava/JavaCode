package org.example.week03;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1 ;
        int endNum = 3; //while 문 조건식 ?

        sum = sum +i;
        System.out.println("i="+i+" sum="+sum);
        i++;
        sum = sum +i;
        System.out.println("i="+i+" sum="+sum);
        sum = sum +i;
        i++;
        System.out.println("i="+i+" sum="+sum);
        i++;
    }
}
