package chinese;

import java.util.Scanner;

public class chinese {

    public static void main(String[] args) {
        System.out.println("어서오세요 중식당입니다. 무엇을 주문하시겠습니까??");
        System.out.println("MENU : 짜장면, 짬뽕, 탕수육");

        Scanner scanner = new Scanner(System.in);
        System.out.print("메뉴를 입력하세요: ");
        String order = scanner.nextLine();

        
        class Kitchen {
            String name = "Tomato";
            String jjajangmyeon;
            String jjamppong;
            String tangsuyuk;

            Kitchen() {
                this.jjajangmyeon = "짜장면";
                this.jjamppong = "짬뽕";
                this.tangsuyuk = "탕수육";
            }

            void cook(String menu) {
                System.out.println(name + ": " + menu + "을(를) 조리합니다.");
            }
        }

        
        class Guest {
            String name = "SoBeen";
            int money;         
            int stomach;       
            String menu;       

            Guest(int money) {
                this.money = money;
                this.stomach = 0;
            }

            void eat(String menu) {
                System.out.println(name + ": " + menu + "을(를) 맛있게 먹습니다!");
                this.menu = menu;
                this.stomach += 50; //한 번 먹으면 50만큼 위가 참
                if (this.stomach > 100) this.stomach = 100;
            }

            void pay(int price) {
                if (this.money >= price) {
                    this.money -= price;
                    System.out.println(name + ": " + price + "원을 결제했습니다. 남은 돈: " + this.money + "원");
                } else {
                    System.out.println(name + ": 돈이 부족합니다!");
                }
            }

            void checkStomach() {
                if (this.stomach >= 100) {
                    System.out.println( name + ": 배가 아주 부릅니다!");
                } else if (this.stomach >= 50) {
                    System.out.println(name + ": 적당히 배가 찼어요.");
                } else {
                    System.out.println(name + ": 아직 배가 고파요.");
                }
            }

            void sayGoodbye() {
                System.out.println("Tomato" + ": 안녕히 가세요!");
            }
        }


        Kitchen kitchen = new Kitchen();
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
