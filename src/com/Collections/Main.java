package com.Collections;

import com.Collections.service.StudentService;
import com.Collections.service.impl.StudentServiceImpl;
import com.Training.Exception.CustomException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CustomException {
        List<Student> stu = new ArrayList<>();
        StudentService studentService = new StudentServiceImpl();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Press 1 to add element \n press 2 to exit ");
            int a = sc.nextInt();
            switch (a){
                case 1:
                    try {
                        studentService.add(stu);
                    } catch (CustomException customException){
                        System.out.println(customException.getErrorMessage());
                    }
                    break;
                case 2:
                    sc.close();
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}
