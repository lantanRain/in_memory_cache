package com.amorefecific.inmemorycache.core.amoremall.model.cache.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CacheResponseResultDto {

    private boolean success;
    private String errorCode;
    private String message;

    @JsonIgnore
    public static CacheResponseResultDto fail(Exception e) {
        CacheResponseResultDto dto = new CacheResponseResultDto();
        dto.setSuccess(false);
        dto.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
        dto.setMessage(e.getMessage());
        return dto;
    }
}
