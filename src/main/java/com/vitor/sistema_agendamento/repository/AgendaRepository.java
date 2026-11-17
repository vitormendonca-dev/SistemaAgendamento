package com.vitor.sistema_agendamento.repository;

import com.vitor.sistema_agendamento.model.AgendaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AgendaRepository extends JpaRepository<AgendaModel, Long> {
    List<AgendaModel> findByDatetimeBetween(LocalDateTime inicio, LocalDateTime fim);

    List<AgendaModel> findByProfissional_Id(Long profissionalId);

    @Query("""
    SELECT COUNT(a) > 0 FROM Agenda a
    WHERE a.profissional.id = :profissionalId
      AND a.status <> com.vitor.sistema_agendamento.model.StatusAgendamento.CANCELADO
      AND :inicio < a.dataHoraFim
      AND :fim > a.dataHoraInicio
""")
    boolean existeConflito(@Param("profissionalId") Long professionalId,
                           @Param("inicio") LocalDateTime inicio,
                           @Param("fim") LocalDateTime fim);


}
