package com.quanghuy.LearnEnglish.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_account")
public class UserAccount {
    @Id
    private String username;
    private String password;
    @OneToOne
    private User user;
}
