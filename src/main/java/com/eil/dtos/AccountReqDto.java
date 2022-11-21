package com.eil.dtos;

import com.eil.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountReqDto {
    private Double balance;
    private String currency;
    private AccountType type;
}
