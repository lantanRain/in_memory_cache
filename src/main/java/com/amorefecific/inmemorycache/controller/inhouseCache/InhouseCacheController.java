package com.amorefecific.inmemorycache.controller.inhouseCache;

import com.amorefecific.inmemorycache.common.model.ApiResponse;
import com.amorefecific.inmemorycache.controller.inhouseCache.model.CachedEntityDto;
import com.amorefecific.inmemorycache.core.inhouseCache.service.LRUCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class InhouseCacheController {

    @Autowired
    private LRUCacheService lruCacheService;

    @PostMapping(path = "/v1/cache/findOne", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<CachedEntityDto> getCache(HttpServletRequest request, @RequestBody String key) {
        String message = lruCacheService.findOne(key);
        CachedEntityDto cacheEntity = CachedEntityDto.ofCacheEntity(message);
        return ApiResponse.success(cacheEntity);
    }

    @PostMapping(path = "/v1/cache/findList")
    public ApiResponse getCacheList() {
        return ApiResponse.success(null);
    }

    @PutMapping(path = "/v1/cache/create")
    public ApiResponse saveCache() {
        return ApiResponse.success(null);
    }

    @PatchMapping(path = "/v1/cache/update")
    public ApiResponse updateCache() {
        return ApiResponse.success(null);
    }

    @DeleteMapping(path = "/v1/cache/delete")
    public ApiResponse deleteCache() {
        return ApiResponse.success(null);
    }

}
