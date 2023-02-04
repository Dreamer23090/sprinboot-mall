package com.roycheng.springbootmall.dao;


import com.roycheng.springbootmall.dto.ProductRequest;
import com.roycheng.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
