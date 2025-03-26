package com.atguigu.admin.controller;

import com.atguigu.admin.bean.Account;
import com.atguigu.admin.bean.City;
import com.atguigu.admin.bean.Customer;
import com.atguigu.admin.service.AccountService;
import com.atguigu.admin.service.CityService;
import com.atguigu.admin.service.CustomerService;
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

    @PostMapping("/customer")
    public void saveCustomer(Customer customer){
        customerService.saveCustomer(customer);
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

