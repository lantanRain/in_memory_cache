package com.amorefecific.inmemorycache.controller.amoremall.model;

import com.amorefecific.inmemorycache.common.model.ApiResultDto;
import com.amorefecific.inmemorycache.controller.amoremall.converter.CategoryDataConverter;
import com.amorefecific.inmemorycache.controller.amoremall.model.front.FrontCategoryModel;
import com.amorefecific.inmemorycache.core.amoremall.model.Category;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CategoryResultDto implements ApiResultDto {

    private FrontCategoryModel category;

    private List<FrontCategoryModel> categoryList;

    public static CategoryResultDto ofCategoryList(List<Category> categoryList) {
        CategoryResultDto result = new CategoryResultDto();
        result.setCategoryList(CategoryDataConverter.convert(categoryList));
        return result;
    }

    public static CategoryResultDto ofCategory(Category category) {
        CategoryResultDto result = new CategoryResultDto();
        result.setCategory(CategoryDataConverter.convert(category));
        return result;
    }
}
