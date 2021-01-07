package com.everis.microservicioreniec.models.controllers;

import com.everis.microservicioreniec.models.entity.Reniec;
import com.everis.microservicioreniec.models.service.IReniecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/external/reniec")
public class ReniecController {

    @Autowired
    private IReniecService iReniecService;

    @PostMapping("/validate")
    public Mono<ResponseEntity<Reniec>> validate(@RequestBody Mono<Reniec> document) {
        return document.flatMap(iReniecService::validateDocument).map(ResponseEntity::ok);
    }

}
