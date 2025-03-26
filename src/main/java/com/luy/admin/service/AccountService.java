package com.luy.admin.service;

import com.luy.admin.bean.Account;
import com.luy.admin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAcctByid(Long id)
    {
        return accountMapper.getAcct(id);
    }
}
