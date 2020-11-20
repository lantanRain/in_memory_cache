package com.amorefecific.inmemorycache.core.amoremall.repository.h2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "category")
public class CategoryEntity {

    @Id
    @GeneratedValue
    @Column(name = "category_no")
    private Integer categoryNo;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "parent_no")
    private Integer parentNo;

    @Column(name = "depth")
    private Integer depth;
}
