package com.amorefecific.inmemorycache.core.amoremall.repository.cache.common;

import java.util.List;
import java.util.Map;

public interface CacheHandler<ID, T extends Cacheable<ID>> {
    T get(ID id);
    Map<ID, T> get(List<ID> ids);

    void cache(T t);
    void cache(List<T> t);
}
