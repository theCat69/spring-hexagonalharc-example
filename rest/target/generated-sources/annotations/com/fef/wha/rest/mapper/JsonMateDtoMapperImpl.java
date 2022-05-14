package com.fef.wha.rest.mapper;

import com.fef.wha.domain.model.JsonMateDomain;
import com.fef.wha.domain.model.JsonMateDomain.JsonMateDomainBuilder;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-16T21:00:03+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Eclipse Foundation)"
)
public class JsonMateDtoMapperImpl implements JsonMateDtoMapper {

    @Override
    public JsonMateDomain toDomain(JsonMateDto jsonMateDto) {
        if ( jsonMateDto == null ) {
            return null;
        }

        JsonMateDomainBuilder jsonMateDomain = JsonMateDomain.builder();

        jsonMateDomain.name( jsonMateDto.getName() );
        jsonMateDomain.codert( jsonMateDto.getCodert() );
        jsonMateDomain.date( jsonMateDto.getDate() );
        jsonMateDomain.decimal( jsonMateDto.getDecimal() );

        return jsonMateDomain.build();
    }

    @Override
    public JsonMateDto toDto(JsonMateDomain jsonMateDomain) {
        if ( jsonMateDomain == null ) {
            return null;
        }

        JsonMateDtoBuilder jsonMateDto = JsonMateDto.builder();

        jsonMateDto.name( jsonMateDomain.getName() );
        jsonMateDto.codert( jsonMateDomain.getCodert() );
        jsonMateDto.date( jsonMateDomain.getDate() );
        jsonMateDto.decimal( jsonMateDomain.getDecimal() );

        return jsonMateDto.build();
    }
}
