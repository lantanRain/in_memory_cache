package com.amorefecific.inmemorycache.core.amoremall.repository.cache;


import com.amorefecific.inmemorycache.core.amoremall.model.cache.category.CategoryCacheEntity;
import com.amorefecific.inmemorycache.core.amoremall.model.cache.category.CategoryCacheKey;
import com.amorefecific.inmemorycache.core.amoremall.repository.cache.common.CacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryCacheRepository {

    @Autowired
    private CacheRepository cacheRepository;

    public Optional<CategoryCacheEntity> findOne(CategoryCacheKey key) {
        Optional<CategoryCacheEntity> result = cacheRepository.findOne(key, CategoryCacheEntity.class);
        if (result.isPresent()) {
//            statsCounter.recordHits(1);
        } else {
//            statsCounter.recordMisses(1);
        }
        return result;
    }
}
