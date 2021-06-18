package com.sample.talkmapstruct.mapper;

import com.sample.talkmapstruct.dto.CarDTO;
import com.sample.talkmapstruct.model.Car;
import com.sample.talkmapstruct.stubs.CarDtoStub;
import com.sample.talkmapstruct.stubs.CarStub;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;

class CarMapperTest {

    @InjectMocks
    private CarMapper carMapper = Mappers.getMapper(CarMapper.class);

    @Test
    void toModel() {
        final Car expected = CarStub.any().build();

        final Car car = carMapper.toModel(CarDtoStub.anyCar().build());
        assertThat(car).isEqualTo(expected);
    }

    @Test
    void toDto() {
        final CarDTO expected = CarDtoStub.anyCar().build();

        final CarDTO carDTO = carMapper.toDto(CarStub.any().build());

        assertThat(carDTO).isEqualTo(expected);
    }

}