package com.example.SpringSecEx.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private String id;
    private String name;
    private int marks;
    public Student(String id,String name,int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
        
    }
}
