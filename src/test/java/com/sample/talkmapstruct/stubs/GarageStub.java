package com.sample.talkmapstruct.stubs;

import com.sample.talkmapstruct.model.Car;
import com.sample.talkmapstruct.model.CategoryEnum;
import com.sample.talkmapstruct.model.Garage;

public class GarageStub {

    public static Garage.GarageBuilder any() {
        return Garage.builder()
                .ownerName("Jhon")
                .car(Car.builder()
                        .horse("250cv")
                        .brand("BMW")
                        .category(CategoryEnum.SUV)
                        .build());
    }

}
