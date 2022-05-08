package com.personality.personalitymeasure.mapper;

import com.personality.personalitymeasure.data.model.AnswerEntity;
import com.personality.personalitymeasure.model.AnswerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AnswerMapper {
    public  static final AnswerMapper  INSTANCE= Mappers.getMapper(AnswerMapper.class );
    public abstract AnswerEntity toEntityFromDto(AnswerDto answerDto);
    public abstract List<AnswerEntity> toEntityListFromDto(List<AnswerDto> answerDto);
    public abstract AnswerDto  toDtoFromEntity(AnswerEntity answerEntities );
    public abstract List<AnswerDto>   toDtoListFromEntity(List<AnswerEntity> answerEntities );
}
