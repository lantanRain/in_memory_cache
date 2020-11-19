package com.amorefecific.inmemorycache.controller.amoremall;


import com.amorefecific.inmemorycache.common.exception.Exceptions;
import com.amorefecific.inmemorycache.common.model.ApiResponse;
import com.amorefecific.inmemorycache.controller.amoremall.exception.ApiException;
import com.amorefecific.inmemorycache.controller.amoremall.model.CategoryResultDto;
import com.amorefecific.inmemorycache.controller.amoremall.model.ProductResultDto;
import com.amorefecific.inmemorycache.core.amoremall.model.Category;
import com.amorefecific.inmemorycache.core.amoremall.model.Product;
import com.amorefecific.inmemorycache.core.amoremall.service.CategoryService;
import com.amorefecific.inmemorycache.core.amoremall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @GetMapping(path = "/v1/api/allCategory")
    public ApiResponse<CategoryResultDto> getAllCategoryList() {
        List<Category> categoryList = categoryService.getCategoryList();
        return ApiResponse.success(CategoryResultDto.ofCategoryList(categoryList));
    }

    @GetMapping(path = "/v1/api/productList")
    public ApiResponse<ProductResultDto> getProductList() {
        List<Product> productList = productService.getProductList();
        return ApiResponse.success(ProductResultDto.ofProductList(productList));
    }

    @GetMapping(path = "/v1/api/error")
    public ApiResponse<ProductResultDto> exceptionResponse() {
        throw Exceptions.newExcepton("exception");
    }
}
