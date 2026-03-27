package com.example.videoclub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "ACTORES")
public class Actor {

    @Id
    @Column(name = "CODIGO_ACTOR")
    private Integer codigoActor;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "OTROS_DATOS")
    private String otrosDatos;

    public Actor() {}

    public Integer getCodigoActor() {
        return codigoActor;
    }

    public void setCodigoActor(Integer codigoActor) {
        this.codigoActor = codigoActor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOtrosDatos() {
        return otrosDatos;
    }

    public void setOtrosDatos(String otrosDatos) {
        this.otrosDatos = otrosDatos;
    }
}