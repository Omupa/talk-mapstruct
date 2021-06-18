package com.sample.talkmapstruct.mapper;

import com.sample.talkmapstruct.dto.GarageDTO;
import com.sample.talkmapstruct.model.Garage;
import javax.annotation.processing.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-18T16:33:04-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15 (Oracle Corporation)"
)
public class GarageMapperImpl implements GarageMapper {

    private final CarMapper carMapper = Mappers.getMapper( CarMapper.class );

    @Override
    public Garage toModel(GarageDTO garageDTO) {
        if ( garageDTO == null ) {
            return null;
        }

        Garage garage = new Garage();

        garage.setOwnerName( garageDTO.getOwnerName() );
        garage.setCar( carMapper.toModel( garageDTO.getCar() ) );

        return garage;
    }
}
