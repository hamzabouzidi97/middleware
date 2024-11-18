package com.simulator.pi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "compte")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String participant;
    private String numero;
    private String type;
    private String agence;
    private LocalDateTime dateOuverture;
}
