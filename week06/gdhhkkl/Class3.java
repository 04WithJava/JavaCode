package org.example.gddhhkl;

public class Class3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name="정수인";
        student.age=15;
        student.grade=5;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0]= student;
        students[1]=student2;

        System.out.printf("이름:%s, 나이:%d,성적:%d",students[0].name,students[0].age,students[0].grade);
        System.out.printf("이름:%s, 나이:%d,성적:%d",students[1].name,students[1].age,students[1].grade);
    }
}
