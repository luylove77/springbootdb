package com.luy.admin.controller;

import com.luy.admin.bean.Account;
import com.luy.admin.bean.City;
import com.luy.admin.bean.Customer;
import com.luy.admin.service.AccountService;
import com.luy.admin.service.CityService;
import com.luy.admin.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class MyController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private CityService cityService;

    @Autowired
    private CustomerService customerService;

    @PostMapping("/city")
    public void saveCity(City city){
         cityService.saveCity(city);
    }

    //插入客户
    @PostMapping("/customer")
    public void saveCustomer(Customer customer){
        customerService.saveCustomer(customer);
    }

    //删除客户
    @DeleteMapping("/customer")
    public void deleteCustomer(@RequestParam("id") Long id){
        customerService.deleteCustomer(id);
    }

    //修改客户
    @PutMapping("/customer")
    public void updateCustomer(Customer customer){
        customerService.updateCustomer(customer);
    }

    //查询客户
    @GetMapping("/customer")
    public Customer getCustomer(@RequestParam("id") Long id){
        return customerService.getCustomer(id);
    }


    @ResponseBody
    @GetMapping("/city")
    public City getCityById (@RequestParam("id") Long id){
        return cityService.getCityById(id);
    }



    @ResponseBody
    @GetMapping("/acct")
    public Account getById(@RequestParam("id") Long id){
        return accountService.getAcctByid(id);
    }



//    @GetMapping("/stu")
//    public Student getByName(String name){
//        return studentService.getStuByName(name);
    }

