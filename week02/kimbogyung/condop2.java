package cond;

public class condop2 {
    public static void main(String[] args) {
        int age = 15;
        String status = (age >= 19) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
    }
}
