//package com.company.electronic_shopping_cart.web.order;
//
//import com.company.electronic_shopping_cart.web.order.controller.OrderController;
//import com.company.electronic_shopping_cart.web.order.view.GetOrderResponse;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import static org.junit.Assert.assertEquals;
//
//public class OrderControllerTest {
//    private OrderController orderController;
//    @Before
//    public void start(){
//        orderController = new OrderController();
//    }
//    @Test
//    public void shouldGetOrderSuccessfully(){
//        ResponseEntity<GetOrderResponse> response = orderController.getOrder(111);
//        assertEquals(HttpStatus.OK,response.getStatusCode());
//    }
//}
