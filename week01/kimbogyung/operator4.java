package operator;

public class operator4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = ++a;
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;
        b = a++;
        System.out.println("a = " + a + ", b = " + b);


        /*
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a);
        a = a + 1;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);
         */
    }
}
