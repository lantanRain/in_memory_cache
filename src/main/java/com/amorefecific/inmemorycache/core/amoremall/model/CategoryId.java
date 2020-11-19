package com.amorefecific.inmemorycache.core.amoremall.model;

import com.amorefecific.inmemorycache.common.exception.Exceptions;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class CategoryId {

    @Getter
    private String id;

    public static CategoryId fromId(String id) {
        return Optional.ofNullable(id)
                .filter(CategoryId::isValidId)
                .map(CategoryId::new)
                .orElseThrow(() -> Exceptions.newException("invalid category id format", id));

    }

    private static boolean isValidId(String id) {
        return StringUtils.isNotBlank(id);
    }
}
