package com.everis.microserviciofingerprints.models.controllers;

import com.everis.microserviciofingerprints.models.entity.FingerPrints;
import com.everis.microserviciofingerprints.models.service.IFingerPrintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/core/fingerprints")
public class FingerPrintsController {

    @Autowired
    private IFingerPrintsService iFingerPrintsService;

    @PostMapping("/validate")
    public Mono<ResponseEntity<FingerPrints>> validate(@RequestBody Mono<FingerPrints> document) {
        return document.flatMap(iFingerPrintsService::validateDocument).map(ResponseEntity::ok);
    }

}
