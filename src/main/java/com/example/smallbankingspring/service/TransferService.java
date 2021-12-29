package com.example.smallbankingspring.service;

import com.example.smallbankingspring.model.Account;
import org.springframework.stereotype.Service;

@Service
public class TransferService {
    public void transferWithoutFee(Account senderAccount,Account recieverAccount,double amountTransfer){
        senderAccount.setAvailableBalance(senderAccount.getAvailableBalance()-amountTransfer);
        recieverAccount.setAvailableBalance(recieverAccount.getAvailableBalance()+amountTransfer);
    }
    public void transferWithFee(Account senderAccount,Account recieverAccount,double amountTransfer,double fee){
        senderAccount.setAvailableBalance(senderAccount.getAvailableBalance()-amountTransfer-fee);
        recieverAccount.setAvailableBalance(recieverAccount.getAvailableBalance()+amountTransfer);
    }
}
