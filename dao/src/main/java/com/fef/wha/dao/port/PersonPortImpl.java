package com.fef.wha.dao.port;

import com.fef.wha.dao.mapper.PersonMapper;
import com.fef.wha.dao.repository.PersonRepository;
import com.fef.wha.domain.model.PersonDomain;
import com.fef.wha.domain.port.PersonPort;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonPortImpl implements PersonPort {

    @Autowired
    PersonRepository repository;

    PersonMapper mapper = Mappers.getMapper(PersonMapper.class);

    @Override
    public PersonDomain save(PersonDomain personDomain) {
        return mapper.toDomain(repository.save(mapper.toEntity(personDomain)));
    }

    @Override
    public List<PersonDomain> findAll() {
        return mapper.toDomains(repository.findAll());
    }
}
