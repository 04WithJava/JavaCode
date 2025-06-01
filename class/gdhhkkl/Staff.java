package org.example.gdhhkkl;

public class Staff {
    private int hand;

    public void hello(){
        System.out.println("소빈중식당에 오신걸 횐영합니다.");
    }
    public void goodBy(){
        System.out.println("다음에 또 오세여~");
    }
    public int takeOder(String order){
        if(order.equals("짜장면")){
            hand =1;
        } else if (order.equals("짬뽕")) {
            hand=2;
        } else if (order.equals("탕수육")) {
            hand=3;
        }

        return hand;
    }

    public String giveTheFood(String food){
        String give =food;
        System.out.printf("주문하신 %s 나왔습니다.", food);
        return give;
    }

    public int calculate(String order, int money){
        int calculate =0;
        if(order.equals("짜장면")){
            calculate=money-5000;
            System.out.printf("%S원받았습니다. 거스름돈%s원입니다." ,money,calculate);
        } else if (order.equals("짬뽕")) {
            calculate=money-8000;
            System.out.printf("%S원받았습니다. 거스름돈%s원입니다." ,money,calculate);
        } else if (order.equals("탕수육")) {
            calculate=money-18000;
            System.out.printf("%S원받았습니다. 거스름돈%s원입니다." ,money,calculate);
        }
        return calculate;
    }



}
