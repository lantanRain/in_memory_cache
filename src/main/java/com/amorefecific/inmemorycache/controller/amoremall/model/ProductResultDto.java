package com.amorefecific.inmemorycache.controller.amoremall.model;

import com.amorefecific.inmemorycache.common.model.ApiResultDto;
import com.amorefecific.inmemorycache.controller.amoremall.converter.ProductDataConverter;
import com.amorefecific.inmemorycache.controller.amoremall.model.front.FrontProductModel;
import com.amorefecific.inmemorycache.core.amoremall.model.Product;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductResultDto implements ApiResultDto {

    private FrontProductModel product;
    private List<FrontProductModel> productList;

    public static ProductResultDto ofProductList(List<Product> productList) {
        ProductResultDto result = new ProductResultDto();
        result.setProductList(ProductDataConverter.convert(productList));
        return result;
    }
}
