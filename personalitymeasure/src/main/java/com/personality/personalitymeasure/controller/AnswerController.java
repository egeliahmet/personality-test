package com.personality.personalitymeasure.controller;

import com.personality.personalitymeasure.model.AnswerDto;
import com.personality.personalitymeasure.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;

@RestController
@RequestMapping("api/v1/answers")
public class AnswerController {
    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @RequestMapping(value = "/save" ,method = RequestMethod.POST)
    @ResponseBody
   public List<AnswerDto> saveAnswers(@RequestBody List<AnswerDto> answerDtoList){
       List<AnswerDto> responseList =answerService.saveAnswer(answerDtoList);
       return responseList;
   }
}
