package com.personality.personalitymeasure.service;

import com.personality.personalitymeasure.model.AnswerDto;

import java.util.List;

public interface AnswerService {
    List<AnswerDto> saveAnswer(List<AnswerDto> answerDtoList);
}
