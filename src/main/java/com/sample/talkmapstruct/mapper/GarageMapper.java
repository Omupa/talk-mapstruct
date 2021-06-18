package com.sample.talkmapstruct.mapper;

import com.sample.talkmapstruct.dto.GarageDTO;
import com.sample.talkmapstruct.model.Garage;
import org.mapstruct.Mapper;

@Mapper(uses = CarMapper.class)
public interface GarageMapper {

    Garage toModel(final GarageDTO garageDTO);

}
