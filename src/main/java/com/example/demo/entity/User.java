package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "TB_USER")
public class User {

    @Id
    @GeneratedValue
    private Long id;


    private String name;
    private int age;
}
