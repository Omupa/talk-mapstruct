package com.sample.talkmapstruct.stubs;

import com.sample.talkmapstruct.dto.GarageDTO;

public class GarageDtoStub {

    public static GarageDTO.GarageDTOBuilder any() {
        return GarageDTO.builder()
                .ownerName("Jhon")
                .car(CarDtoStub.anyCar().build());
    }

}
