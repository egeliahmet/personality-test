package com.personality.personalitymeasure.service.impl;

import com.personality.personalitymeasure.data.dao.AnswerJpaRepository;
import com.personality.personalitymeasure.data.model.AnswerEntity;
import com.personality.personalitymeasure.mapper.AnswerMapper;
import com.personality.personalitymeasure.model.AnswerDto;
import com.personality.personalitymeasure.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerJpaRepository answerJpaRepository;
    AnswerMapper answerMapper=AnswerMapper.INSTANCE;
    @Override
    public List<AnswerDto> saveAnswer(List<AnswerDto> answerDtoList) {

        List<AnswerEntity>  answerEntityList= answerJpaRepository.saveAllAndFlush(answerMapper.toEntityListFromDto(answerDtoList));

    return answerMapper.toDtoListFromEntity(answerEntityList);
    }
}
