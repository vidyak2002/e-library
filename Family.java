package com.training.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Family {
    private String headOfFamily;
    private int noOfMembers;
    private String monthlyExpenditure;
}
