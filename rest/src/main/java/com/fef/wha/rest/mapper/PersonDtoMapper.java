package com.fef.wha.rest.mapper;

import com.fef.wha.domain.model.PersonDomain;
import com.fef.wha.rest.dto.PersonDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PersonDtoMapper {
    PersonDomain toDomain(PersonDto personDto);
    PersonDto toDto(PersonDomain personDomain);
    List<PersonDto> toDtos(List<PersonDomain> personDomain);
}
