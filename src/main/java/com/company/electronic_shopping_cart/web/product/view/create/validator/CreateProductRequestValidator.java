package com.company.electronic_shopping_cart.web.product.view.create.validator;

import com.company.electronic_shopping_cart.web.product.view.create.CreateProductRequest;
import org.springframework.stereotype.Component;

@Component
public class CreateProductRequestValidator {
    public boolean validate(CreateProductRequest createProductRequest) {
        if (createProductRequest.getPrice() < 0) {
            return false;
        }
        if (createProductRequest.getName().length() <= 0) {
            return false;
        }
        return true;
    }
}
