package com.amorefecific.inmemorycache.controller.inhouseCache;

import com.amorefecific.inmemorycache.common.model.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class InhouseCacheController {

    @GetMapping(path = "/v1/cache/one")
    public ApiResponse getCache() {
        return ApiResponse.success(null);
    }

    @GetMapping(path = "/v1/cache/list")
    public ApiResponse getCacheList() {
        return ApiResponse.success(null);
    }

    @PostMapping(path = "/v1/cache/one")
    public ApiResponse saveCache() {
        return ApiResponse.success(null);
    }

    @PatchMapping(path = "/v1/cache/one")
    public ApiResponse updateCache() {
        return ApiResponse.success(null);
    }

    @DeleteMapping(path = "/v1/cache/one")
    public ApiResponse deleteCache() {
        return ApiResponse.success(null);
    }

}
