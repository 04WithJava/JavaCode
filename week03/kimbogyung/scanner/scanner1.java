package scanner;
import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요:");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수를 입력하세요: ");
        int invalue = scanner.nextInt();
        System.out.println("입력한 정수 : " + invalue);

        System.out.print("실수를 입력하세요 :");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " +  doubleValue);
    }
}
