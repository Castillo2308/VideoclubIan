package com.example.videoclub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CintaPeliculaId implements Serializable {

    @Column(name = "CODIGO_CINTA")
    private Integer codigoCinta;

    @Column(name = "CODIGO_PELICULA")
    private Integer codigoPelicula;

    public CintaPeliculaId() {}

    public CintaPeliculaId(Integer codigoCinta, Integer codigoPelicula) {
        this.codigoCinta = codigoCinta;
        this.codigoPelicula = codigoPelicula;
    }

    public Integer getCodigoCinta() {
        return codigoCinta;
    }

    public void setCodigoCinta(Integer codigoCinta) {
        this.codigoCinta = codigoCinta;
    }

    public Integer getCodigoPelicula() {
        return codigoPelicula;
    }

    public void setCodigoPelicula(Integer codigoPelicula) {
        this.codigoPelicula = codigoPelicula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CintaPeliculaId that = (CintaPeliculaId) o;
        return Objects.equals(codigoCinta, that.codigoCinta) && Objects.equals(codigoPelicula, that.codigoPelicula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCinta, codigoPelicula);
    }
}
