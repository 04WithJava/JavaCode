package org.example.gddhhkl;

public class Class2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1","학생2","학생3","학생4"};
        int[] studentAge = {15,16,14,14};
        int[] studentGrades = {98,89,87,50};
        for(int i=0; i<studentNames.length; i++){
            System.out.printf("이름:%s, 나이:%d,성적:%d",studentNames[i],studentAge[i],studentGrades[i]);
        }
    }
}
