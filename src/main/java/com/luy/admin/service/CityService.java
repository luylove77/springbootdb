package com.luy.admin.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.luy.admin.bean.City;
import com.luy.admin.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("db1")
public class CityService {

    @Autowired
    CityMapper cityMapper;

    public City getCityById(Long id){
        return cityMapper.getById(id);
    }

    public void saveCity(City city){
        cityMapper.insert(city);
    }

}
