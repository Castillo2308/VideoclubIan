package com.example.videoclub.service;

import com.example.videoclub.entity.CintaPelicula;
import com.example.videoclub.entity.CintaPeliculaId;
import com.example.videoclub.repository.CintaPeliculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CintaPeliculaService {

    private final CintaPeliculaRepository repository;

    public CintaPeliculaService(CintaPeliculaRepository repository) {
        this.repository = repository;
    }

    public List<CintaPelicula> listar() {
        return repository.findAll();
    }

    public CintaPelicula obtener(CintaPeliculaId id) {
        return repository.findById(id).orElse(null);
    }

    public CintaPelicula guardar(CintaPelicula cintaPelicula) {
        return repository.save(cintaPelicula);
    }

    public void eliminar(CintaPeliculaId id) {
        repository.deleteById(id);
    }
}
