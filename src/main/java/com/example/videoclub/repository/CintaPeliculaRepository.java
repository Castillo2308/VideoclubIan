package com.example.videoclub.repository;


import com.example.videoclub.entity.CintaPelicula;
import com.example.videoclub.entity.CintaPeliculaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CintaPeliculaRepository extends JpaRepository<CintaPelicula, CintaPeliculaId> {
}
