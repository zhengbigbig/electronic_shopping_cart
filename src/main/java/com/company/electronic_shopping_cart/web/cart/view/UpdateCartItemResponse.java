package com.company.electronic_shopping_cart.web.cart.view;

import com.company.electronic_shopping_cart.web.cart.model.CartItem;

public class UpdateCartItemResponse {
    private CartItem item;

    public UpdateCartItemResponse(CartItem item) {
        this.item = item;
    }

    public UpdateCartItemResponse() {
    }

    public CartItem getItem() {
        return item;
    }

    public void setItem(CartItem item) {
        this.item = item;
    }
}
