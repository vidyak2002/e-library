package com.Collections;

public class Passengers {
    String name;
    int age;
    String place;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    public Passengers (String a,int b , String c){
        this.age = b;
        this.name = a;
        this.place = c;
    }
}
