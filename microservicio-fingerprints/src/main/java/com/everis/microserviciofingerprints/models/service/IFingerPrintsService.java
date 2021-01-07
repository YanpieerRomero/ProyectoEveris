package com.everis.microserviciofingerprints.models.service;

import com.everis.microserviciofingerprints.models.entity.FingerPrints;
import reactor.core.publisher.Mono;


public interface IFingerPrintsService {
    Mono<FingerPrints> validateDocument(FingerPrints doc);
}
