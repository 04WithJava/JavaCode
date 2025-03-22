package cond;

public class if6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("1000원 이상 구매, 1000원 할인");
        }   else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }   else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액 :" + discount + "원");

        /*
        int grade = 2;

        int coupon;
        if (grade == 1) {
            coupon = 1000; }
        else if (grade == 2) {
            coupon = 2000; }
        else if (grade == 3) {
            coupon = 3000;}
        else {
            coupon = 500; }
        System.out.println ("발급받은 쿠폰 " + coupon);
         */
    }
}
