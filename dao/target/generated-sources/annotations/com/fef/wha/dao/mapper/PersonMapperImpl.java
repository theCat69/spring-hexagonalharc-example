package com.fef.wha.dao.mapper;

import com.fef.wha.dao.model.Person;
import com.fef.wha.dao.model.Person.PersonBuilder;
import com.fef.wha.domain.model.PersonDomain;
import com.fef.wha.domain.model.PersonDomain.PersonDomainBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-14T18:30:44+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDomain toDomain(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDomainBuilder personDomain = PersonDomain.builder();

        personDomain.id( person.getId() );
        personDomain.name( person.getName() );
        personDomain.age( person.getAge() );

        return personDomain.build();
    }

    @Override
    public Person toEntity(PersonDomain personDomain) {
        if ( personDomain == null ) {
            return null;
        }

        PersonBuilder person = Person.builder();

        person.id( personDomain.getId() );
        person.name( personDomain.getName() );
        person.age( personDomain.getAge() );

        return person.build();
    }

    @Override
    public List<PersonDomain> toDomains(List<Person> persons) {
        if ( persons == null ) {
            return null;
        }

        List<PersonDomain> list = new ArrayList<PersonDomain>( persons.size() );
        for ( Person person : persons ) {
            list.add( toDomain( person ) );
        }

        return list;
    }
}
