package com.example.spring.spring5mvcrest.api.v1.mapper;

import com.example.spring.spring5mvcrest.api.v1.model.CategoryDTO;
import com.example.spring.spring5mvcrest.domain.Category;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryMapperTest {

    public static final String APPLE = "Apple";
    public static final long ID = 2L;
    private CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    @Ignore
    public void testCategoryToCategoryDTO() {
        Category category = new Category();
        category.setName(APPLE);
        category.setId(ID);

        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);
        assertEquals(Long.valueOf(ID), categoryDTO.getId());
        assertEquals(APPLE, categoryDTO.getName());
    }
}