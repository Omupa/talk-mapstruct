package com.sample.talkmapstruct.mapper;

import com.sample.talkmapstruct.model.Garage;
import com.sample.talkmapstruct.stubs.GarageDtoStub;
import com.sample.talkmapstruct.stubs.GarageStub;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;

class GarageMapperTest {

    @InjectMocks
    final GarageMapper garageMapper = Mappers.getMapper(GarageMapper.class);

    @Test
    @DisplayName("Mapping GarageDTO to Garage using CarMapper")
    void toModel() {
        final Garage expected = GarageStub.any().build();

        final Garage garage = garageMapper.toModel(GarageDtoStub.any().build());

        assertThat(garage).isEqualTo(expected);
    }
}