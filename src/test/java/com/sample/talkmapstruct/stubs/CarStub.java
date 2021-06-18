package com.sample.talkmapstruct.stubs;

import com.sample.talkmapstruct.model.Car;
import com.sample.talkmapstruct.model.CategoryEnum;

public class CarStub {

    public static Car.CarBuilder any() {
        return Car.builder()
                .category(CategoryEnum.SUV)
                .brand("BMW")
                .horse("250cv");
    }

}
