package com.personality.personalitymeasure.mapper;

import com.personality.personalitymeasure.data.model.CategoryEntity;
import com.personality.personalitymeasure.model.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {
    public static final CategoryMapper INSTANCE= Mappers.getMapper(CategoryMapper.class);

    //@Mapping(source = "id", target="id")
    @Mapping(source = "name", target="name")
    public abstract CategoryDto getModelFromEntity(CategoryEntity categoryEntity);

    public abstract List<CategoryDto> categoryEntitiyToDto(List<CategoryEntity> categoryEntity);

}
