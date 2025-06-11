package com.proyecto.marketsync.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private roles rol;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private tipo_documento id_tipo_documento;

    private String nombre;
    private String contraseña;
    private String gmail;
    private String n_identificacion;

    public usuarios() {
    }

    public enum TipoEstado {
        ACTIVO,
        INACTIVO
    }
    @Enumerated(EnumType.STRING)
    private TipoEstado estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public roles getRol() {
        return rol;
    }

    public void setRol(roles rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public tipo_documento getId_tipo_documento() {
        return id_tipo_documento;
    }

    public void setId_tipo_documento(tipo_documento id_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
    }

    public String getN_identificacion() {
        return n_identificacion;
    }

    public void setN_identificacion(String n_identificacion) {
        this.n_identificacion = n_identificacion;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }

}
