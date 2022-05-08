package com.personality.personalitymeasure.controller;

import com.personality.personalitymeasure.model.CategoryDto;
import com.personality.personalitymeasure.model.CategoryList;
import com.personality.personalitymeasure.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;


import static org.mockito.Mockito.when;

@WebMvcTest(CategoryController.class)
public class CategoryServiceTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CategoryService service;
    private CategoryList categoryList;
    private String response;

    public void setup(){
        categoryList=new CategoryList();
        CategoryDto categoryDto1=new CategoryDto(1L," name","desc");
        CategoryDto categoryDto2=new CategoryDto(1L," name","desc");
        List<CategoryDto> categoryDtoList=new ArrayList<>();
        categoryDtoList.add(categoryDto1);
        categoryDtoList.add(categoryDto2);
        categoryList.setCategoryDtoList(categoryDtoList);
        response="{\"categoryDtoList\":[{\"id\":1,\"name\":\" name\",\"description\":\"desc\"},{\"id\":1,\"name\":\" name\",\"description\":\"desc\"}]}";
    }

    @Test
    public void shouldReturnCategories() throws Exception {
        setup();
        when(service.getCategoryList()).thenReturn(categoryList);
        this.mockMvc.perform(get("/api/v1/categories/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(response));
    }

}
