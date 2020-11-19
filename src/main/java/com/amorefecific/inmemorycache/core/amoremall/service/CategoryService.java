package com.amorefecific.inmemorycache.core.amoremall.service;

import com.amorefecific.inmemorycache.core.amoremall.model.Category;
import com.amorefecific.inmemorycache.core.amoremall.model.CategoryId;
import com.amorefecific.inmemorycache.core.amoremall.repository.CacheBusiness;
import com.amorefecific.inmemorycache.core.amoremall.repository.CategoryCacheHandler;
import com.amorefecific.inmemorycache.core.amoremall.repository.CategoryH2Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CacheBusiness cacheBusiness;

    @Autowired
    private CategoryCacheHandler categoryCacheHandler;
    @Autowired
    private CategoryH2Handler categoryH2Handler;


    public List<Category> getCategoryList() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category());

        return categoryList;
    }

    public Category getCategory() {
        CategoryId categoryId = CategoryId.fromId("001");
        return cacheBusiness.get(categoryId, categoryCacheHandler, categoryH2Handler::getCategory);
    }
}
