package com.everis.microservicioaccounts.models.service;

import com.everis.microservicioaccounts.models.entity.Account;
import reactor.core.publisher.Mono;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();
    Mono<Account> findById(String id);
}
