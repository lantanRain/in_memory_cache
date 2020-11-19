package com.amorefecific.inmemorycache.core.amoremall.model.cache.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CacheResponseDto {
    private CacheResponseResultDto result;
}
