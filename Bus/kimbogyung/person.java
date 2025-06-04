import java.util.Scanner;

public class person {
    int money = 10000;
    int card = 0;

    //충전하기
    public int chargeCard() {
        Scanner sc = new Scanner(System.in);
        System.out.print("얼마 충전하겠습니까? (현재 돈 :10000원) : ");
        int set = sc.nextInt();
        this.money = money - set;
        this.card = set;
        return card;
    }

    //버스타기
    public void ride() {
        System.out.println("소빈이가 버스에 탑니다");
    }

    //돈내기
    public void giveMoney() {
        System.out.println("소빈이가 교통요금을 냅니다");
    }

    //버스 내리기
    public void goHome() {
        System.out.println("버스에서 내립니다");
    }

}
