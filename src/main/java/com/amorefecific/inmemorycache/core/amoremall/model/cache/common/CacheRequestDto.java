package com.amorefecific.inmemorycache.core.amoremall.model.cache.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor(staticName = "of")
public class CacheRequestDto {

    private String key;
}
