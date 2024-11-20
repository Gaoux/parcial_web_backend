package com.example.demo.controllers;

import com.example.demo.dtos.ContratoDTO;
import com.example.demo.services.ContratoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contratos")
public class ContratoController {
    private final ContratoService contratoService;

    public ContratoController(ContratoService contratoService) {
        this.contratoService = contratoService;
    }

    @PostMapping
    public ResponseEntity<ContratoDTO> createContrato(@RequestBody ContratoDTO contratoDTO) {
        return ResponseEntity.ok(contratoService.createContrato(contratoDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContratoDTO> updateContrato(@PathVariable Long id, @RequestBody ContratoDTO contratoDTO) {
        return ResponseEntity.ok(contratoService.updateContrato(id, contratoDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContrato(@PathVariable Long id) {
        contratoService.deleteContrato(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ContratoDTO>> getAllContratos() {
        return ResponseEntity.ok(contratoService.getAllContratos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContratoDTO> getContratoById(@PathVariable Long id) {
        return ResponseEntity.ok(contratoService.getContratoById(id));
    }
}

