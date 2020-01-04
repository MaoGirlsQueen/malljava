package com.msz.mall.dao;


import com.msz.mall.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProduceMapper {
    @Select("select * from mall_product where id= #{id}")
    Product findById(@Param("id") Integer id);

    Product queryById(Integer id);
}
