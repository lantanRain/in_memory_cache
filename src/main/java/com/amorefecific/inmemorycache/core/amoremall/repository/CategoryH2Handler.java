package com.amorefecific.inmemorycache.core.amoremall.repository;

import com.amorefecific.inmemorycache.core.amoremall.model.Category;
import com.amorefecific.inmemorycache.core.amoremall.model.CategoryId;
import com.amorefecific.inmemorycache.core.amoremall.repository.h2.H2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryH2Handler {

    @Autowired
    private H2Repository h2Repository;

    public Category getCategory(CategoryId id) {
        return h2Repository.getCategory(id.getId());

    }
}
