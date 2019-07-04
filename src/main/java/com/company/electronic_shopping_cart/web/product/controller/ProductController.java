package com.company.electronic_shopping_cart.web.product.controller;

import com.company.electronic_shopping_cart.web.product.view.create.*;
import com.company.electronic_shopping_cart.web.product.view.create.validator.CreateProductRequestValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private CreateProductRequestValidator createProductRequestValidator;

    public ProductController(CreateProductRequestValidator createProductRequestValidator) {
        this.createProductRequestValidator = createProductRequestValidator;
    }

    /**
     * list products
     *
     * @return
     */
    @GetMapping("/products")
    public ResponseEntity<ListProductResponse> listProducts() {
        return new ResponseEntity<>(new ListProductResponse(), HttpStatus.OK);
    }

    /**
     * get product
     *
     * @return
     */
    @GetMapping("/pooducts/{productId}")
    public ResponseEntity<GetProductResponse> getProduct(@PathVariable long productId) {
        return new ResponseEntity<>(new GetProductResponse(), HttpStatus.OK);
    }

    /**
     * create product
     * @param createProductRequest
     * @return
     */
    @PostMapping("products")
    public ResponseEntity<CreateProductResponse> createProduct(@RequestBody CreateProductRequest createProductRequest) {
        boolean validate = createProductRequestValidator.validate(createProductRequest);
        return new ResponseEntity<>(new CreateProductResponse(), HttpStatus.CREATED);
    }

    /*
    * 已经定义好了输入和输出
    * 同时也定义好了期待的输入内容和相应的执行结果
    * 想象成一个黑箱，是不是可以写测试了，即使没有实现，但是起始状态测试是不能通过的，只是用来帮助我们明确功能
    * 开发就转换成写代码让测试通过！ ==》 符合功能的逻辑要求，其实这个就是测试驱动开发！
     */

    @PutMapping("/products/{productId}")
    public ResponseEntity<UpdateProductResponse> updateProduct(@PathVariable long productId,@RequestBody UpdateProductRequest updateProductRequest){
        return new ResponseEntity<>(new UpdateProductResponse(),HttpStatus.OK);
    }
}
