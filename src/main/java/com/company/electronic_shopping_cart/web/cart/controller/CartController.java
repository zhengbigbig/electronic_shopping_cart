package com.company.electronic_shopping_cart.web.cart.controller;

import com.company.electronic_shopping_cart.web.cart.view.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {
    @GetMapping("cartItems")
    public ResponseEntity<ListCartItemsResponse> listCartItems() {
        return new ResponseEntity<>(new ListCartItemsResponse(), HttpStatus.OK);
    }

    @GetMapping("cartItems/{cartItemId}")
    public ResponseEntity<GetCartItemResponse> getCartItem(@PathVariable long cartItemId) {
        return new ResponseEntity<>(new GetCartItemResponse(), HttpStatus.OK);
    }

    @PostMapping("cartItems")
    public ResponseEntity<CreateCartItemResponse> createCartItem(@RequestBody CreateCartItemRequest createCartItemRequest) {
        return new ResponseEntity<>(new CreateCartItemResponse(), HttpStatus.CREATED);
    }

    @PutMapping("/cartItems/{cartItemId}")
    public ResponseEntity<UpdateCartItemResponse> updateCartItem(@PathVariable long cartItemId, @RequestBody UpdateCartItemRequest updateCartItemRequest) {
        return new ResponseEntity<>(new UpdateCartItemResponse(), HttpStatus.OK);
    }

    @DeleteMapping("/cartItems/{cartItemId}")
    public ResponseEntity deleteCartItem(@PathVariable long cartItemId) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
