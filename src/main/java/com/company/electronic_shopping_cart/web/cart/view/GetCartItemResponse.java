package com.company.electronic_shopping_cart.web.cart.view;

import com.company.electronic_shopping_cart.web.cart.model.CartItem;

public class GetCartItemResponse {
    private CartItem item;

    public GetCartItemResponse() {
    }

    public GetCartItemResponse(CartItem item) {
        this.item = item;
    }

    public CartItem getItem() {
        return item;
    }

    public void setItem(CartItem item) {
        this.item = item;
    }
}
