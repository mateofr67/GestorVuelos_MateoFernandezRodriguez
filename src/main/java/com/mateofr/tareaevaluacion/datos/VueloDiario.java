/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateofr.tareaevaluacion.datos;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author mateofr
 */
public class VueloDiario {
    private int prefijo; 
    private String codigoVuelo;
    private LocalDate fechaVuelo;
    private LocalTime horaSalidaReal;
    private LocalTime horaLlegadaReal;
    private int plazasOcupadas;
    private double precioVuelo;

    public VueloDiario() {
    }

    public VueloDiario(int prefijo, String codigoVuelo, LocalDate fechaVuelo, LocalTime horaSalidaReal, LocalTime horaLlegadaReal, int plazasOcupadas, double precioVuelo) {
        this.prefijo = prefijo;
        this.codigoVuelo = codigoVuelo;
        this.fechaVuelo = fechaVuelo;
        this.horaSalidaReal = horaSalidaReal;
        this.horaLlegadaReal = horaLlegadaReal;
        this.plazasOcupadas = plazasOcupadas;
        this.precioVuelo = precioVuelo;
    }

  
    
    public int getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }
    
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public LocalDate getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(LocalDate fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public LocalTime getHoraSalidaReal() {
        return horaSalidaReal;
    }

    public void setHoraSalidaReal(LocalTime horaSalidaReal) {
        this.horaSalidaReal = horaSalidaReal;
    }

    public LocalTime getHoraLlegadaReal() {
        return horaLlegadaReal;
    }

    public void setHoraLlegadaReal(LocalTime horaLlegadaReal) {
        this.horaLlegadaReal = horaLlegadaReal;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = plazasOcupadas;
    }

    public double getPrecioVuelo() {
        return precioVuelo;
    }

    public void setPrecioVuelo(double precioVuelo) {
        this.precioVuelo = precioVuelo;
    }

    @Override
    public String toString() {
        return "VueloDiario{" + "prefijo=" + prefijo + ", codigoVuelo=" + codigoVuelo + ", fechaVuelo=" + fechaVuelo + ", horaSalidaReal=" + horaSalidaReal + ", horaLlegadaReal=" + horaLlegadaReal + ", plazasOcupadas=" + plazasOcupadas + ", precioVuelo=" + precioVuelo + '}';
    }
    
    
    
}
