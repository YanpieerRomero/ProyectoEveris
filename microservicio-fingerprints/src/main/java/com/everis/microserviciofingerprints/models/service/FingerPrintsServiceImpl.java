package com.everis.microserviciofingerprints.models.service;

import com.everis.microserviciofingerprints.models.entity.FingerPrints;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FingerPrintsServiceImpl implements IFingerPrintsService{

    @Override
    public Mono<FingerPrints> validateDocument(FingerPrints doc) {
        return Mono.just(doc);
    }
}
