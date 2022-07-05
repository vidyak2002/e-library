package com.Training;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String n, String b, int a) {
        this.name = n;
        this.breed = b;
        this.age = a;

    }
    public String getName(){
        return this.name;
    }
    public void setName(String a){
        this.name = a;
    }
}
