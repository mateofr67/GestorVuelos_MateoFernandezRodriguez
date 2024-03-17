/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.tablemodel;

import com.mateofr.tareaevaluacion.datos.Aeropuerto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mateo
 */
public class AeropuertosTableModel extends AbstractTableModel {

    private final List<Aeropuerto> lstAeropuertos;
    private final String[] Columnas = {"ID", "Nombre", "IATA", "Municipio"};

    public AeropuertosTableModel(List<Aeropuerto> lstAeropuertos) {
        this.lstAeropuertos = lstAeropuertos;
    }

    @Override
    public int getRowCount() {
        return lstAeropuertos.size();
    }

    @Override
    public int getColumnCount() {
        return Columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 -> {
                return lstAeropuertos.get(rowIndex).getId();
            }
            case 1 -> {
                return lstAeropuertos.get(rowIndex).getNombre();
            }
            case 2 -> {
                return lstAeropuertos.get(rowIndex).getIATA();
            }
            case 3 -> {
                return lstAeropuertos.get(rowIndex).getCodigoMunicipio();
            }

        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return Columnas[column];
    }

}
