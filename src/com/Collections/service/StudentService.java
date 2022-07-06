package com.Collections.service;

import com.Collections.Student;
import com.Training.Exception.CustomException;

import java.util.List;

public interface StudentService {
    void add(List<Student> stu) throws CustomException;
}
