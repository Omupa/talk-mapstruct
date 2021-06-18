package com.sample.talkmapstruct.mapper;

import com.sample.talkmapstruct.dto.CarDTO;
import com.sample.talkmapstruct.model.Car;
import javax.annotation.processing.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-18T16:33:04-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15 (Oracle Corporation)"
)
public class CarMapperImpl implements CarMapper {

    private final CategoryEnumMapper categoryEnumMapper = Mappers.getMapper( CategoryEnumMapper.class );

    @Override
    public Car toModel(CarDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Car car = new Car();

        car.setHorse( carDTO.getHp() );
        car.setBrand( carDTO.getBrand() );
        car.setCategory( categoryEnumMapper.toModel( carDTO.getCategory() ) );

        return car;
    }

    @Override
    public CarDTO toDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setHp( car.getHorse() );
        carDTO.setBrand( car.getBrand() );
        carDTO.setCategory( categoryEnumMapper.toDto( car.getCategory() ) );

        return carDTO;
    }
}
