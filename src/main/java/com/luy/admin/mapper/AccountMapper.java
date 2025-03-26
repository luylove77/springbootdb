package com.luy.admin.mapper;

import com.luy.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    public Account getAcct(Long id);
}
