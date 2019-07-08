//package com.company.electronic_shopping_cart.web.cart;
//
//import com.company.electronic_shopping_cart.web.cart.controller.CartController;
//import com.company.electronic_shopping_cart.web.cart.view.GetCartItemResponse;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import static org.junit.Assert.assertEquals;
//
//public class CartControllerTest {
//    private CartController cartController;
//    @Before
//    public void start(){
//        cartController = new CartController();
//    }
//    @Test
//    public void shouldGetCartItemResponseSuccessfully(){
//        ResponseEntity<GetCartItemResponse> response = cartController.getCartItem(111);
//        assertEquals(HttpStatus.OK,response.getStatusCode());
//    }
//}
