package com.example.septchallenge2.controller;

import com.example.septchallenge2.dao.Account;
import com.example.septchallenge2.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    //Get by ID
    @GetMapping(path="/{id}", produces = "application/json")
    public Optional<Account> getPerson(@PathVariable("id") int id) {

        return accountRepository.findById(id);
    }

    //Get all
    @GetMapping(path="s/account")
    public @ResponseBody Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    //Update an item
    @PutMapping
    Account updateAccount(@RequestBody Account account) {
        return accountRepository.save(account);
    }

    //Delete item
    @DeleteMapping(path = "/{id}", produces = "application/json")
    public void deleteItem(@PathVariable("id") int id){
        accountRepository.deleteById(id);
    }
}
