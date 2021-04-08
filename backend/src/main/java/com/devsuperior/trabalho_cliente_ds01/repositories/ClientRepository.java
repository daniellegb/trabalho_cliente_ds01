package com.devsuperior.trabalho_cliente_ds01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.trabalho_cliente_ds01.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
