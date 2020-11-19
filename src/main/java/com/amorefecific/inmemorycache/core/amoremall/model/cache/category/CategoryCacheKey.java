package com.amorefecific.inmemorycache.core.amoremall.model.cache.category;

import com.amorefecific.inmemorycache.core.amoremall.model.CategoryId;
import com.amorefecific.inmemorycache.core.amoremall.model.cache.common.CacheKey;
import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "createKey")
public class CategoryCacheKey implements CacheKey {

    private final String CACHE_PREFIX = "category:";

    private CategoryId categoryId;

    protected String getKey() {
        return categoryId.getId();
    }

    @Override
    public String buildKey() {
        return CACHE_PREFIX + getKey();
    }

}
