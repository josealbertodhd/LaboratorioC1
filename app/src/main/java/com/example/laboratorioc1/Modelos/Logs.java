package com.example.laboratorioc1.Modelos;

public class Logs {
    private String nombre_servidor;
    private String fecha_hora_sesion;
    private String nombre_usuario, estado;

    public Logs() {
    }

    public Logs(String nombre_servidor, String fecha_hora_sesion, String nombre_usuario, String estado) {
        this.nombre_servidor = nombre_servidor;
        this.fecha_hora_sesion = fecha_hora_sesion;
        this.nombre_usuario = nombre_usuario;
        this.estado = estado;
    }

    public String getNombre_servidor() {
        return nombre_servidor;
    }

    public void setNombre_servidor(String nombre_servidor) {
        this.nombre_servidor = nombre_servidor;
    }

    public String getFecha_hora_sesion() {
        return fecha_hora_sesion;
    }

    public void setFecha_hora_sesion(String fecha_hora_sesion) {
        this.fecha_hora_sesion = fecha_hora_sesion;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
