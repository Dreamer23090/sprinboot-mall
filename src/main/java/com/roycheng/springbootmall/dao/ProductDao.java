package com.roycheng.springbootmall.dao;


import com.roycheng.springbootmall.constant.ProductCategory;
import com.roycheng.springbootmall.dto.ProductRequest;
import com.roycheng.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
