package com.fef.wha.rest.mapper;

import com.fef.wha.domain.model.PersonDomain;
import com.fef.wha.domain.model.PersonDomain.PersonDomainBuilder;
import com.fef.wha.rest.dto.PersonDto;
import com.fef.wha.rest.dto.PersonDto.PersonDtoBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-14T18:30:42+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class PersonDtoMapperImpl implements PersonDtoMapper {

    @Override
    public PersonDomain toDomain(PersonDto personDto) {
        if ( personDto == null ) {
            return null;
        }

        PersonDomainBuilder personDomain = PersonDomain.builder();

        personDomain.id( personDto.getId() );
        personDomain.name( personDto.getName() );
        personDomain.age( personDto.getAge() );

        return personDomain.build();
    }

    @Override
    public PersonDto toDto(PersonDomain personDomain) {
        if ( personDomain == null ) {
            return null;
        }

        PersonDtoBuilder personDto = PersonDto.builder();

        personDto.id( personDomain.getId() );
        personDto.name( personDomain.getName() );
        personDto.age( personDomain.getAge() );

        return personDto.build();
    }

    @Override
    public List<PersonDto> toDtos(List<PersonDomain> personDomain) {
        if ( personDomain == null ) {
            return null;
        }

        List<PersonDto> list = new ArrayList<PersonDto>( personDomain.size() );
        for ( PersonDomain personDomain1 : personDomain ) {
            list.add( toDto( personDomain1 ) );
        }

        return list;
    }
}
