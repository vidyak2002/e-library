package com.Collections;

public class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    String name ;
    int rollNo ;
    String classs ;
    public  Student (String a, int b, String c){
        this.name = a;
        this.classs= c;
        this.rollNo = b;
    }
}
