package com.personality.personalitymeasure.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OptionDto {

    private Long id;
    private Long questionId;
    private String optionName;
    private Long conditionalQuestionId;

}
