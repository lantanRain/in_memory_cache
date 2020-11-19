package com.amorefecific.inmemorycache.core.amoremall.service;

import com.amorefecific.inmemorycache.core.amoremall.model.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    public List<Category> getCategoryList() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category());

        return categoryList;
    }
}
