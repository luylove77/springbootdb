package com.luy.admin.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.luy.admin.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
@DS("db1")
public interface CityMapper {
    @Select("select * from city where id = #{id}")
    public City getById(Long id);

    @Insert("insert into city (name, state, country) values (#{name}, #{state}, #{country})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void insert(City city);

}


