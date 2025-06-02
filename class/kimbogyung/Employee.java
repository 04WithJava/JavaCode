import java.util.Scanner;

public class Employee {
    String Hello;
    String pick;
    int total;

    public Employee () {
        this.Hello = "어서오세요!!";
        this.total = 0;
    }

    public void open () {
        System.out.println(Hello);
    }

    public String order () {
        Scanner sc = new Scanner(System.in);
        System.out.print("~~~ | 짜장면 | 짬뽕 | 탕수육 | ~~~ 메뉴를 고르세요 : ");
        pick = sc.nextLine();
        return pick;
    }

    public void give () {
        System.out.println(pick +"이 나왔습니다");
    }

    public int count () {
        switch (pick) {
            case "짜장면":
                System.out.println("짜장면은 5000원 입니다.");
                this.total = 5000;
                break;
            case "짬뽕":
                System.out.println("짬뽕은 6000원 입니다.");
                this.total = 6000;
                break;
            case "탕수육":
                System.out.println("탕수육은 10000원 입니다.");
                this.total = 10000;
                break;
        }
        return total;
    }

}
