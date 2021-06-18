package com.sample.talkmapstruct.stubs;

import com.sample.talkmapstruct.dto.CarDTO;
import com.sample.talkmapstruct.dto.CategoryEnumDTO;

public class CarDtoStub {

    public static CarDTO.CarDTOBuilder anyCar() {
        return CarDTO.builder()
                .category(CategoryEnumDTO.SUV)
                .brand("BMW")
                .hp("250cv");
    }

}
