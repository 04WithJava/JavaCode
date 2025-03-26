public class m1 {
    public static void main(String[] args) {
        int score = 87;

        if (score >= 90) {
            System.out.println("A");
        }
        if (score >= 80 && score < 90) {
            System.out.println("B");
        }
        if (score >= 70 && score < 80) {
            System.out.println("C");
        }
        if (score >= 60 && score < 70) {
            System.out.println("D");
        }
        if (score < 60) {
            System.out.println("F");
        }
    }

}
