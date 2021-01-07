package com.everis.microserviciocards.models.controllers;

import com.everis.microserviciocards.models.entity.Card;
import com.everis.microserviciocards.models.entity.Document;
import com.everis.microserviciocards.models.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/core")
public class CardController {

    @Autowired
    private ICardService iCardService;

    @GetMapping("/cards/all")
    public List<Card> listar(){
        return iCardService.findAll();
    }

    @GetMapping("/cards")
    public Mono<Document> listarTodo(@RequestParam String documentNumber){
        return iCardService
                .findAllCardsWithDocument(new Document(documentNumber
                        .replaceAll("\"",""), listar()));
    }

}
