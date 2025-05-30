package com.luy.admin.mapper;

import com.luy.admin.bean.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.dynamic.datasource.annotation.DS;

@Mapper
@DS("db1")
public interface CustomerMapper extends BaseMapper<Customer> {

}
