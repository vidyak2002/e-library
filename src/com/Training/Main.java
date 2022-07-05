package com.Training;

import com.Training.Exception.CustomException;
import com.Training.Impl.EmployeeManagementServiceImpl;
import com.Training.Impl.MessageServiceImpl;
import com.Training.Service.EmployeeManagementService;
import com.Training.Service.MessageService;

import java.util.ArrayList;
import java.util.Scanner;

class EmployeeManagement
    {

        public static void main(String[] args) throws CustomException {
            EmployeeManagementService employeeManagementService = new EmployeeManagementServiceImpl();
            MessageService messageService = new MessageServiceImpl();

            Scanner sc = new Scanner(System.in);
            ArrayList<Employee> al = new ArrayList<Employee>();
            al.add(new Employee(1,"sai", 50000L,"SoftwareEngineer"));
            messageService.welcome();
            do
            {
               messageService.menu();
                int ch = sc.nextInt();

                switch(ch)
                {
                    case 1:
                        messageService.display(al);
                        break;

                    case 2:
                        try {
                            employeeManagementService.search(al);
                        } catch (CustomException customException){
                            System.out.println(customException.getErrorMessage());
                        }
                        break;

                    case 3:
                        try{
                            employeeManagementService.delete(al);
                } catch (CustomException customException){
                System.out.println(customException.getErrorMessage());
            }
                        break;

                    case 4:

                        employeeManagementService.addEmployee(al);
                        break;

                    case 5:
                        try{
                            employeeManagementService.update(al);
                        } catch (CustomException customException){
                            System.out.println(customException.getErrorMessage());
                        }
                        break;
                    case 6:
                        messageService.exit();
                        sc.close();
                        System.exit(0);
                        break;

                    default : System.out.println("\nEnter a correct choice from the List :");
                        break;

                }
            }
            while(true);
        }


  /*  public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if(age<0){
            throw new Exception("Invalid age");
        } else {
            System.out.print(age);
        }*/

       /* int[][] arr = new int[][]{new int[]{0, 1, 0, 1, 1}, new int[]{1, 1, 0, 0, 0}, new int[]{1, 1, 1, 1, 0}, new int[]{0, 0, 0, 0, 1},
                new int[]{1, 0, 1, 0, 1}};

            System.out.println("The matrix is");

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }

            System.out.println("enter indexes");

            Scanner sc = new Scanner(System.in);

            int row = sc.nextInt();
            int column = sc.nextInt();
            int count = 0;
            try {
                int number = arr[row - 1][column];
                count++;
            } catch (Exception ignored) {

            }

            try {
                int number = arr[row][column - 1];
                count++;
            } catch (Exception ignored) {

            }

            try {
                int number = arr[row + 1][column];
                count++;
            } catch (Exception ignored) {

            }

            try {
                int number = arr[row][column + 1];
                count++;
            } catch (Exception ignored) {

            } finally {
                System.out.println("count is " + count);
            }*/
     /*   Dog d = new Dog("aba", "hus", 5);
        int n = 10;

        switch (n) {
            case 10:
                System.out.println("10");
                break;
            case 5:
                System.out.println("less than 10");
                break;
            case 20:
                System.out.println("greater than 10");
                break;
            default:
                System.out.println("adbahda");

        }
        if(n==10){
            System.out.println("10");
        } else if(n==5) {
            System.out.println("less than 10");
        } else if(n==20) {
            System.out.println("greater than 10");
        } else  {
            System.out.println("adbahda");
        }*/
       /* for (int i = 0; i < a.length; i++) {
            if (i >= 0) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]);
                }
            } else {
                for (int j = a[i].length - 1; j >= 0; j--) {
                    System.out.print(a[i][j]);
                }
            }
            System.out.println();
        }*/
            /* outerElements(0,0);*/



    public static void outerElements(int b, int c){
        int[][] a = {{1, 0, 1, 0}, {1, 1, 0, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}};
        for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]);
                }
            System.out.println();
        }
        for (int i = b - 1; i < b + 2; i++) {
            if ((i < a.length) && (i >= 0)) {
                for (int j = c - 1; j < c + 2; j++) {

                    if ((j >= 0) && (j < a[i].length)) {
                        if (!((i == b) && (j == c))) {
                            System.out.print(a[i][j]);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }

    }
}
