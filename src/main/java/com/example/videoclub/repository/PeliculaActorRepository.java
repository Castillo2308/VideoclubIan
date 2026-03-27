

package com.example.videoclub.repository;

import com.example.videoclub.entity.PeliculaActor;
import com.example.videoclub.entity.PeliculaActorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaActorRepository extends JpaRepository<PeliculaActor, PeliculaActorId> {
}