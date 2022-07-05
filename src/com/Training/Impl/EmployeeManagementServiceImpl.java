package com.Training.Impl;

import com.Training.Employee;
import com.Training.Exception.CustomException;
import com.Training.Service.EmployeeManagementService;
import com.Training.Service.MessageService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementServiceImpl implements EmployeeManagementService {
    MessageService messageService = new MessageServiceImpl();
    public void search(ArrayList<Employee> al) throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSearch Employee Details by :\n" +
                "1). Employee ID\n" +
                "2). Name\n");
        System.out.println("Enter your choice to search : ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("enter the id:");
               int id = sc.nextInt();
                int i = 0;
                for (Employee e : al) {
                    if (id == e.getId()) {
                        System.out.println(e + "\n");
                        i++;
                    }
                }
                if (i == 0) {
                    throw new CustomException("Employee Details are not available, Please enter a valid ID!!");
                }
                break;

            case 2:
                System.out.println("enter the name:");
               String name = sc.next();
                int j = 0;
                for (Employee e : al) {
                    if (name.equalsIgnoreCase(e.getName())) {
                        System.out.println(e + "\n");
                        j++;
                    }
                }
                if (j == 0) {
                    throw new CustomException("Employee Details are not available, Please enter a valid Name!!");
                }
                break;

        }
    }
    public  void delete(ArrayList<Employee> al) throws CustomException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDelete Employee Details by :\n" +
                "1). Employee ID\n" +
                "2). Name\n");
        System.out.println("Enter your choice to delete : ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("enter the id:");
                int id = sc.nextInt();
                int k = 0;
                try {
                    for (Employee e : al) {
                        if (id == e.getId()) {
                            al.remove(e);
                            messageService.display(al);
                            k++;
                        }
                    }
                    if (k == 0) {
                        throw new CustomException("Employee Details are not available, Please enter a valid ID!!");
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                break;
            case 2:
                System.out.println("enter the name");
              String  name = sc.next();
                int l = 0;
                try {
                    for (Employee e : al) {
                        if (name == e.getName()) {
                            al.remove(e);
                            messageService.display(al);
                            l++;
                        }
                    }
                    if (l == 0) {
                        throw new CustomException("Employee Details are not available, Please enter a valid name!!");
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
        }
    }
    public  void addEmployee(ArrayList<Employee> al){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the following details to ADD list:\n");
        System.out.println("Enter ID :");
       int  id = sc.nextInt();
        System.out.println("Enter Name :");
       String name = sc.next();
        System.out.println("Enter Salary :");
        Long salary = sc.nextLong();
        System.out.println("Enter Designation :");
        String designation = sc.next();
        al.add(new Employee(id, name, salary, designation));
        messageService.display(al);
    }

    public  void update(ArrayList<Employee> al) throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Employee ID to EDIT the details");
       int  id = sc.nextInt();
        int j=0;
        for(Employee e: al)
        {
            if(id == e.getId())
            {
                j++;
                do{
                    int ch1 =0;
                    System.out.println("\nEDIT Employee Details :\n" +
                            "1). Employee ID\n" +
                            "2). Name\n" +
                            "3). Salary\n" +
                            "4). Designation\n" +
                            "5). GO BACK\n");
                    System.out.println("Enter your choice : ");
                    ch1 = sc.nextInt();
                    switch(ch1)
                    {
                        case 1: throw new CustomException("We cannot update Employee Id ");
                        case 2: System.out.println("Enter new Employee Name:");
                        String name = sc.next();
                            e.setName(name);
                            System.out.println(e+"\n");
                            break;

                        case 3: System.out.println("Enter new Employee Salary:");
                        Long sal = sc.nextLong();
                            e.setSalary(sal);
                            System.out.println(e+"\n");
                            break;

                        case 4: System.out.println("Enter new Employee Designation :");
                        String des = sc.next();
                            e.setDesignation(des);
                            System.out.println(e+"\n");
                            break;

                        case 5: j++;
                            break;

                        default : System.out.println("\nEnter a correct choice from the List :");
                            break;

                    }
                }
                while(j==1);
            }
        }
        if(j == 0)
        {
          throw new CustomException("Employee Details are not available, Please enter a valid ID!!");
        }

    }

}
