package com.personality.personalitymeasure.mapper;

import com.personality.personalitymeasure.data.model.OptionEntity;
import com.personality.personalitymeasure.data.model.QuestionEntity;
import com.personality.personalitymeasure.model.OptionDto;
import com.personality.personalitymeasure.model.QuestionDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface QuestionMapper {
    public static final QuestionMapper INSTANCE= Mappers.getMapper(QuestionMapper.class);

    public abstract  List<OptionDto> getOptionListFromEntity(List<OptionEntity> optionEntities);

    public abstract QuestionDto getModelFromEntity(QuestionEntity questionEntity);

    public abstract List<QuestionDto> getQuestionDtoFromEntity(List<QuestionEntity> questionEntity);

    public abstract OptionDto getOptionDtoFromEntity(OptionEntity optionEntity);


}
