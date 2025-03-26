package com.atguigu.admin.service;

import com.atguigu.admin.bean.Customer;
import com.atguigu.admin.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    //插入客户
    public void saveCustomer(Customer customer){
        customerMapper.insert(customer);
    }

}
