package com.simulator.pi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "alias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Alias {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String cle;
    private LocalDateTime dateOuverture;
    @OneToOne(cascade = CascadeType.ALL)
    private Client client;

    @PrePersist
    protected void onCreate() {
        this.dateOuverture = LocalDateTime.now();
    }
}
