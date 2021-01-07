package com.everis.microservicioreniec.models.service;

import com.everis.microservicioreniec.models.entity.Reniec;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ReniecServiceImpl implements IReniecService{

    @Override
    public Mono<Reniec> validateDocument(Reniec doc) {
        return Mono.just(doc);
    }
}
