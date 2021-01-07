package com.everis.microserviciocards.models.service;

import com.everis.microserviciocards.models.entity.Card;
import com.everis.microserviciocards.models.entity.Document;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ICardService {
    List<Card> findAll();
    Mono<Document> findAllCardsWithDocument(Document doc);
}
