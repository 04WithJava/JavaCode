package cond;

public class switch2 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch(grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);

        /*
        int grade = 2;

        int coupon;
        switch(grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰 " + coupon);


        int grade = 2;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
            };
        System.out.println("발급받은 쿠폰" + coupon);
        */
    }
}
