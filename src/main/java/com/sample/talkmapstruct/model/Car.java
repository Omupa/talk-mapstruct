package com.sample.talkmapstruct.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String horse;
    private String brand;
    private CategoryEnum category;

}
