package com.Elibrary.Controller;

import com.Elibrary.Exception.BookAlreadyIssuedException;
import com.Elibrary.Exception.ISBNAlreadyExistsException;
import com.Elibrary.Exception.ISBNDoesNotExistsException;
import com.Elibrary.Inventory.BookInventory;
import com.Elibrary.Model.Book;
import com.Elibrary.Model.BookIssue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BookInventoryController {

    public static void main(String[] args) {
        System.out.println("Welcome to the E-Library");
        System.out.println("Enter the No of Books to be stored :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Book> bookList = new ArrayList<>();
        List<BookIssue> bookIssueList = new ArrayList<>();
        try {
            BookInventory.createBookInventory(n, bookList);
        } catch (ISBNAlreadyExistsException exception){
            System.out.println(exception.getErrorMessage());
        }
        try {
            BookInventory.issueBook(n, bookList, bookIssueList);
        } catch (BookAlreadyIssuedException exception){
            System.out.println(exception.getErrorMessage());
        } catch (ISBNDoesNotExistsException exception){
            System.out.println(exception.getErrorMessage());
        }

    }
}
