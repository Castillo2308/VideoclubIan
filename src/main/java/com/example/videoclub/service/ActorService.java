package com.example.videoclub.service;

import com.example.videoclub.entity.Actor;
import com.example.videoclub.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final ActorRepository repository;

    public ActorService(ActorRepository repository) {
        this.repository = repository;
    }

    public List<Actor> listar() {
        return repository.findAll();
    }

    public Actor obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Actor guardar(Actor actor) {
        return repository.save(actor);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
