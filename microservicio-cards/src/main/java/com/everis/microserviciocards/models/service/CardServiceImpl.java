package com.everis.microserviciocards.models.service;

import com.everis.microserviciocards.models.dao.CardDao;
import com.everis.microserviciocards.models.entity.Card;
import com.everis.microserviciocards.models.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CardServiceImpl implements ICardService{

    @Autowired
    private CardDao cardDao;

    @Override
    @Transactional(readOnly = true)
    public List<Card> findAll() {
        return cardDao.findAll();
    }

    @Override
    public Mono<Document> findAllCardsWithDocument(Document doc) {
        return Mono.just(doc);
    }


}
