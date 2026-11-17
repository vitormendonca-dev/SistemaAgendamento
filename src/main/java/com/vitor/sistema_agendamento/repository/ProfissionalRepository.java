package com.vitor.sistema_agendamento.repository;

import com.vitor.sistema_agendamento.model.Professional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissionalRepository extends JpaRepository<Professional,Long> {
}
