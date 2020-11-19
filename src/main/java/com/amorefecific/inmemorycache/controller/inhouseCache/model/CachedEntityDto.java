package com.amorefecific.inmemorycache.controller.inhouseCache.model;

import com.amorefecific.inmemorycache.common.model.ApiResultDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CachedEntityDto implements ApiResultDto {

    private String message;

    public static CachedEntityDto ofCacheEntity(String message) {
        CachedEntityDto cachedEntityDto = new CachedEntityDto();
        cachedEntityDto.setMessage(message);
        return cachedEntityDto;
    }
}
