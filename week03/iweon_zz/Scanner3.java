import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요:");
         int n1 = sc.nextInt();

         System.out.println("두 번째 숫자를 입력하세요:");
         int n2 = sc.nextInt();

         if (n1>n2){
             System.out.println("더 큰 숫자:" + n1);
         } else  if (n2>n1){
             System.out.println("더 큰 숫자:" + n2);
         }else {
             System.out.println("두 숫자는 같습니다.");
         }
    }
}
