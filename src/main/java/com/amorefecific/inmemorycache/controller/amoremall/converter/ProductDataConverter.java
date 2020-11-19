package com.amorefecific.inmemorycache.controller.amoremall.converter;

import com.amorefecific.inmemorycache.controller.amoremall.model.front.FrontProductModel;
import com.amorefecific.inmemorycache.core.amoremall.model.Product;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class ProductDataConverter {

    public List<FrontProductModel> convert(List<Product> productList) {
        List<FrontProductModel> result = new ArrayList<>();
        productList.forEach(product -> result.add(convert(product)));
        return result;
    }

    public FrontProductModel convert(Product product) {
        return FrontProductModel.builder()
                .build();
    }

}
