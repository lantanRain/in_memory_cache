package com.amorefecific.inmemorycache.core.amoremall.repository;

import com.amorefecific.inmemorycache.core.amoremall.repository.cache.common.CacheHandler;
import com.amorefecific.inmemorycache.core.amoremall.repository.cache.common.Cacheable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.function.Function;

@Slf4j
@Service
public class CacheBusiness {

    public <ID, T extends Cacheable<ID>> T get(ID id, CacheHandler<ID, T> cacheHandler, Function<ID, T> fetchFunction) {
        try {
            T cached = cacheHandler.get(id);
            if (Objects.nonNull(cached)) {
                return cached;
            }
            T fetched = fetchFunction.apply(id);
            cacheHandler.cache(fetched);
            return fetched;
        } catch (Exception e) {
            return fetchFunction.apply(id);
        }
    }
}
