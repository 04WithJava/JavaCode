package chinese;

import java.util.Scanner;

public class chinese {

    public static void main(String[] args) {
        System.out.println("어서오세요 중식당입니다. 무엇을 주문하시겠습니까??");
        System.out.println("MENU : 짜장면, 짬뽕, 탕수육");

        Scanner scanner = new Scanner(System.in);
        System.out.print("메뉴를 입력하세요: ");
        String order = scanner.nextLine();

        
       

        


        kitchen kitchen = new kitchen();
        kitchen.cook(order);

        
        Guest guest = new Guest(10000);


        int price = 0;
        switch (order) {
            case "짜장면": price = 5000; break;
            case "짬뽕": price = 6000; break;
            case "탕수육": price = 12000; break;
            default: price = 0; break;
        }

    
        guest.pay(price); // 자기가 먹은건 자기가 결제해야지요 손님이 결제

        
        guest.eat(order); // 손님이 먹음 혼자 맛있게..

        
        guest.checkStomach(); // 위 상태 체크 체크 더블 체

        
        guest.sayGoodbye(); // 빠빠이~~!

        scanner.close(); // 스캐너 닫음 문 닫았어여~
    }
}
