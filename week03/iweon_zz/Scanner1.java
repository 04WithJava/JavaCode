import java.util.Scanner;

public class Scanner1 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요:");
        String str = sc.nextLine();
        System.out.println("입력한 문자열:" +str);

        System.out.println("정수를 입력하세요:");
        int inValue = sc.nextInt();
        System.out.println("입력한 정수:" +inValue);

        System.out.println("실수를 입력하세요:");
        double doubleValue = sc.nextDouble();
        System.out.println("입력한 실수:" + doubleValue);
    }
}
