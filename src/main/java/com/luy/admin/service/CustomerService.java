package com.luy.admin.service;

import com.luy.admin.bean.Customer;
import com.luy.admin.mapper.CustomerMapper;
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

    //删除客户
    public void deleteCustomer(Long id){
        customerMapper.deleteById(id);
    }

    //修改客户
    public void updateCustomer(Customer customer){
        customerMapper.updateById(customer);
    }

    //查询客户
    public Customer getCustomer(Long id){
        return customerMapper.selectById(id);
    }

}
