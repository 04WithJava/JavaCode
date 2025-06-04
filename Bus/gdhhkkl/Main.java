package org.example.gdhhk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person soBeen = new Person();
        Bus tayo = new Bus();


      int busCard=  soBeen.checkTheBusCard();
        Scanner s = new Scanner(System.in);
        System.out.println("얼마 낼까요?:");
        int moneys = s.nextInt();
      int money=  soBeen.payTheMoney(moneys);
      soBeen.chargeTheBusCard(busCard,money);
      soBeen.getTheBus();
      tayo.goTo();
      int pay= soBeen.getBusCard();
      int change = tayo.terminalCheck(pay);
      soBeen.upDateChange(change);
      soBeen.getOutTheBus();
    }
}
