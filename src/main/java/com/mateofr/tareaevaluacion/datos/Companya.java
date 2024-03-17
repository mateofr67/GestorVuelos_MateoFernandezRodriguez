/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateofr.tareaevaluacion.datos;

/**
 *
 * @author mateofr
 */
public class Companya {
    private int prefijo;
    private String codigo;
    private String nombre;
    private String direccion;
    private String municipio;
    private String telInfoPasajero;
    private String telInfoAeropuerto;

    public Companya() {
    }

    public Companya(int prefijo, String codigo, String nombre, String direccion, String municipio, String telInfoPasajero, String telInfoAeropuerto) {
        this.prefijo = prefijo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.municipio = municipio;
        this.telInfoPasajero = telInfoPasajero;
        this.telInfoAeropuerto = telInfoAeropuerto;
    }

    public int getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelInfoPasajero() {
        return telInfoPasajero;
    }

    public void setTelInfoPasajero(String telInfoPasajero) {
        this.telInfoPasajero = telInfoPasajero;
    }

    public String getTelInfoAeropuerto() {
        return telInfoAeropuerto;
    }

    public void setTelInfoAeropuerto(String telInfoAeropuerto) {
        this.telInfoAeropuerto = telInfoAeropuerto;
    }

    @Override
    public String toString() {
        return "Companya{" + "prefijo=" + prefijo + ", codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", municipio=" + municipio + ", telInfoPasajero=" + telInfoPasajero + ", telInfoAeropuerto=" + telInfoAeropuerto + '}';
    }

    
   

 
    
    
    
    
}
