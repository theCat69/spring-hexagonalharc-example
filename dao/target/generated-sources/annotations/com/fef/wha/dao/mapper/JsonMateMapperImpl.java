package com.fef.wha.dao.mapper;

import com.fef.wha.domain.model.JsonMateDomain;
import com.fef.wha.domain.model.JsonMateDomain.JsonMateDomainBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-16T22:43:51+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Eclipse Foundation)"
)
public class JsonMateMapperImpl implements JsonMateMapper {

    @Override
    public JsonMateDomain toDomain(JsonMate jsonMate) {
        if ( jsonMate == null ) {
            return null;
        }

        JsonMateDomainBuilder jsonMateDomain = JsonMateDomain.builder();

        jsonMateDomain.name( jsonMate.getName() );
        jsonMateDomain.codert( jsonMate.getCodert() );
        jsonMateDomain.date( jsonMate.getDate() );
        jsonMateDomain.decimal( jsonMate.getDecimal() );

        return jsonMateDomain.build();
    }

    @Override
    public JsonMate toEntity(JsonMateDomain jsonMateDomain) {
        if ( jsonMateDomain == null ) {
            return null;
        }

        JsonMateBuilder jsonMate = JsonMate.builder();

        jsonMate.name( jsonMateDomain.getName() );
        jsonMate.codert( jsonMateDomain.getCodert() );
        jsonMate.date( jsonMateDomain.getDate() );
        jsonMate.decimal( jsonMateDomain.getDecimal() );

        return jsonMate.build();
    }
}
