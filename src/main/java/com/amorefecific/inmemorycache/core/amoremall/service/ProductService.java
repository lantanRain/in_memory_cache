package com.amorefecific.inmemorycache.core.amoremall.service;

import com.amorefecific.inmemorycache.core.amoremall.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    public List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product());

        return productList;
    }
}


