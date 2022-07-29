package com.quanghuy.LearnEnglish.Model;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import lombok.Data;
@MappedSuperclass
@Data
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    protected String fullname;

    protected String email;

    protected String gender;

    protected String address;

    protected String phonenumber;

    protected Date birthday;
    @Transient
    private int age;

    public abstract void print();
}
