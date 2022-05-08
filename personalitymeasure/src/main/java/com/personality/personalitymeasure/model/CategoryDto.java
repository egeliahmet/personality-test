package com.personality.personalitymeasure.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class CategoryDto {
    private Long id;
    private String name;
    private String description;
}
