package com.Training.Service;

import com.Training.Employee;

import java.util.ArrayList;

public interface MessageService  {
    void display(ArrayList<Employee> al);
    void welcome();
    void menu();
    void exit();
}
