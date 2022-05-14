package com.fef.wha;

import com.fef.wha.domain.port.PersonPort;
import com.fef.wha.domain.service.PersonService;
import com.fef.wha.domain.service.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is how to import domain in a spring boot app
 */
@Configuration
public class BeanDomainConfiguration {
    @Bean
    PersonService orderService(PersonPort personPort) {
        return new PersonServiceImpl(personPort);
    }
}
