package com.quanghuy.LearnEnglish.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User extends Person{
    private String avartar;
    @OneToOne(mappedBy = "user")
    private UserAccount userAccount;
    public void print(){
    //    System.out.println("overiden");
    }
}
