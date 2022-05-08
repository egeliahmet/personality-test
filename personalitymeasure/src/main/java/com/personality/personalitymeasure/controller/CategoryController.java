package com.personality.personalitymeasure.controller;

import com.personality.personalitymeasure.model.CategoryList;
import com.personality.personalitymeasure.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public CategoryList list(){
        return categoryService.getCategoryList();
    }
}
