package com.everis.microservicioaccounts.models.controllers;

import com.everis.microservicioaccounts.models.entity.Account;
import com.everis.microservicioaccounts.models.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping("/core")
public class AccountController {

    @Autowired
    private IAccountService iAccountService;

    @GetMapping("/accounts/all")
    public List<Account> listar(){
        return iAccountService.findAll();
    }

    @GetMapping("/accounts")
    public Mono<ResponseEntity<Account>> encontrarPorId(@RequestParam String cardNumber) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return iAccountService.findById(cardNumber.replaceAll("\"", ""))
//                .delayElement(Duration.ofSeconds(5))
                .map(p -> ResponseEntity.ok()
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .body(p))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
