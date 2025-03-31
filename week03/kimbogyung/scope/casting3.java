package casting;

public class casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648l;
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting= " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting= " + intValue);
    }
}
