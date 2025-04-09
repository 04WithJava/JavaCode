import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요:");
            int n1 = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요:");
            int n2 = sc.nextInt();

            if (n1 == 0 && n2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            int sum = n1 + n2;
            System.out.println("두 숫자와 합:" + sum);
        }
    }
}
