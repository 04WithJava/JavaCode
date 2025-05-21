package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ChineseRestaurant {

    public static void main(String[] args) {
        int basicEnergy = 10;
        int totalPrice =0;
        String order;
        String[] menu = {"짜장면","짬뽕","볶음밥","탕수육","탄산"};


        System.out.println("짜장면:4000원,짬봉:6000,볶음밥:5000,탄산:1500,탕수육:20000");
        Scanner scanner = new Scanner(System.in);
        System.out.println("주문 뭐하시겠어요?");
        order = scanner.next();

        ArrayList<String> orders = new ArrayList<>();
        for(int i=0; i<menu.length; i++){
            if(order.contains(menu[i])){
                orders.add(menu[i]);
            }
        }

        for(int get =0; get<orders.size(); get++){
            String getOrder = orders.get(get);
            totalPrice += orderPrice(getOrder);
            int emthy= eatingEnergy(getOrder,basicEnergy);
            basicEnergy =emthy;
        }
        System.out.printf("%d원 입니다. ",totalPrice);



    }

    public static int orderPrice(String order){
        int price=0;
        if(order.equals("짜장면")){
            price += 4000;
        } else if (order.equals("짬뽕")) {
            price+=6000;
        }else if(order.equals("볶음밥")){
            price+=5000;
        }else if(order.equals("탄산")){
            price+=1500;
        }else if(order.equals("탕수육")){
            price+=20000;
        }
        return price;
    }

    public static int eatingEnergy(String order, int basicEnergy){
        int basic =0;
        if (order.equals("짜장면")) {
            basic =basicEnergy- 5;

            if (basic < 0) {
                System.out.printf("%s 때문에 못먹겠다.", order);
            }
        } else if (order.equals("짬뽕")) {
            basic =basicEnergy- 6;
            if (basic < 0) {
                System.out.printf("%s 때문에 못먹겠다.", order);

            }
        } else if (order.equals("볶음밥")) {
            basic =basicEnergy- 5;
            if (basic < 0) {
                System.out.printf("%s 때문에 못먹겠다.", order);
            }
        } else if (order.equals("탄산")) {
            basic =basicEnergy- 2;
            if (basic < 0) {
                System.out.printf("%s 때문에 못먹겠다.", order);
            }
        } else if (order.equals("탕수육")) {
            basic =basicEnergy- 8;
            if (basic< 0) {
                System.out.printf("%s 때문에 못먹겠다.", order);
            }
        }

//        for(int i=0; i<orders.size(); i++){
//            String getOrder = orders.get(i);
//            while (basicEnergy<-1) {
//                if (getOrder.equals("짜장면")) {
//                    basic = basicEnergy - 5;
//                    if (basic < 0) {
//                        System.out.printf("%s 때문에 못먹겠다.", order);
//                        break;
//                    }
//                } else if (getOrder.equals("짬뽕")) {
//                    basic = basicEnergy - 6;
//                    if (basic < 0) {
//                        System.out.printf("%s 때문에 못먹겠다.", order);
//                        break;
//                    }
//                }else if(getOrder.equals("볶음밥")){
//                    basic = basicEnergy -5;
//                    if (basic < 0) {
//                        System.out.printf("%s 때문에 못먹겠다.", order);
//                        break;
//                    }
//                }else if(getOrder.equals("탄산")){
//                    basic = basicEnergy -2;
//                    if (basic < 0) {
//                        System.out.printf("%s 때문에 못먹겠다.", order);
//                        break;
//                    }
//                } else if (getOrder.equals("탕수육")) {
//                    basic = basicEnergy -8;
//                    if (basic < 0) {
//                        System.out.printf("%s 때문에 못먹겠다.", order);
//                        break;
//                    }
//                }
//            }



        return basic;

    }
}

