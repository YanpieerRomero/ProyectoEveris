package com.everis.microserviciocards.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @Column(name = "card_number")
    private String cardNumber;
    private Boolean active;

}
