/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateofr.tareaevaluacion.datos;

import java.time.LocalTime;

/**
 *
 * @author mateofr
 * 
 */


public class VueloBase {
    private String codigoVuelo;
    private String aeropuertoOrigen;
    private String aeropuertoDestino;
    private int numeroPlazas;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    private String diasOperativo;

    public VueloBase() {
    }

    public VueloBase(String codigoVuelo, String aeropuertoOrigen, String aeropuertoDestino, int numeroPlazas, LocalTime horaSalida, LocalTime horaLlegada, String diasOperativo) {
        this.codigoVuelo = codigoVuelo;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasOperativo = diasOperativo;
    }
    
    
    



    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public void setAeropuertoOrigen(String aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public String getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(String aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getDiasOperativo() {
        return diasOperativo;
    }

    public void setDiasOperativo(String diasOperativo) {
        this.diasOperativo = diasOperativo;
    }

    @Override
    public String toString() {
        return "VueloBase{" + "codigoVuelo=" + codigoVuelo + ", aeropuertoOrigen=" + aeropuertoOrigen + ", aeropuertoDestino=" + aeropuertoDestino + ", numeroPlazas=" + numeroPlazas + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + ", diasOperativo=" + diasOperativo + '}';
    }
    
    
   
   
    
    
    
    
    
}
