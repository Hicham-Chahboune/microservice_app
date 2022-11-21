package com.eil.mappers;


import com.eil.dtos.AccountReqDto;
import com.eil.dtos.AccountRespDto;
import com.eil.entities.Account;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public AccountRespDto toAccountRespDto(Account account){
        AccountRespDto accountRespDto = new AccountRespDto();
        BeanUtils.copyProperties(account,accountRespDto);
        return accountRespDto;
    }
    public Account fromAccountReqDto(AccountReqDto accountReqDto){
        Account account = new Account();
        BeanUtils.copyProperties(accountReqDto,account);
        return account;
    }

}
