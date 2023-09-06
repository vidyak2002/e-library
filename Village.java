package com.training.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Village {
    private String name;
    private String pincode;
    private Boolean iscity;
    private ArrayList<Family> families;
}
