package com.example.videoclub.service;


import com.example.videoclub.entity.Cinta;
import com.example.videoclub.repository.CintaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CintaService {

    private final CintaRepository repository;

    public CintaService(CintaRepository repository) {
        this.repository = repository;
    }

    public List<Cinta> listar() {
        return repository.findAll();
    }

    public Cinta obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Cinta guardar(Cinta cinta) {
        return repository.save(cinta);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}