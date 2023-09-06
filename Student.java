package com.training.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.security.auth.Subject;
import java.math.BigDecimal;
import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    private String rollNumber;
    private String studentName;
    private String grade;
    private BigDecimal percentage;
    private  Boolean isMale;
     private ArrayList<SubjectDetails> subjectDetails;

}
