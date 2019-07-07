package com.company.electronic_shopping_cart.web.cart.model;

import com.company.electronic_shopping_cart.web.product.model.Product;
import com.company.electronic_shopping_cart.web.user.model.User;

import javax.persistence.*;

@Entity
@Table(name="cart_item")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private long quantity;


    public CartItem() {
    }

    public CartItem(User user, Product product, long quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }


    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }


    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
