package chinese;

public class Guest {
	
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