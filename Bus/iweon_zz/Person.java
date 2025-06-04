public class Person {

    int money;
    int tcard;

    public Person(int money, int tcard) {
        this.money = money;
        this.tcard = tcard;
    }

    public void pay(int amount) {
        if (money >= amount) {
            money -= amount;
            System.out.println(amount + "원을 현금으로 지불했습니다. 남은 돈: " + money + "원");
        } else {
            System.out.println("현금이 부족합니다.");
        }
    }

    public void rideBus(int fare) { // 버스 타기 (교통카드 사용)
        if (tcard >= fare) {
            tcard -= fare;
            System.out.println("버스를 탔습니다. 요금 " + fare + "원 차감. 남은 카드 잔액: " + tcard + "원");
        } else {
            System.out.println("카드 잔액이 부족합니다.");
        }
    }


    public void exitBus() {
        System.out.println("버스에서 내렸습니다.");
    }

    // 충전을 할게요
    public void recharge(int amount) {
        if (money >= amount) {
            money -= amount;
            tcard += amount;
            System.out.println(amount + "원을 카드에 충전했습니다. 카드 잔액: " + tcard + "원, 남은 돈: " + money + "원");
        } else {
            System.out.println("충전할 만큼의 돈이 없습니다.");
        }
    }

    // 상태 확인 하겟음
    public void checkStatus() {
        System.out.println("현재 현금: " + money + "원, 카드 잔액: " + tcard + "원");
    }
}






