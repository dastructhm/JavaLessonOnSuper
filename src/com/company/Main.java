package com.company;

public class Main {

    public static void main(String[] args) {
        Student Kim = new Student();
        System.out.println(Kim.PrintGPA());

        BadStudent Tom = new BadStudent();
        System.out.println(Tom.ShowGPA());
    }
}
