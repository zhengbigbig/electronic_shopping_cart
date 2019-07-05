package com.company.electronic_shopping_cart.web.product.model;

/*
    数据库中表在java代码里的映射和封装
    数据 和 对象的Mapping
 */

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    /*
        Product的属性  以及 它在数据表中的映射
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;


    /*
        默认的构造方法
     */

    public Product() {
    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
