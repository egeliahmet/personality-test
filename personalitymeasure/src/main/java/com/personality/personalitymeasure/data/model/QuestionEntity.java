package com.personality.personalitymeasure.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="questions")
@JsonIgnoreProperties({"hibernateLazyInitializer" ,"handler"})
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "question")
    private String question;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "type_name")
    private String questionType;

    @Column(name = "is_conditional")
    private boolean isConditional;

    @OneToMany
    @JoinColumn(name = "question_id")
    private List<OptionEntity> optionList;

}
