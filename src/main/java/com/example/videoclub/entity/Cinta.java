package com.example.videoclub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "CINTAS")
public class Cinta {

    @Id
    @Column(name = "CODIGO_CINTA")
    private Integer codigoCinta;

    @Column(name = "ESTANTERIA")
    private String estanteria;

    @Column(name = "ESTANTE")
    private String estante;

    @Column(name = "FILA")
    private String fila;

    public Cinta() {}

    public Integer getCodigoCinta() {
        return codigoCinta;
    }

    public void setCodigoCinta(Integer codigoCinta) {
        this.codigoCinta = codigoCinta;
    }

    public String getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(String estanteria) {
        this.estanteria = estanteria;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }
}