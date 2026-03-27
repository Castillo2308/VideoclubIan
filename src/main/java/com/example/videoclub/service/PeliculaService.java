package com.example.videoclub.service;

import com.example.videoclub.entity.Pelicula;
import com.example.videoclub.repository.PeliculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {

    private final PeliculaRepository repository;

    public PeliculaService(PeliculaRepository repository) {
        this.repository = repository;
    }

    public List<Pelicula> listar() {
        return repository.findAll();
    }

    public Pelicula obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Pelicula guardar(Pelicula pelicula) {
        return repository.save(pelicula);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
