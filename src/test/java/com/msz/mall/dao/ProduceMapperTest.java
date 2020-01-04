package com.msz.mall.dao;

import com.msz.mall.MallApplicationTests;
import com.msz.mall.pojo.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProduceMapperTest extends MallApplicationTests {
    @Autowired
    private ProduceMapper produceMapper;

    @Test
    public void findById() {
        Product product = produceMapper.findById(26);
        System.out.println(product.toString());
    }
    @Test
    public void queryById() {
        Product product = produceMapper.findById(26);
        System.out.println(product.toString());
    }
}