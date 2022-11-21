package com.eil;

import com.eil.entities.Account;
import com.eil.enums.AccountType;
import com.eil.repositories.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class BankMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner run(AccountRepository repository){
        return args -> {

            repository.save(Account.builder()
                    .id(UUID.randomUUID().toString())
                    .balance(Math.random()*200)
                    .currency("mad")
                    .createdAt(new Date())
                    .type(AccountType.CURRENT_ACCOUNT)
                    .build());
            repository.save(Account.builder()
                    .id(UUID.randomUUID().toString())
                    .balance(Math.random()*200)
                    .currency("mad")
                    .createdAt(new Date())
                    .type(AccountType.SAVING_ACCOUNT)
                    .build());
            repository.save(Account.builder()
                    .id(UUID.randomUUID().toString())
                    .balance(Math.random()*200)
                    .currency("usd")
                    .createdAt(new Date())
                    .type(AccountType.SAVING_ACCOUNT)
                    .build());
            repository.save(Account.builder()
                    .id(UUID.randomUUID().toString())
                    .balance(Math.random()*200)
                    .currency("euro")
                    .createdAt(new Date())
                    .type(AccountType.CURRENT_ACCOUNT)
                    .build());
        };
    }
}
