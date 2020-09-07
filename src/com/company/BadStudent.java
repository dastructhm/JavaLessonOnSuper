package com.company;

public class BadStudent extends Student {
    int GPA = 1;
    
    public int PrintGPA(){
        // return GPA;
        return super.GPA;
    }
}
