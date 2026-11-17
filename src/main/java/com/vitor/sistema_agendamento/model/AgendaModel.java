package com.vitor.sistema_agendamento.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "agenda")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgendaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "client_id")
    private ClientModel cliente;

    @ManyToOne(optional = false)
    @JoinColumn(name = "profissional_id")
    private ProfissionalModel profissional;

    private LocalDateTime datetime;

}


