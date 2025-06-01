package org.example.gdhhkkl;

public class Customer  {
    private int money = 20000;
    private int stomach = 8;

    public int eat(String orderFood){
        if(orderFood.equals("짜장면")){
            stomach-=5;
        } else if (orderFood.equals("짬뽕")) {
            stomach-=6;
        } else if (orderFood.equals("탕수육")) {
           stomach-=8;
        }
        return stomach;
    }
    public int payTheMoney(){
        return this.money;
    }
    public void takeTheMoney(int money){
        this.money=money;
        System.out.printf("현재 지갑에 %s원 남았네...거지다..", this.money);
    }
    public void checkTheStomach(int sm){
        if(sm==0){
            System.out.printf("배 퍼질것 같아");
        }else {
            System.out.printf("%d정도 남았지만 너무 잘 먹었다!!",sm);
            System.out.println("계산이여");
        }
    }

}
