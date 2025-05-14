package org.example.week02;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
//        String status;

        String status = (age>=18) ? "성인" : "미성년자";
        System.out.println("age ="+age+" status ="+status);
//        if(age>=18){
//            status = "성인";
//        }else {
//            status = "미성년자";
//        }
//        System.out.println("age = "+age+"staus ="+status);

    }
}
