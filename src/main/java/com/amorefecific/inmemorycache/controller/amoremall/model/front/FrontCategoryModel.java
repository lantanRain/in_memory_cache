package com.amorefecific.inmemorycache.controller.amoremall.model.front;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FrontCategoryModel {
    private String id;
    private String categoryName;
}
