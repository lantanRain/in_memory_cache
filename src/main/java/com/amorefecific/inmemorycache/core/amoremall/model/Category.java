package com.amorefecific.inmemorycache.core.amoremall.model;

import com.amorefecific.inmemorycache.core.amoremall.repository.cache.common.Cacheable;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Cacheable<CategoryId> {

    private CategoryId categoryId;
    private String categoryName;

    public void setId(String id) {
        this.categoryId = CategoryId.fromId(id);
    }

    public String getId() {
        return categoryId.getId();
    }


    @Override
    public CategoryId getCacheId() {
        return categoryId;
    }
}
