package com.example.videoclub.repository;



import com.example.videoclub.entity.Cinta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CintaRepository extends JpaRepository<Cinta, Integer> {
}