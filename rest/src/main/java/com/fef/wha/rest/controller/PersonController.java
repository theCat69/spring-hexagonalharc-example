package com.fef.wha.rest.controller;

import com.fef.wha.domain.service.PersonService;
import com.fef.wha.rest.dto.PersonDto;
import com.fef.wha.rest.mapper.PersonDtoMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService service;

    PersonDtoMapper mapper = Mappers.getMapper(PersonDtoMapper.class);

    @PostMapping
    @Transactional
    public PersonDto createPerson(@RequestBody PersonDto personDto) {
        return mapper.toDto(service.save(mapper.toDomain(personDto)));
    }

    @GetMapping
    public List<PersonDto> getAll() {
        return mapper.toDtos(service.findAll());
    }
}
