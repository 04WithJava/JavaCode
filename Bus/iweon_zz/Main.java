public class Main {
    public static void main(String[] args) {

        Bus tayo = new Bus();
        tayo.ride();
        tayo.operateTerminal();
        tayo.stop();

        Person soBeen = new Person(10000, 1000);
        soBeen.checkStatus();
        soBeen.rideBus(1200);
        soBeen.recharge(2000);
        soBeen.rideBus(1200);
        soBeen.exitBus();
        soBeen.pay(3000);
        soBeen.checkStatus();

    }
}
