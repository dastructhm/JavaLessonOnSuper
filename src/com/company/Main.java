package com.company;

public class Main {

    public static void main(String[] args) {
        Student myStudent = new Student();
        System.out.println(myStudent.PrintGPA());

        Student BadStudent = new BadStudent();
        System.out.println(BadStudent.PrintGPA());
    }
}
