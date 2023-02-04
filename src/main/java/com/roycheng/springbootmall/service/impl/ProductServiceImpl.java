package com.roycheng.springbootmall.service.impl;

import com.roycheng.springbootmall.dao.ProductDao;
import com.roycheng.springbootmall.dto.ProductRequest;
import com.roycheng.springbootmall.model.Product;
import com.roycheng.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;


    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
