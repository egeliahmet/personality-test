package com.personality.personalitymeasure.service;

import com.personality.personalitymeasure.model.QuestionList;

public interface QuestionService {
    QuestionList getQuestions(Long categoryId);
}
