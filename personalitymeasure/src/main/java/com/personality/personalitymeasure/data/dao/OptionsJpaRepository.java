package com.personality.personalitymeasure.data.dao;

import com.personality.personalitymeasure.data.model.OptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionsJpaRepository extends JpaRepository<OptionEntity,Long> {
}
