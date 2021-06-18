package com.sample.talkmapstruct.mapper;

import com.sample.talkmapstruct.dto.CarDTO;
import com.sample.talkmapstruct.model.Car;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = CategoryEnumMapper.class)
public interface CarMapper {

    @Mapping(source = "hp", target = "horse")
    Car toModel(final CarDTO carDTO);

    @InheritInverseConfiguration
    CarDTO toDto(final Car car);

}
