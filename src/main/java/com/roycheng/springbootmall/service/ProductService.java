package com.roycheng.springbootmall.service;

import com.roycheng.springbootmall.dto.ProductRequest;
import com.roycheng.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
