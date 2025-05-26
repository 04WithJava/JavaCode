package org.example.gddhhkl;

public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name="이소빈";
        student1.age=22;
        student1.grade=3;

        System.out.printf("이름:%s, 나이:%d,성적:%d",student1.name,student1.age,student1.grade);
    }
}
