package com.personality.personalitymeasure.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerDto {
    private Long id;
    private Long userId;
    private Long questionId;
    private Long OptionId;
    private String answer;

}
