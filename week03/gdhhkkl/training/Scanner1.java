package org.example.traing;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하게요:");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열 :"+str);

        System.out.println("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수는:"+intValue);

        System.out.println("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수는 :"+doubleValue);
    }
}
