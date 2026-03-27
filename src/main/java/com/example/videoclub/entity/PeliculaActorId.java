package com.example.videoclub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PeliculaActorId implements Serializable {

    @Column(name = "CODIGO_PELICULA")
    private Integer codigoPelicula;

    @Column(name = "CODIGO_ACTOR")
    private Integer codigoActor;

    public PeliculaActorId() {}

    public PeliculaActorId(Integer codigoPelicula, Integer codigoActor) {
        this.codigoPelicula = codigoPelicula;
        this.codigoActor = codigoActor;
    }

    public Integer getCodigoPelicula() {
        return codigoPelicula;
    }

    public void setCodigoPelicula(Integer codigoPelicula) {
        this.codigoPelicula = codigoPelicula;
    }

    public Integer getCodigoActor() {
        return codigoActor;
    }

    public void setCodigoActor(Integer codigoActor) {
        this.codigoActor = codigoActor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeliculaActorId that = (PeliculaActorId) o;
        return Objects.equals(codigoPelicula, that.codigoPelicula) && Objects.equals(codigoActor, that.codigoActor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPelicula, codigoActor);
    }
}
