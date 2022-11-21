package com.eil.dtos;

import com.eil.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;


@Builder@Data@AllArgsConstructor@NoArgsConstructor
public class AccountRespDto {
    private String id;
    private Date createdAt;
    private Double balance;
    private String currency;
    private AccountType type;
}
