package com.personality.personalitymeasure.service.impl;

import com.personality.personalitymeasure.data.dao.CategoryJpaRepository;
import com.personality.personalitymeasure.mapper.CategoryMapper;
import com.personality.personalitymeasure.model.CategoryList;
import com.personality.personalitymeasure.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryJpaRepository categoryInfoDao;
    CategoryMapper categoryMapper=CategoryMapper.INSTANCE;

    @Override
    public CategoryList getCategoryList() {
        CategoryList categoryListDto=new CategoryList();
        categoryListDto.setCategoryDtoList(categoryMapper.categoryEntitiyToDto(categoryInfoDao.findAll()));

        return categoryListDto;
    }
}
