package org.example.gddhhkl;

public class Class3리팩토링 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name="학생1";
        student.age=15;
        student.grade=18;

        Student student1 = new Student();
        student1.name="학생2";
        student1.age = 12;
        student1.grade=5;

        Student[] students = new Student[]{student,student1};
        for(int i=0; i<students.length;i++){
            System.out.printf("이름:%s,나이:%d, 성적:%d",students[i].name,students[i].age,students[i].grade);
        }

    }
}
