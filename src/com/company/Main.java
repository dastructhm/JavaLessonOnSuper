/*
学习目标：super关键字
概念定义：
实际应用：- Used to access members of a class inherited by the class in which it appears.
调用API：N/A
另请参阅：- https://en.wikipedia.org/wiki/List_of_Java_keywords
示例工程：- https://github.com/bjdhjy888/LessonOnSuper
*/

package com.company;

public class Main {

    public static void main(String[] args) {
        Student Kim = new Student();
        System.out.println("Kim's GPA is " + Kim.PrintGPA() + ".");

        BadStudent Amy = new BadStudent();
        System.out.println("Amy's GPA is " + Amy.ShowGPA() + ".");
        System.out.println("Amy's GPA is " + Amy.UsingSuperToShowGPA() + ", using super keyword.");
    }
}
