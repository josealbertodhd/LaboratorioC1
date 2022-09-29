package com.example.laboratorioc1.Modelos;

public class Seguridad {
    private String nombre_servidor;
    private String nombre_evento;
    private String descripcion;

    public Seguridad() {
    }

    public Seguridad(String nombre_servidor, String nombre_evento, String descripcion) {
        this.nombre_servidor = nombre_servidor;
        this.nombre_evento = nombre_evento;
        this.descripcion = descripcion;
    }

    public String getNombre_servidor() {
        return nombre_servidor;
    }

    public void setNombre_servidor(String nombre_servidor) {
        this.nombre_servidor = nombre_servidor;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
