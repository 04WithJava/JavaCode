package scanner;
import java.util.Scanner;

public class scannerWhile3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료) : ");
            int num = in.nextInt();

            if (num == 0) {
                break;
            }
            sum += num;
        }System.out.println("입력한 모든 정수의 합 : " + sum );
    }
}
