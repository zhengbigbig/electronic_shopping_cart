package com.company.electronic_shopping_cart.web.order.controller;

import com.company.electronic_shopping_cart.web.cart.view.CreateCartItemRequest;
import com.company.electronic_shopping_cart.web.cart.view.UpdateCartItemRequest;
import com.company.electronic_shopping_cart.web.cart.view.UpdateCartItemResponse;
import com.company.electronic_shopping_cart.web.order.model.Order;
import com.company.electronic_shopping_cart.web.order.model.OrderDao;
import com.company.electronic_shopping_cart.web.order.view.*;
import com.company.electronic_shopping_cart.web.product.model.Product;
import com.company.electronic_shopping_cart.web.product.model.ProductDao;
import com.company.electronic_shopping_cart.web.user.model.User;
import com.company.electronic_shopping_cart.web.user.model.UserDao;
import org.aspectj.weaver.ast.Or;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private UserDao userDao;
    private ProductDao productDao;
    private OrderDao orderDao;

    public OrderController(UserDao userDao, ProductDao productDao, OrderDao orderDao) {
        this.userDao = userDao;
        this.productDao = productDao;
        this.orderDao = orderDao;
    }

    @GetMapping("/orders")
    public ResponseEntity<ListOrdersResponse> listOrders(){
        List<Order> orders = orderDao.findAll();
        return new ResponseEntity<>(new ListOrdersResponse(orders), HttpStatus.OK);
    }

    @GetMapping("/orders/{orderId}")
    public ResponseEntity<GetOrderResponse> getOrder(@PathVariable long orderId){
        Order order = orderDao.getById(orderId);
        if(order == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(new GetOrderResponse(order),HttpStatus.OK);
    }

    @PostMapping("/orders")
    public ResponseEntity<CreateOrderResponse> createOrder(@RequestBody CreateOrderRequest createOrderRequest){
        User user = userDao.getById(createOrderRequest.getUserId());
        Product product = productDao.getById(createOrderRequest.getProductId());
        Order order = new Order(user,product,createOrderRequest.getQuantity(),createOrderRequest.getStatus(),createOrderRequest.getAddress());
        order = orderDao.save(order);
        return new ResponseEntity<>(new CreateOrderResponse(order),HttpStatus.CREATED);
    }

    @PutMapping("/orders/{orderId}")
    public ResponseEntity<UpdateOrderResponse> updateOrder(@PathVariable long orderId, @RequestBody UpdateOrderRequest updateOrderRequest){
        Order order = orderDao.getById(orderId);
        if(order == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        order.setQuantity(updateOrderRequest.getQuantity());
        order.setAddress(updateOrderRequest.getAddress());
        order.setStatus(updateOrderRequest.getStatus());

        return new ResponseEntity<>(new UpdateOrderResponse(order),HttpStatus.OK);
    }

    @DeleteMapping("/orders/{orderId}")
    public ResponseEntity deleteOrder(@PathVariable long orderId){
        Order order = orderDao.getById(orderId);
        if(order == null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        orderDao.delete(order);
        return new ResponseEntity(HttpStatus.OK);
    }
}
