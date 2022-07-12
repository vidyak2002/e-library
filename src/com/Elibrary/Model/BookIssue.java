package com.Elibrary.Model;

public class BookIssue {
    String issuedTo ;
    Book book;

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    public BookIssue(String a, Book b){
        this.book = b;
        this.issuedTo = a;
    }
}
