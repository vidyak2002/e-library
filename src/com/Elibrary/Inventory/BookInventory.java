package com.Elibrary.Inventory;

import com.Elibrary.Exception.BookAlreadyIssuedException;
import com.Elibrary.Exception.ISBNAlreadyExistsException;
import com.Elibrary.Exception.ISBNDoesNotExistsException;
import com.Elibrary.Model.Book;
import com.Elibrary.Model.BookIssue;

import java.util.List;
import java.util.Scanner;

public class BookInventory {
    public static void createBookInventory(int n,List<Book> bookList) throws ISBNAlreadyExistsException {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to book inventory");
        int i = 1;
        while(i<=n){
            Book newBook = new Book();
            System.out.println("Enter the Book details to be stored");
            System.out.println("Enter the book Id");
            String id = sc.next();
            for(Book book :bookList){
                if(id.equalsIgnoreCase(book.getId())){
                    throw new ISBNAlreadyExistsException("Book already existed in the collection");
                }
            }
            newBook.setId(id);
            System.out.println("Enter the book name");
            newBook.setName(sc.next());
            System.out.println("Enter the book Author");
            newBook.setAuthor(sc.next());
            System.out.println("Enter the book department");
            newBook.setDepartment(sc.next());
            bookList.add(newBook);
            i++;
        }
    }

    public static void issueBook(int n, List<Book> bookList, List<BookIssue> bookIssueList) throws BookAlreadyIssuedException, ISBNDoesNotExistsException {
        System.out.println("Welcome to Book issue department");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Press 1 to issue a book \n Press 2 to exit");
            System.out.println("enter your chouce :");
            int c = sc.nextInt();
            switch (c){
                case 1:
                    System.out.println("Enter the Id of the book to be issued :");
                    String id = sc.next();
                    Boolean isPresent = false ;
                    Boolean isIssued = false;
                    for(Book book :bookList){
                        for (BookIssue bookIssue: bookIssueList){
                            if(id.equalsIgnoreCase(bookIssue.getBook().getId())){
                                isIssued = true;
                            }
                        }
                        if(isIssued){
                            throw new BookAlreadyIssuedException("This book is alreadyIssued to other person:");
                        } else  if(id.equalsIgnoreCase(book.getId())){
                            isPresent= true;
                            System.out.println("Enter the name to whom the book was issued :");
                            String name = sc.next();
                            bookIssueList.add(new BookIssue(name,book));
                            bookList.remove(book);
                        }

                    }
                    if(!isPresent){
                        throw new ISBNDoesNotExistsException("This Book doestnot exist in the Store ");
                    }
                    break;
                case 2:
                    System.out.println("\n--------------Issued books data ---------------\n");
                    System.out.println(String.format("%-10s%-15s%-10s%-10s%-10s","IssuedTo","ID","Name","author","Department"));
                    for(BookIssue bookIssue : bookIssueList)
                    {
                        Book e = bookIssue.getBook();
                        System.out.println(String.format("%-10s%-15s%-10s%-10s%-10s",bookIssue.getIssuedTo(),e.getId(),e.getName(),e.getAuthor(),e.getDepartment()));
                    }
                    sc.close();
                    System.exit(0);
                    break;
            }

        } while (true);
    }
}
