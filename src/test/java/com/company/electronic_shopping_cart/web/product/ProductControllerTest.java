package com.company.electronic_shopping_cart.web.product;

import com.company.electronic_shopping_cart.web.product.controller.ProductController;
import com.company.electronic_shopping_cart.web.product.view.create.GetProductResponse;
import com.company.electronic_shopping_cart.web.product.view.create.validator.CreateProductRequestValidator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

public class ProductControllerTest {
    private ProductController productController;

    @Before
    public void start() {
        productController  = new ProductController(new CreateProductRequestValidator());
    }

    @Test
    public void shouldGetProductSuccessfully() {
        ResponseEntity<GetProductResponse> response = productController.getProduct(111);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
