package com.sample.talkmapstruct.mapper;

import com.sample.talkmapstruct.dto.SameEnumDto;
import com.sample.talkmapstruct.model.SameEnum;
import org.mapstruct.Mapper;

@Mapper
public interface SameEnumMapper {

    SameEnumDto toDto(final SameEnum sameEnum);

}
