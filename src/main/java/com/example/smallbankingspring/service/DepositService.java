package com.example.smallbankingspring.service;
import com.example.smallbankingspring.model.Account;
import org.springframework.stereotype.Service;

@Service
public class DepositService {

    public void deposit(Account account,double amountDeposit){
            account.setAvailableBalance(account.getAvailableBalance()+amountDeposit);
    }
}
