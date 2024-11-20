package com.example.demo.dtos;

import lombok.Data;
import java.time.LocalDate;

@Data
public class ContratoDTO {
    private Long id;
    private String identificador;
    private Double valor;
    private String nombreContratante;
    private String documentoContratante;
    private String nombreContratantista;
    private String documentoContratantista;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
}

