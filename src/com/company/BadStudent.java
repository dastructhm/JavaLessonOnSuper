package com.company;

public class BadStudent extends Student {
    int GPA = 1;
    
    public int ShowGPA(){
        // return GPA;
        return super.GPA;

    }
}
