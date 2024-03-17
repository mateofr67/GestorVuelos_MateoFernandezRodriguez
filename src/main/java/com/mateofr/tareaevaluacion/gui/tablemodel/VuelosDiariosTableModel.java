/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.tablemodel;

import com.mateofr.tareaevaluacion.datos.VueloDiario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mateo
 */
public class VuelosDiariosTableModel extends AbstractTableModel {

    private List<VueloDiario> lstVuelosDiarios;
    private String[] Columnas = {"Prefijo","Código", "Fecha", "Hora Salida", "Hora Llegada", "Plazas Ocupadas", "Precio"};

    public VuelosDiariosTableModel(List<VueloDiario> lstVuelosDiarios) {
        this.lstVuelosDiarios = lstVuelosDiarios;
    }

    @Override
    public int getRowCount() {
        return lstVuelosDiarios.size();
    }

    @Override
    public int getColumnCount() {
        return Columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lstVuelosDiarios.get(rowIndex).getPrefijo();
            case 1:
                return lstVuelosDiarios.get(rowIndex).getCodigoVuelo();
            case 2:
                return lstVuelosDiarios.get(rowIndex).getFechaVuelo();
            case 3:
                return lstVuelosDiarios.get(rowIndex).getHoraSalidaReal();
            case 4:
                return lstVuelosDiarios.get(rowIndex).getHoraLlegadaReal();
            case 5:
                return lstVuelosDiarios.get(rowIndex).getPlazasOcupadas();
            case 6:
                return lstVuelosDiarios.get(rowIndex).getPrecioVuelo();

        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return Columnas[column];
    }

}
