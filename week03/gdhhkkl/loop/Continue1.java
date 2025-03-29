package org.example.week03;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){
            if(i ==3){
                i++;
//                continue; //이거 없이도 실행 결과가 같게 나옴
            }
            System.out.println(i);
            i++; //증가하지 않으니까 무한 반복됨ㅋㅋㅋ
        }
    }
}
