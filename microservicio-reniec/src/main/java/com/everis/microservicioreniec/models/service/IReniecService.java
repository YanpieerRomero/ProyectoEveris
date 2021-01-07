package com.everis.microservicioreniec.models.service;

import com.everis.microservicioreniec.models.entity.Reniec;
import reactor.core.publisher.Mono;


public interface IReniecService {
    Mono<Reniec> validateDocument(Reniec doc);
}
