package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "Contrato")
@NoArgsConstructor
@AllArgsConstructor
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String identificador;

    private Double valor;

    private String nombreContratante;
    private String documentoContratante;

    private String nombreContratantista;
    private String documentoContratantista;

    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
}

