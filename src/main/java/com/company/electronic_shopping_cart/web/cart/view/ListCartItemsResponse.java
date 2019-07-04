package com.company.electronic_shopping_cart.web.cart.view;

import com.company.electronic_shopping_cart.web.cart.model.CartItem;

import java.util.List;

public class ListCartItemsResponse {
    private List<CartItem> items;

    public ListCartItemsResponse() {
    }

    public ListCartItemsResponse(List<CartItem> items) {
        this.items = items;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }
}
