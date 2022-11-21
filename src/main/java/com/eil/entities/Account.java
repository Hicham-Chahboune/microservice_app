package com.eil.entities;


import com.eil.enums.AccountType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter@Setter
@Builder
@ToString
@NoArgsConstructor@AllArgsConstructor
public class Account {

    @Id
    private String id;

    private Date createdAt;

    private Double balance;

    private String currency;

    @Enumerated(EnumType.STRING)
    private AccountType type;
}
