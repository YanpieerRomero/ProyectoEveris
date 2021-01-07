package com.everis.microserviciopersons.models.service;

import com.everis.microserviciopersons.models.dao.PersonDao;
import com.everis.microserviciopersons.models.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class PersonServiceImpl implements IPersonService{

    private final PersonDao personDao;

    @Override
    @Transactional(readOnly = true)
    public Flux<Person> findAll() {
        return Flux.fromIterable(personDao.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Mono<Person> findById(Long id) {
        return Mono.just(personDao.findById(id).orElse(null));
    }

    @Override
    public Mono<Person> findByDocument(String document) {
        return Mono.just(personDao.findByDocument(document));
    }
}
