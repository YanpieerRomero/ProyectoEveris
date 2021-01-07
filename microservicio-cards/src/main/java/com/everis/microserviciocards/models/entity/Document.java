package com.everis.microserviciocards.models.entity;

import java.util.List;

public class Document {
    private String document;
    private List<Card> cards;

    public Document(String document, List<Card> cards) {
        this.document = document;
        this.cards = cards;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
