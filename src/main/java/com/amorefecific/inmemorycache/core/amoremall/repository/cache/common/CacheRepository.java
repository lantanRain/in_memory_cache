package com.amorefecific.inmemorycache.core.amoremall.repository.cache.common;


import com.amorefecific.inmemorycache.core.amoremall.model.cache.common.CacheEntity;
import com.amorefecific.inmemorycache.core.amoremall.model.cache.common.CacheKey;
import com.amorefecific.inmemorycache.core.amoremall.model.cache.common.CacheRequestForm;
import com.amorefecific.inmemorycache.core.amoremall.utils.JsonEntityResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CacheRepository<T extends CacheEntity, Key extends CacheKey> {

    @Autowired
    private CacheClient cacheClient;

    public Optional<T> findOne(Key key, Class<T> t) {
        CacheRequestForm cacheRequestForm = CacheRequestForm.builder()
                .key(key.buildKey())
                .build();

        JsonEntityResolver<T> jsonEntityResolver = new JsonEntityResolver();
        return Optional.ofNullable(cacheClient.findOne(cacheRequestForm))
                .map((String serialized) -> jsonEntityResolver.deserialize(serialized, t));
    }

}
