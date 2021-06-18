package com.sample.talkmapstruct.mapper;

import com.sample.talkmapstruct.dto.SameEnumDto;
import com.sample.talkmapstruct.model.SameEnum;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-18T16:33:03-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15 (Oracle Corporation)"
)
public class SameEnumMapperImpl implements SameEnumMapper {

    @Override
    public SameEnumDto toDto(SameEnum sameEnum) {
        if ( sameEnum == null ) {
            return null;
        }

        SameEnumDto sameEnumDto;

        switch ( sameEnum ) {
            case ONE: sameEnumDto = SameEnumDto.ONE;
            break;
            case TWO: sameEnumDto = SameEnumDto.TWO;
            break;
            case THREE: sameEnumDto = SameEnumDto.THREE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + sameEnum );
        }

        return sameEnumDto;
    }
}
