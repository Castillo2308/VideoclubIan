package com.example.videoclub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CINTA_PELICULA")
public class CintaPelicula {

    @EmbeddedId
    private CintaPeliculaId id;

    @ManyToOne
    @MapsId("codigoCinta")
    @JoinColumn(name = "CODIGO_CINTA")
    private Cinta cinta;

    @ManyToOne
    @MapsId("codigoPelicula")
    @JoinColumn(name = "CODIGO_PELICULA")
    private Pelicula pelicula;

    public CintaPelicula() {}

    public CintaPeliculaId getId() {
        return id;
    }

    public void setId(CintaPeliculaId id) {
        this.id = id;
    }

    public Cinta getCinta() {
        return cinta;
    }

    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}
