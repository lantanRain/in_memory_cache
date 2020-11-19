package com.amorefecific.inmemorycache.controller.amoremall.converter;

import com.amorefecific.inmemorycache.controller.amoremall.model.front.FrontCategoryModel;
import com.amorefecific.inmemorycache.core.amoremall.model.Category;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class CategoryDataConverter {

    public List<FrontCategoryModel> convert(List<Category> categoryList) {
        List<FrontCategoryModel> result = new ArrayList<>();
        categoryList.forEach(category -> result.add(convert(category)));
        return result;
    }

    public FrontCategoryModel convert(Category category) {
        return FrontCategoryModel.builder()
                .id(category.getId())
                .categoryName(category.getCategoryName())
                .build();
    }

}
