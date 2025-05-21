import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] volume = {5, 6, 5, 8, 2}; // 음식 용량 배열
        String[] menu = {"짜장", "짬뽕", "볶음밥", "탕수육", "탄산"};
        int lee = 10;
        int takeOut = 0;
        int total = 0;

        System.out.print("~~메뉴판~~~ \n 짜장:4000 | 짬뽕:6000 | 볶음밥:5000 | 탕수육:20000 | 탄산:1500  ~~~ 메뉴를 고르세요 : ");
        String str = sc.nextLine();
        String[] pick = str.split(" "); // 사용자가 고른 메뉴 배열로 저장함

        eat(pick, lee, volume, menu);

        System.out.println("~~~포장~~~");
        takeOut = takeOut(pick, volume, menu);
        System.out.println("남은 음식은 " + takeOut);

        System.out.println("~~~영수증~~~");
        total = pay (pick, total);
        System.out.println("총 금액 :  " + total);
    }

    public static int eat(String[] pick, int lee, int[] volume, String[] menu) {
        while (lee > 0) {
            for (int i = 0; i < pick.length; i++) {
                int v = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equals(pick[i])) {
                        v = j;
                        break;
                    }
                }
                if (v == -1) {
                    continue;
                }
                if (lee > volume[v]) {
                    lee -= volume[v];
                    volume[v] = 0;
                    System.out.println(pick[i] + "을 다 먹고 남은 위 용량은 " +  lee + "입니다.");
                } else if (lee < volume[v]) {
                    volume[v] = Math.abs(lee - volume[v]);
                    lee = 0;
                    System.out.println("위가 다 차서 그만 먹습니다. 남은 " + pick[i] + "용량은 " + volume[v] + "입니다.");
                }
            }
        } return lee;
    }

    public static int takeOut (String[] pick, int[] volume, String[] menu) {
        int vl = -1;
        int takeOut = 0;
        for (int i = 0; i < pick.length; i++) {
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(pick[i])) {
                    //vl = j;
                    takeOut += volume[j];
                    break;
                }
            }
        }/*
        for (int j = 0; j < pick.length; j++) {
            if (volume[vl] > 0) {
                takeOut += volume[vl];
            }
        } */ return takeOut;
    }


    public static int pay (String[] pick, int total) {
        for (int i = 0; i < pick.length; i++) {
            switch (pick[i]) {
                case "짜장":
                    total += 4000;
                    break;
                case "짬뽕":
                    total += 6000;
                    break;
                case "볶음밥":
                    total += 5000;
                    break;
                case "탕수육":
                    total += 20000;
                    break;
                case "탄산":
                    total += 1500;
                    break;
            }
        } return total;
    }



}