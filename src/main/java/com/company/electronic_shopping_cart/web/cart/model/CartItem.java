package com.company.electronic_shopping_cart.web.cart.model;

import com.company.electronic_shopping_cart.web.product.model.Product;

public class CartItem {
    private long id;
    private String name;
    private Product products;

    public CartItem() {
    }

    public CartItem(long id, String name, Product products) {
        this.id = id;
        this.name = name;
        this.products = products;
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

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }
}
