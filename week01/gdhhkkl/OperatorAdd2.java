package org.example.week01;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a =1;
        int b =0;
        b = ++a;//3
//        System.out.println(a+b);
        System.out.println("a:"+a+"b:"+b);

        a=1;
        b=0;
        b =a++;
        System.out.println("a:"+a+"b:"+b);
    }
}
