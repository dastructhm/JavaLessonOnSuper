package com.company;

public class BadStudent extends Student {
    int GPA = 2;
    
    public int ShowGPA(){
        // return GPA;
        return GPA;

    }

    public int UsingSuperToShowGPA(){
        // return GPA;
        return super.GPA;

    }
}
