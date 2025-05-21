package org.example;

public class Over {
    public static void main(String[] args) {
        int sum = sum(5,2,0);
        System.out.println(sum);
    }
    public static int sum(int a, int b, int c){
        int result = 0;
        if(a==0){
            a=예외처리(a);
            result =a*b*c;
        }else if(b==0){
            b=예외처리(b);
            result =a*b*c;
        }else if(c==0){
            c=예외처리(c);
            result =a*b*c;
        }
        return result;
    }
    public static int 예외처리(int zero){
        zero=1;
        System.out.println("0이있어서 1로변경");
        return zero;
    }


}
