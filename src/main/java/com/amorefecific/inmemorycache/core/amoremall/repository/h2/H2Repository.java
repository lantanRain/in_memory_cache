package com.amorefecific.inmemorycache.core.amoremall.repository.h2;

import com.amorefecific.inmemorycache.core.amoremall.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public class H2Repository {
    public Category getCategory(String id) {
        return new Category();
    }
}
