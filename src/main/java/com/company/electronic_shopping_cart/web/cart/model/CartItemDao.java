package com.company.electronic_shopping_cart.web.cart.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemDao extends CrudRepository <CartItem,Long>{

}
