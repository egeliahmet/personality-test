package com.personality.personalitymeasure.controller;

import com.personality.personalitymeasure.model.QuestionList;
import com.personality.personalitymeasure.service.impl.QuestionServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/questions")
public class QuestionController {

   private final QuestionServiceImpl questionService;

    public QuestionController(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }


    @GetMapping
    public QuestionList getQuestionListByCategory(@RequestParam Long categoryId){
        return questionService.getQuestions(categoryId);
    }

}
