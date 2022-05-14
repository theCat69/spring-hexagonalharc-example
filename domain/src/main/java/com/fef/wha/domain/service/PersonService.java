package com.fef.wha.domain.service;

import com.fef.wha.domain.model.PersonDomain;

import java.util.List;

public interface PersonService {
    PersonDomain save(PersonDomain personDomain);
    List<PersonDomain> findAll();
}
