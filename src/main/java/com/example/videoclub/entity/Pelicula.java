package com.example.videoclub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "PELICULAS")
public class Pelicula {

    @Id
    @Column(name = "CODIGO_PELICULA")
    private Integer codigoPelicula;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "DIRECTOR_PRINCIPAL")
    private String directorPrincipal;

    @Column(name = "TEMA")
    private String tema;

    public Pelicula() {}

    public Integer getCodigoPelicula() {
        return codigoPelicula;
    }

    public void setCodigoPelicula(Integer codigoPelicula) {
        this.codigoPelicula = codigoPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirectorPrincipal() {
        return directorPrincipal;
    }

    public void setDirectorPrincipal(String directorPrincipal) {
        this.directorPrincipal = directorPrincipal;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
