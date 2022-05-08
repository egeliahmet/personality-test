package com.personality.personalitymeasure.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="options")
public class OptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "question_id")
    private Long questionId;

    @Column(name = "option_name")
    private String optionName;

    @Column(name = "condition_id")
    private Long conditionalQuestionId;

    @ManyToOne
    @JoinColumn(name = "question_id", insertable = false, updatable = false)
    private QuestionEntity questions;


}
