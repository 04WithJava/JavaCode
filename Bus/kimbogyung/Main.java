public class Main {
    public static void main(String[] args) {
        person sobeen = new person();
        Bus tayo = new Bus();

        int voidMoney = sobeen.chargeCard();
        System.out.println(voidMoney+"원 충전했습니다");
        sobeen.ride();
        sobeen.giveMoney();

        tayo.check(voidMoney);
        tayo.runBus();
        tayo.stopBus();
    }

}
