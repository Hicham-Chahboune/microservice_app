package com.eil.services.impl;


import com.eil.dtos.AccountReqDto;
import com.eil.dtos.AccountRespDto;
import com.eil.entities.Account;
import com.eil.mappers.Mapper;
import com.eil.repositories.AccountRepository;
import com.eil.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class AccountServiceImpl implements AccountService {
    private AccountRepository repository;
    private Mapper mapper;

    @Override
    public List<AccountRespDto> getAccounts() {
        return repository.findAll().stream().map(mapper::toAccountRespDto).collect(Collectors.toList());
    }

    @Override
    public AccountRespDto getById(String id) {
        Account account= repository.findById(id).orElse(null);
        return mapper.toAccountRespDto(account);
    }

    @Override
    public AccountRespDto save(AccountReqDto account) {
        Account accountdto = repository.save(mapper.fromAccountReqDto(account));
        return mapper.toAccountRespDto(accountdto);
    }

    @Override
    public AccountRespDto update( AccountReqDto accountDto) {
        Account account = mapper.fromAccountReqDto(accountDto);

        Account acc = repository.findById(account.getId()).orElseThrow();
        System.out.println(account);
        if(account.getBalance()!=null) acc.setBalance(account.getBalance());
        if(account.getCurrency()!=null) acc.setCurrency(account.getCurrency());
        if(account.getCreatedAt()!=null) acc.setCreatedAt(account.getCreatedAt());

        return mapper.toAccountRespDto(acc);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

}
