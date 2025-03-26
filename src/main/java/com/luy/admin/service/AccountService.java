package com.luy.admin.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.luy.admin.bean.Account;
import com.luy.admin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("db1")
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAcctByid(Long id)
    {
        return accountMapper.getAcct(id);
    }
}
