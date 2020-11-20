package com.amorefecific.inmemorycache.core.amoremall.model;

import com.amorefecific.inmemorycache.common.exception.Exceptions;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class CategoryId {

    @Getter
    private String id;

    public static CategoryId fromCategoryNo(Integer categoryNo) {
        return Optional.ofNullable(categoryNo)
                .filter(CategoryId::isValidCategoryNo)
                .map(CategoryId::convertCategoryId)
                .map(CategoryId::new)
                .orElseThrow(() -> Exceptions.newException("invalid category id format", categoryNo));
    }

    public static CategoryId fromId(String id) {
        return Optional.ofNullable(id)
                .filter(CategoryId::isValidId)
                .map(CategoryId::new)
                .orElseThrow(() -> Exceptions.newException("invalid category id format", id));
    }

    public Integer getOriginalId() {
        return Optional.of(id)
                .map(categoryId -> categoryId.replaceAll("0", ""))
                .map(Integer::valueOf)
                .get();
    }

    private static String convertCategoryId(Integer categoryNo) {
        return String.format("%03d", categoryNo);
    }

    private static boolean isValidCategoryNo(Integer categoryNo) {
        return Objects.nonNull(categoryNo) && 0 != categoryNo;
    }

    private static boolean isValidId(String id) {
        return StringUtils.isNotBlank(id);
    }
}
