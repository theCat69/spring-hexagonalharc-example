package com.fef.wha.domain.port;

import com.fef.wha.domain.model.PersonDomain;

import java.util.List;

public interface PersonPort {
    PersonDomain save(PersonDomain personDomain);
    List<PersonDomain> findAll();
}
