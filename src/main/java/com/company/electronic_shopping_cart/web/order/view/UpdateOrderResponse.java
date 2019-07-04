package com.company.electronic_shopping_cart.web.order.view;

import com.company.electronic_shopping_cart.web.order.model.Order;

public class UpdateOrderResponse {
    private Order order;

    public UpdateOrderResponse() {
    }

    public UpdateOrderResponse(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
