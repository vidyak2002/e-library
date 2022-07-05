package com.Training.Impl;

import com.Training.Employee;
import com.Training.Service.MessageService;

import java.util.ArrayList;

public class MessageServiceImpl implements MessageService {
    public  void display(ArrayList<Employee> al)
    {
        System.out.println("\n--------------Employees data ---------------\n");
        System.out.println(String.format("%-10s%-15s%-10s%-10s", "ID","Name","salary","Designation"));
        for(Employee e : al)
        {
            System.out.println(String.format("%-5s%-20s%-10s%-10s",e.getId(),e.getName(),e.getSalary(),e.getDesignation()));
        }
    }
    public  void welcome(){
        System.out.println("\n-----Welcome to Employee management Page------ \n");
    }
    public  void menu(){
        System.out.println("1). Display all Employees working in this company\n" +
                "2). Search for Employee\n" +
                "3). Delete Employee Details\n" +
                "4). Add Employee\n" +
                "5).Update employee" );
        System.out.println("give your choice : ");
    }
    public  void exit() {
        System.out.println("\nYou have chosen EXIT !! Saving Files and closing the tool.");
    }

}
