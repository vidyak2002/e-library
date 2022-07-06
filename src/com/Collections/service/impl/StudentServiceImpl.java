package com.Collections.service.impl;

import com.Collections.Student;
import com.Collections.service.StudentService;
import com.Training.Exception.CustomException;

import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    public void add(List<Student> stu) throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the student");
        String a = sc.next();
        System.out.println("enter the rollNo of the student");
        int b = sc.nextInt();
        for(Student s : stu){
            if(b==s.getRollNo()){
                throw new CustomException("Roll no already exists");
            }
        }
        System.out.println("enter the Class of the student");
        String c = sc.next();
        stu.add(new Student(a,b,c));
        System.out.println("\n-------------Student data ---------------\n");
        System.out.println(String.format("%-10s%-15s%-10s", "Name","ROllNo","Class"));
        for(Student e : stu)
        {
            System.out.println(String.format("%-10s%-15s%-10s",e.getName(),e.getRollNo(),e.getClasss()));
        }
    }
}
