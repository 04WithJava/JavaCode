package org.example.week03;

public class While2_4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

//        while (i <= endNum){
//            sum = sum + i;
//            System.out.println("i="+i+" sum="+sum);
//            i++; //이게 없으니까 계속 i는 1이라서 무한으로 돌아버림ㅋㅋㅋ
//        }
        while(i<=3){
            sum =sum+i;
            System.out.println("i="+i+" sum="+sum);
            i++;
        }
    }
}
