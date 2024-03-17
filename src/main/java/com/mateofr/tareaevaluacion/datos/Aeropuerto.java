/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateofr.tareaevaluacion.datos;

/**
 *
 * @author mateofr
 */
public class Aeropuerto {
    private int id;
    private String nombre;
    private String IATA;
    private String codigoMunicipio;

    public Aeropuerto() {
    }

    public Aeropuerto(int id, String nombre, String IATA, String codigoMunicipio) {
        this.id = id;
        this.nombre = nombre;
        this.IATA = IATA;
        this.codigoMunicipio = codigoMunicipio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIATA() {
        return IATA;
    }

    public void setIATA(String IATA) {
        this.IATA = IATA;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" + "id=" + id + ", nombre=" + nombre + ", IATA=" + IATA + ", codigoMunicipio=" + codigoMunicipio + '}';
    }

   

      
}
