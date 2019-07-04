package com.company.electronic_shopping_cart.web.order.view;

import com.company.electronic_shopping_cart.web.order.model.Order;

import java.util.List;

public class ListOrdersResponse {
    private List<Order>  orders;

    public ListOrdersResponse() {
    }

    public ListOrdersResponse(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
