package com.company.electronic_shopping_chart.web.cart.view;

public class UpdateCartItemRequest {
    private long quantity;

    public UpdateCartItemRequest() {
    }

    public UpdateCartItemRequest(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
