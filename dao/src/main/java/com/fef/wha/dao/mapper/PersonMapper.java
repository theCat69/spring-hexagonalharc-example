package com.fef.wha.dao.mapper;

import com.fef.wha.dao.model.Person;
import com.fef.wha.domain.model.PersonDomain;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper
public interface PersonMapper {
    PersonDomain toDomain(Person person);
    Person toEntity(PersonDomain personDomain);
    List<PersonDomain> toDomains(List<Person> persons);
}
