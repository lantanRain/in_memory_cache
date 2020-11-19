package com.amorefecific.inmemorycache.core.amoremall.repository;

import com.amorefecific.inmemorycache.core.amoremall.model.Category;
import com.amorefecific.inmemorycache.core.amoremall.model.CategoryId;
import com.amorefecific.inmemorycache.core.amoremall.model.cache.category.CategoryCacheEntity;
import com.amorefecific.inmemorycache.core.amoremall.model.cache.category.CategoryCacheKey;
import com.amorefecific.inmemorycache.core.amoremall.repository.cache.CategoryCacheRepository;
import com.amorefecific.inmemorycache.core.amoremall.repository.cache.common.CacheHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CategoryCacheHandler implements CacheHandler<CategoryId, Category> {

    @Autowired
    private CategoryCacheRepository categoryCacheRepository;

    @Override
    public Category get(CategoryId categoryId) {
        CategoryCacheKey key = CategoryCacheKey.createKey(categoryId);
        return categoryCacheRepository.findOne(key)
                .map(CategoryCacheEntity::toCategory)
                .orElse(null);
    }

    @Override
    public Map<CategoryId, Category> get(List<CategoryId> categoryIds) {
        return null;
    }

    @Override
    public void cache(Category category) {

    }

    @Override
    public void cache(List<Category> t) {

    }


}
