public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int [] studentAges = {15, 16};
        int [] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " +  studentNames[i]);
            System.out.println("나이 : " + studentAges[i]);
            System.out.println("성적 : " + studentGrades[i]);
            System.out.println(" ");
        }
    }
}
