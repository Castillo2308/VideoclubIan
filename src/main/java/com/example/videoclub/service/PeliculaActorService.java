package com.example.videoclub.service;

import com.example.videoclub.entity.PeliculaActor;
import com.example.videoclub.entity.PeliculaActorId;
import com.example.videoclub.repository.PeliculaActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaActorService {

    private final PeliculaActorRepository repository;

    public PeliculaActorService(PeliculaActorRepository repository) {
        this.repository = repository;
    }

    public List<PeliculaActor> listar() {
        return repository.findAll();
    }

    public PeliculaActor obtener(PeliculaActorId id) {
        return repository.findById(id).orElse(null);
    }

    public PeliculaActor guardar(PeliculaActor peliculaActor) {
        return repository.save(peliculaActor);
    }

    public void eliminar(PeliculaActorId id) {
        repository.deleteById(id);
    }
}
