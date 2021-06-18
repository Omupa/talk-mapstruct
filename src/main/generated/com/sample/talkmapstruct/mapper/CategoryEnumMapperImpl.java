package com.sample.talkmapstruct.mapper;

import com.sample.talkmapstruct.dto.CategoryEnumDTO;
import com.sample.talkmapstruct.model.CategoryEnum;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-18T16:33:04-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15 (Oracle Corporation)"
)
public class CategoryEnumMapperImpl implements CategoryEnumMapper {

    @Override
    public CategoryEnum toModel(CategoryEnumDTO categoryEnumDTO) {
        if ( categoryEnumDTO == null ) {
            return CategoryEnum.UNKNOWN;
        }

        CategoryEnum categoryEnum;

        switch ( categoryEnumDTO ) {
            case HATCH: categoryEnum = CategoryEnum.HATCH;
            break;
            case SEDAN: categoryEnum = CategoryEnum.SEDAN;
            break;
            case SUV: categoryEnum = CategoryEnum.SUV;
            break;
            case PICKUP: categoryEnum = CategoryEnum.PICKUP;
            break;
            case UNKNOWN: categoryEnum = CategoryEnum.UNKNOWN;
            break;
            default: categoryEnum = CategoryEnum.UNKNOWN;
        }

        return categoryEnum;
    }

    @Override
    public CategoryEnumDTO toDto(CategoryEnum categoryEnum) {
        if ( categoryEnum == null ) {
            return CategoryEnumDTO.UNKNOWN;
        }

        CategoryEnumDTO categoryEnumDTO;

        switch ( categoryEnum ) {
            case HATCH: categoryEnumDTO = CategoryEnumDTO.HATCH;
            break;
            case SEDAN: categoryEnumDTO = CategoryEnumDTO.SEDAN;
            break;
            case SUV: categoryEnumDTO = CategoryEnumDTO.SUV;
            break;
            case PICKUP: categoryEnumDTO = CategoryEnumDTO.PICKUP;
            break;
            case UNKNOWN: categoryEnumDTO = CategoryEnumDTO.UNKNOWN;
            break;
            default: categoryEnumDTO = CategoryEnumDTO.UNKNOWN;
        }

        return categoryEnumDTO;
    }
}
