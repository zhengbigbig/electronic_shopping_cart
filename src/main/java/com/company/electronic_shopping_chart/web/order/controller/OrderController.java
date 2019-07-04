package com.company.electronic_shopping_chart.web.order.controller;

import com.company.electronic_shopping_chart.web.cart.view.CreateCartItemRequest;
import com.company.electronic_shopping_chart.web.cart.view.UpdateCartItemRequest;
import com.company.electronic_shopping_chart.web.cart.view.UpdateCartItemResponse;
import com.company.electronic_shopping_chart.web.order.view.CreateOrderResponse;
import com.company.electronic_shopping_chart.web.order.view.GetOrderResponse;
import com.company.electronic_shopping_chart.web.order.view.ListOrdersResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @GetMapping("orders")
    public ResponseEntity<ListOrdersResponse> listOrders(){
        return new ResponseEntity<>(new ListOrdersResponse(), HttpStatus.OK);
    }

    @GetMapping("orders/{orderId}")
    public ResponseEntity<GetOrderResponse> getOrder(@PathVariable long orderId){
        return new ResponseEntity<>(new GetOrderResponse(),HttpStatus.OK);
    }

    @PostMapping("orders")
    public ResponseEntity<CreateOrderResponse> createOrder(@RequestBody CreateCartItemRequest createCartItemRequest){
        return new ResponseEntity<>(new CreateOrderResponse(),HttpStatus.CREATED);
    }

    @PutMapping("orders/{orderId}")
    public ResponseEntity<UpdateCartItemResponse> updateOrder(@PathVariable long orderId, @RequestBody UpdateCartItemRequest updateCartItemRequest){
        return new ResponseEntity<>(new UpdateCartItemResponse(),HttpStatus.OK);
    }

    @DeleteMapping("orders/{orderId}")
    public ResponseEntity deleteOrder(@PathVariable long orderId){
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
