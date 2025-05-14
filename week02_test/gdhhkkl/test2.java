package org.example.week02_test;

public class test2 {
    /*거리에 따른 운송 수단 선택하기*/
    public static void main(String[] args) {
        int distance=8;
        if(distance<=1){
            System.out.println("도보를 이요하세요.");
        }else if (distance<=10){
            System.out.println("자전거를 이요하세요.");
        }else if (distance<=100){
            System.out.println("자동차를 이요하세요.");
        } else if (distance<=1000) {
            System.out.println("바행기를 이요하세요.");
        }
    }
}
