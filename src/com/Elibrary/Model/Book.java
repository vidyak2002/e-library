package com.Elibrary.Model;

public class Book {
    String name;
    String Id;
    String Author;
    String Department;

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

 public Book(String a, String b , String c , String d){
        this.name = a;
        this.Id = b;
        this.Author = c;
        this.Department = d;
 }
}
