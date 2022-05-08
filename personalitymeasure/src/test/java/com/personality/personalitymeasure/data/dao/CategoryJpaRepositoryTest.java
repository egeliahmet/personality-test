package com.personality.personalitymeasure.data.dao;

import com.personality.personalitymeasure.data.model.CategoryEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryJpaRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    CategoryJpaRepository repository;

    @Test
    public void getCategoryTest(){
       List<CategoryEntity> categories= repository.findAll();
       assertNotNull(categories);
    }

}
