package org.example.gdhhkkl;

import java.util.Scanner;

public class ChineseRestaurant {
    public static void main(String[] args) {
        Customer soBeen =  new Customer();
        Staff tomato = new Staff();
        Cuisine cuisine = new Cuisine();
        int hand;
        String food;
        String orderFood;
        tomato.hello();

        System.out.println("짜장면:4500원, 짬뽕:6500, 탕수육:18000원");
        System.out.println("뭐를 주문하시겠어요:");
        Scanner s = new Scanner(System.in);
        String order = s.next();

       hand =tomato.takeOder(order);
       food = cuisine.makeFood(hand);
       orderFood= tomato.giveTheFood(food);

        int sm= soBeen.eat(orderFood);
        soBeen.checkTheStomach(sm);
        int payMoney=soBeen.payTheMoney();
         int result=tomato.calculate(order,payMoney);
        soBeen.takeTheMoney(result);
        tomato.goodBy();


    }
}
