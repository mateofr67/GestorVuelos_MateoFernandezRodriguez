/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.tablemodel;

import com.mateofr.tareaevaluacion.datos.Companya;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mateo
 */
public class CompanyasTableModel extends AbstractTableModel {
    private final List<Companya> lstCompanya;
    private final String[] Columnas = {"Prefijo","Código","Nombre","Dirección","Municipio","Teléfono Pasajeros","Teléfono Aeropuertos"}; 

    public CompanyasTableModel(List<Companya> lstCompanya) {
        this.lstCompanya = lstCompanya;
    }
    
    

    @Override
    public int getRowCount() {
        return lstCompanya.size();
    }

    @Override
    public int getColumnCount() {
        return Columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 -> {
                return lstCompanya.get(rowIndex).getPrefijo();
            }
            case 1 -> {
                return lstCompanya.get(rowIndex).getCodigo();
            }
            case 2 -> {
                return lstCompanya.get(rowIndex).getNombre();
            }
            case 3 -> {
                return lstCompanya.get(rowIndex).getDireccion();
            }
            case 4 -> {
                return lstCompanya.get(rowIndex).getMunicipio();
            } 
            case 5 -> {
                return lstCompanya.get(rowIndex).getTelInfoPasajero();
            }
            case 6 -> {
                return lstCompanya.get(rowIndex).getTelInfoAeropuerto();
            }
          
          
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return Columnas[column];
    }
    
    
    
    
    
    
}
