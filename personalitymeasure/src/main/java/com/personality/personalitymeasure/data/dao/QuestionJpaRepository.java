package com.personality.personalitymeasure.data.dao;

import com.personality.personalitymeasure.data.model.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionJpaRepository extends JpaRepository<QuestionEntity,Long> {
    List<QuestionEntity> findByCategoryId(Long categoryId);
}
