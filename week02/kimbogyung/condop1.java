package cond;

public class condop1 {
    public static void main(String[] args) {
        int age = 17;
        String status;
        if (age >= 19) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + " status = " + status);
    }

}
