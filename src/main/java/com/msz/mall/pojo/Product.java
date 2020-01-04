package com.msz.mall.pojo;


import lombok.Data;
import java.util.Date;
@Data
public class Product {
    private Integer id;
    private Integer categoryId;
    private String name;
    private String subtitle;
    private String mainImage;
    private String subImages;
    private String detail;
    private Float price;
    private Integer stock;
    private Integer status;
    private Date createTime;
    private Date updateTime;

}
