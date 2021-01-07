package com.everis.microservicioaccounts.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @Column(name = "account_number")
    private String accountNumber;
    private Long amount;

    public String getAccountNumber() {
        return accountNumber + "XXX";
    }
}
