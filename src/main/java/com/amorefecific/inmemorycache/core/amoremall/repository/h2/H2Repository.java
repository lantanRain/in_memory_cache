package com.amorefecific.inmemorycache.core.amoremall.repository.h2;

import com.amorefecific.inmemorycache.core.amoremall.repository.h2.model.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface H2Repository extends CrudRepository<CategoryEntity, Integer> {

    CategoryEntity findByCategoryNo(@Param("categoryNo") int categoryNo);

}
