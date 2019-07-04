package com.company.electronic_shopping_chart.web.order.model;

import com.company.electronic_shopping_chart.web.product.model.Product;

public class Order {
    private Product product;
    private long quantity;
    private String status;
    private String address;

    public Order() {
    }

    public Order(Product product, long quantity, String status, String address) {
        this.product = product;
        this.quantity = quantity;
        this.status = status;
        this.address = address;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
