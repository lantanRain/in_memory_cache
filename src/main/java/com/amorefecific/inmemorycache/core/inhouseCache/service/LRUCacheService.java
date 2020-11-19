package com.amorefecific.inmemorycache.core.inhouseCache.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LRUCacheService {

    public String findOne(String key) {
        return "{\"id\" : \"001\", \"categoryName\" : \"스킨케어\"}";
    }
}
