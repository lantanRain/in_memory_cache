package com.amorefecific.inmemorycache.core.amoremall.model.cache.category;

import com.amorefecific.inmemorycache.core.amoremall.model.Category;
import com.amorefecific.inmemorycache.core.amoremall.model.CategoryId;
import com.amorefecific.inmemorycache.core.amoremall.model.cache.common.CacheEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryCacheEntity implements CacheEntity {

    private String id;
    private String categoryName;

    public Category toCategory() {
        return Category.builder()
                .categoryId(CategoryId.fromId(id))
                .categoryName(categoryName)
                .build();
    }

}
