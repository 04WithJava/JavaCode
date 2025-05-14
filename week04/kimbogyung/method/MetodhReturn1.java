public class MetodhReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}

/* 컴파일 오류나는 코드
boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
 */