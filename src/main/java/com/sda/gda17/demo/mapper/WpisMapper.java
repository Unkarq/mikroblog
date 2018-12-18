package com.sda.gda17.demo.mapper;

import com.sda.gda17.demo.model.Wpis;
import com.sda.gda17.demo.model.dto.WpisDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface WpisMapper {
    @Mappings(value = {
            @Mapping(target = "id", source = "wpisId"),
            @Mapping(target = "tekst", source = "wpisTekst"),
            @Mapping(target = "typWpisu", source = "wpisTypWpisu"),
            @Mapping(target = "status", source = "wpisStatus")
    })
    Wpis wpisDtoToWpis(WpisDto dto);

    @Mappings(value = {
            @Mapping(source = "id", target = "wpisId"),
            @Mapping(source = "tekst", target = "wpisTekst"),
            @Mapping(source = "typWpisu", target = "wpisTypWpisu"),
            @Mapping(source = "status", target = "wpisStatus"),
    })
    WpisDto wpisToWpisDto(Wpis wpis);


}
