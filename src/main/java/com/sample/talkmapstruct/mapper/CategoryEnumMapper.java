package com.sample.talkmapstruct.mapper;

import com.sample.talkmapstruct.dto.CategoryEnumDTO;
import com.sample.talkmapstruct.model.CategoryEnum;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;

/**
 * TODO: Show this case
 *
 * @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "UNKNOWN"),
 * MappingConstants.ANY_REMAINING: Is all enum values that aren't explicit mapped on @ValueMapping annotation
 */

@Mapper
public interface CategoryEnumMapper {

    @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "UNKNOWN")
    @ValueMapping(source = MappingConstants.NULL, target = "UNKNOWN")
    CategoryEnum toModel(final CategoryEnumDTO categoryEnumDTO);

    @ValueMappings({
            @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "UNKNOWN"),
            @ValueMapping(source = MappingConstants.NULL, target = "UNKNOWN")})
    CategoryEnumDTO toDto(final CategoryEnum categoryEnum);

}
