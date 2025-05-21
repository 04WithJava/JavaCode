import java.util.Scanner;

public class BOO {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("메뉴를 고르세요");
    System.out.println("메뉴 : 짜장 4000원(용량:5) " +
            "짬뽕 6000원(용량:6) 볶음밥 " +
            "5000원(용량:5) " +
            "탄산 1500원(용량:2) " +
            "탕수욕 20000원(용량:8)");

    System.out.println("주문할 메뉴를 적어주세요");
    int menu = sc.nextInt();

    String menuName = "";
    int Price = 0;

    if(menuName =="짜장"){
        menuName= "짜장";
        price = 4000;
    }
    else if(menuName =="<UNK>"){}



}
}
