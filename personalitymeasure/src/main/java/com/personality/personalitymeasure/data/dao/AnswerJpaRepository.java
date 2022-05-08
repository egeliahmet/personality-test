package com.personality.personalitymeasure.data.dao;

import com.personality.personalitymeasure.data.model.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerJpaRepository extends JpaRepository<AnswerEntity,Long> {
}
