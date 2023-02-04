package com.roycheng.springbootmall.dao;


import com.roycheng.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
