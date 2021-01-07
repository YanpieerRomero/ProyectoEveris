package com.everis.microserviciocards.models.dao;

import com.everis.microserviciocards.models.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardDao extends JpaRepository<Card, String> {
}
