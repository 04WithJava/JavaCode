import java.util.Scanner;

public class Bus {
    String run="달립니다";
    person sobeen = new person();

    //카드 단말기
    public int check (int c) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.print("소빈의 연령대는? (초등학생:1 | 중고등학생:2 | 성인:3 :: ");
        String str = sc.nextLine();
        switch (str) {
            case "1":
                total = 1000;
                c = c - 1000;
                System.out.println("1000원, 카드를 찍습니다");
                break;
            case "2":
                total = 2000;
                c = c - 2000;
                System.out.println("2000원, 카드를 찍습니다");
                break;
            case "3":
                total = 3000;
                c = c - 3000;
                System.out.println("3000원, 카드를 찍습니다");
                break;
        }
        return c;
    }

    //달리기
    public void runBus() {
        System.out.println(run);
    }

    //멈추기
    public void stopBus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("하차 (Y|N) : ");
        String answer = sc.nextLine();
        if (answer.equals("Y")) {
            System.out.println("버스가 멈춥니다");
        } else if (answer.equals("N")) {
            System.out.println("버스가 멈추지 않고 계속 달립니다");
        }
    }

}
