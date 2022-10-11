package com.example.septchallenge2.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String AccountType;

    private int AccountNumber;

    private String AccountName;

    private int Balance;

    private LocalDateTime Date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String name) {
        this.AccountType = name;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int address) {
        this.AccountNumber = address;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String postcode) {
        this.AccountName = postcode;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int age) {
        this.Balance = age;
    }

    public LocalDateTime  getDate() {
        return Date;
    }

    public void setDate(LocalDateTime  job) {
        this.Date = job;
    }

}
