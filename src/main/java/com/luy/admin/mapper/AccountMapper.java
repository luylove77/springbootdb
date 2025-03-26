package com.luy.admin.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.luy.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DS("db1")
public interface AccountMapper {
    public Account getAcct(Long id);
}
