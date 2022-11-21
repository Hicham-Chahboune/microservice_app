package com.eil.web;

import com.eil.dtos.AccountReqDto;
import com.eil.dtos.AccountRespDto;
import com.eil.entities.Account;
import com.eil.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/accounts")
public class AccountRestController {

    private AccountService accountService;

    @GetMapping
    public List<AccountRespDto> getAccounts(){
        return accountService.getAccounts();
    }
    @GetMapping("{id}")
    AccountRespDto getById(@PathVariable String id){
        return accountService.getById(id);
    }
    @PostMapping
    AccountRespDto save(@RequestBody AccountReqDto account){
        return accountService.save(account);
    }
    @PutMapping()
    AccountRespDto update(@RequestBody AccountReqDto account){
        return accountService.update(account);
    }

    @DeleteMapping()
    void delete(@PathVariable String id){
         accountService.delete(id);
    }

}
