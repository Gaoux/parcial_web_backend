package com.example.demo.services;

import com.example.demo.dtos.ContratoDTO;
import com.example.demo.entities.Contrato;
import com.example.demo.repositories.ContratoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContratoService {
    private final ContratoRepository contratoRepository;
    private final ModelMapper modelMapper;

    public ContratoService(ContratoRepository contratoRepository, ModelMapper modelMapper) {
        this.contratoRepository = contratoRepository;
        this.modelMapper = modelMapper;
    }

    public ContratoDTO createContrato(ContratoDTO contratoDTO) {
        Contrato contrato = modelMapper.map(contratoDTO, Contrato.class);
        Contrato savedContrato = contratoRepository.save(contrato);
        return modelMapper.map(savedContrato, ContratoDTO.class);
    }

    public ContratoDTO updateContrato(Long id, ContratoDTO contratoDTO) {
        Contrato contrato = contratoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contrato no encontrado"));
        modelMapper.map(contratoDTO, contrato);
        contrato.setId(id); // Asegurar que el ID no cambie
        Contrato updatedContrato = contratoRepository.save(contrato);
        return modelMapper.map(updatedContrato, ContratoDTO.class);
    }

    public void deleteContrato(Long id) {
        contratoRepository.deleteById(id);
    }

    public List<ContratoDTO> getAllContratos() {
        return contratoRepository.findAll()
                .stream()
                .map(contrato -> modelMapper.map(contrato, ContratoDTO.class))
                .collect(Collectors.toList());
    }

    public ContratoDTO getContratoById(Long id) {
        Contrato contrato = contratoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contrato no encontrado"));
        return modelMapper.map(contrato, ContratoDTO.class);
    }
}
