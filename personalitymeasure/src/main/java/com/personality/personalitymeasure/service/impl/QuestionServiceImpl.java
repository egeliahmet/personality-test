package com.personality.personalitymeasure.service.impl;

import com.personality.personalitymeasure.data.dao.QuestionJpaRepository;
import com.personality.personalitymeasure.data.model.QuestionEntity;
import com.personality.personalitymeasure.mapper.QuestionMapper;
import com.personality.personalitymeasure.model.QuestionList;
import com.personality.personalitymeasure.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    private final QuestionJpaRepository questionJpaRepository;
    QuestionMapper questionMapper=QuestionMapper.INSTANCE;

    @Autowired
    public QuestionServiceImpl(QuestionJpaRepository questionJpaRepository) {
        this.questionJpaRepository = questionJpaRepository;
    }

    @Override
    public QuestionList getQuestions(Long categoryId) {
        QuestionList questionList=new QuestionList();
        List<QuestionEntity> questionEntities= questionJpaRepository.findByCategoryId(categoryId);
        questionList.setQuestionList(questionMapper.getQuestionDtoFromEntity(questionEntities));
        return questionList;
    }
}
