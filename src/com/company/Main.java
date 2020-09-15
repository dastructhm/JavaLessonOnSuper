/*
学习目标：super关键字
概念定义：
实际应用：- Inheritance basically used to achieve dynamic binding or run-time polymorphism in java. Used to access members of a class inherited by the class in which it appears.
        - Allows a subclass to access overridden methods and hidden members of its superclass. The super keyword is also used to forward a call from a constructor to a constructor in the superclass.
        - Also used to specify a lower bound on a type parameter in Generics.
调用API：N/A
另请参阅：- https://en.wikipedia.org/wiki/List_of_Java_keywords
示例工程：- https://github.com/bjdhjy888/LessonOnSuper
*/

package com.company;

public class Main {

    public static void main(String[] args) {
        Student Kim = new Student();
        System.out.println(Kim.PrintGPA());

        BadStudent Amy = new BadStudent();
        System.out.println(Amy.ShowGPA());
    }
}
