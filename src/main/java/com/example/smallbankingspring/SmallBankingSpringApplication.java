package com.example.smallbankingspring;

import com.example.smallbankingspring.model.Account;
import com.example.smallbankingspring.service.DepositService;
import com.example.smallbankingspring.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SmallBankingSpringApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =  SpringApplication.run(SmallBankingSpringApplication.class, args);
        Account account =context.getBean(Account.class);

        DepositService depositService=context.getBean(DepositService.class);
        depositService.deposit(account,500);
        System.out.println(account.getAvailableBalance());

        Account senderAccount=context.getBean(Account.class);
        Account recieverAccount=context.getBean(Account.class);
        senderAccount.setAvailableBalance(2000);
        recieverAccount.setAvailableBalance(2000);
        TransferService transferService =context.getBean(TransferService.class);
        transferService.transferWithFee(senderAccount,recieverAccount,500,50);
//        transferService.transferWithoutFee(senderAccount,recieverAccount,500);
        System.out.println("Amount of Sender Account is " + senderAccount.getAvailableBalance());
        System.out.println("Amount of Reciever Account is " + recieverAccount.getAvailableBalance());
    }

}
