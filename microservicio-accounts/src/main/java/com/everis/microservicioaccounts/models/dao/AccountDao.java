package com.everis.microservicioaccounts.models.dao;

import com.everis.microservicioaccounts.models.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, String> {
}
