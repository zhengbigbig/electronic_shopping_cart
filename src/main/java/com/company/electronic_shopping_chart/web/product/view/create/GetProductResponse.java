package com.company.electronic_shopping_chart.web.product.view.create;

import com.company.electronic_shopping_chart.web.product.model.Product;

public class GetProductResponse {
    private Product product;

    public GetProductResponse() {
    }

    public GetProductResponse(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
