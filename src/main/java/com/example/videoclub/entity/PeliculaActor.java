package com.example.videoclub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PELICULA_ACTOR")
public class PeliculaActor {

    @EmbeddedId
    private PeliculaActorId id;

    @ManyToOne
    @MapsId("codigoPelicula")
    @JoinColumn(name = "CODIGO_PELICULA")
    private Pelicula pelicula;

    @ManyToOne
    @MapsId("codigoActor")
    @JoinColumn(name = "CODIGO_ACTOR")
    private Actor actor;

    public PeliculaActor() {}

    public PeliculaActorId getId() {
        return id;
    }

    public void setId(PeliculaActorId id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
