package com.example.laboratorioc1.Modelos;

public class Eventos {
    private String fecha_HoraI_Eventos;
    private String fecha_HoraF_Eventos;
    private String causa, server, indisponibilidad;
    private String solucion;

    public Eventos() {
    }

    public Eventos(String fecha_HoraI_Eventos, String fecha_HoraF_Eventos, String causa, String server, String indisponibilidad, String solucion) {
        this.fecha_HoraI_Eventos = fecha_HoraI_Eventos;
        this.fecha_HoraF_Eventos = fecha_HoraF_Eventos;
        this.causa = causa;
        this.server = server;
        this.indisponibilidad = indisponibilidad;
        this.solucion = solucion;
    }

    public String getFecha_HoraI_Eventos() {
        return fecha_HoraI_Eventos;
    }

    public void setFecha_HoraI_Eventos(String fecha_HoraI_Eventos) {
        this.fecha_HoraI_Eventos = fecha_HoraI_Eventos;
    }

    public String getFecha_HoraF_Eventos() {
        return fecha_HoraF_Eventos;
    }

    public void setFecha_HoraF_Eventos(String fecha_HoraF_Eventos) {
        this.fecha_HoraF_Eventos = fecha_HoraF_Eventos;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getIndisponibilidad() {
        return indisponibilidad;
    }

    public void setIndisponibilidad(String indisponibilidad) {
        this.indisponibilidad = indisponibilidad;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }
}
