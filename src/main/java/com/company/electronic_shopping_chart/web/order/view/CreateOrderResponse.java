package com.company.electronic_shopping_chart.web.order.view;

import com.company.electronic_shopping_chart.web.order.model.Order;

public class CreateOrderResponse {
    private Order order;

    public CreateOrderResponse() {
    }

    public CreateOrderResponse(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
