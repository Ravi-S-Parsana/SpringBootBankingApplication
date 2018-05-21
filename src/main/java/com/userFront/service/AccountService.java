package com.userFront.service;

import java.security.Principal;

import com.userFront.Domain.PrimaryAccount;
import com.userFront.Domain.SavingsAccount;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
