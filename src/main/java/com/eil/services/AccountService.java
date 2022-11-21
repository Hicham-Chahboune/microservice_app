package com.eil.services;


import com.eil.dtos.AccountReqDto;
import com.eil.dtos.AccountRespDto;
import com.eil.entities.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {

    List<AccountRespDto> getAccounts();
    AccountRespDto getById(String id);
    AccountRespDto save(AccountReqDto account);
    AccountRespDto update(AccountReqDto account);
    void delete(String id);

}
