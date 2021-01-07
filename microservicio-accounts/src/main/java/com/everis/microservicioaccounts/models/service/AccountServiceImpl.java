package com.everis.microservicioaccounts.models.service;

import com.everis.microservicioaccounts.models.dao.AccountDao;
import com.everis.microservicioaccounts.models.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService{

    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional(readOnly = true)
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Mono<Account> findById(String id) {
        return Mono.just(accountDao.findById(id).orElse(null));
    }

}
