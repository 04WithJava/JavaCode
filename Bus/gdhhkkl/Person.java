package org.example.gdhhk;

public class Person {
   private int money;
   private int busCard;

   public Person(){
       this.money=120;
   }
    public int payTheMoney(int moneys){
        return this.money = moneys;
    }
    public int getBusCard(){
       return this.busCard;
    }
    public void setBusCard(int busCard){
       this.busCard = busCard;
    }

    public int checkTheBusCard(){
       if(this.busCard <=16000){
           System.out.printf("현재 교통카드에 %s 있네..충전하자",busCard);
       }else {
           System.out.printf("현재 교통카드에 %s 정도 있구나 충분해!!",busCard);
       }
       return this.busCard;
    }
    public int chargeTheBusCard(int busCard,int money){
       int busCardCoin = getBusCard();
        if(busCard<=16000){
            busCardCoin+=money;
            setBusCard(busCardCoin);
            System.out.printf("%s원 만큼 충전해서 현재 %s원 있습니다.",money,busCardCoin);
        }
        return busCardCoin;
    }

    public void getTheBus(){
       System.out.println("버스탑욥");
    }
    public void getOutTheBus(){
       System.out.println("버스내려욥");
    }
    public void upDateChange(int change){
       setBusCard(change);
       System.out.printf("%s남았네여",getBusCard());
    }
}
