package com.personality.personalitymeasure.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class QuestionDto {

    private Long id;
    private String question;
    private Long categoryId;
    private String questionType;
    private boolean isConditional;
    private List<OptionDto> optionList;
}
