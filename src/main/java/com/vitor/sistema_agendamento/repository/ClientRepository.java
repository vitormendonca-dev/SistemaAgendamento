package com.vitor.sistema_agendamento.repository;

import com.vitor.sistema_agendamento.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel,Long> {
}
