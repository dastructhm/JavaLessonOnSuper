// Inheritance basically used to achieve dynamic binding or run-time polymorphism in java. Used to access members of a class inherited by the class in which it appears.
// Allows a subclass to access overridden methods and hidden members of its superclass. The super keyword is also used to forward a call from a constructor to a constructor in the superclass.
// Also used to specify a lower bound on a type parameter in Generics.

package com.company;

public class Main {

    public static void main(String[] args) {
        Student Kim = new Student();
        System.out.println(Kim.PrintGPA());

        BadStudent Tom = new BadStudent();
        System.out.println(Tom.ShowGPA());
    }
}
