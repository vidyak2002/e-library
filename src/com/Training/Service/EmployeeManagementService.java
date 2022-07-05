package com.Training.Service;

import com.Training.Employee;
import com.Training.Exception.CustomException;

import java.util.ArrayList;

public interface EmployeeManagementService {
     void search(ArrayList<Employee> al) throws CustomException;
     void delete(ArrayList<Employee> al) throws CustomException;
    void addEmployee(ArrayList<Employee> al) throws CustomException;
    void update(ArrayList<Employee> al) throws CustomException;
}
