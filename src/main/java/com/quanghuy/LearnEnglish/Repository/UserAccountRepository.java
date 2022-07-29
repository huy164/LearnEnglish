package com.quanghuy.LearnEnglish.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quanghuy.LearnEnglish.Model.UserAccount;

@Repository 
public interface UserAccountRepository extends JpaRepository<UserAccount,Long>{
    
}
