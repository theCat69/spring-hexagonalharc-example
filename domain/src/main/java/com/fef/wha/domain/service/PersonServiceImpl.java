package com.fef.wha.domain.service;

import com.fef.wha.domain.model.PersonDomain;
import com.fef.wha.domain.port.PersonPort;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    PersonPort personPort;

    public PersonServiceImpl(PersonPort personPort) {
        this.personPort = personPort;
    }

    @Override
    public PersonDomain save(PersonDomain personDomain) {
        return personPort.save(personDomain);
    }

    @Override
    public List<PersonDomain> findAll() {
        return personPort.findAll();
    }
}
