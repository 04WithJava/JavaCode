import java.util.Scanner;

public class Customer {
    int money;
    int stomach;
    int lee;

    public Customer() {
        this.money = 10000;
    }

    public int eat (Employee employee) {
        System.out.print("소빈의 위 용량은 몇인가요?: ");
        Scanner sc = new Scanner(System.in);
        this.lee = sc.nextInt();
        return lee;
    }

    public void pay (Employee employee) {//음식 가격
        this.money -= employee.total;
        System.out.println("가진 돈 10,000원에서 결제 후 남은 돈: " + money);
    }
}
