package com.example.smallbankingspring.service;
import com.example.smallbankingspring.model.Account;
import org.springframework.stereotype.Service;

@Service
public class WithdrawalService {

    public void withdraw(Account account, double amountWithdraw){
        account.setAvailableBalance(account.getAvailableBalance()-amountWithdraw);
    }
}
