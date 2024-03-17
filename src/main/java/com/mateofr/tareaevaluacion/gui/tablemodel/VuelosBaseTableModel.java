/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.tablemodel;


import com.mateofr.tareaevaluacion.datos.VueloBase;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mateo
 */
public class VuelosBaseTableModel extends AbstractTableModel {
     private final List<VueloBase> lstVuelosBase;
      private final String[] Columnas = {"Código","Origen","Destino","Plazas","Hora Salida","Hora Llegada","Días Operativo"}; 

    public VuelosBaseTableModel(List<VueloBase> lstCompanya) {
        this.lstVuelosBase = lstCompanya;
    }

    @Override
    public int getRowCount() {
       return lstVuelosBase.size();
    }

    @Override
    public int getColumnCount() {
        return Columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          switch(columnIndex){
            case 0 -> {
                return lstVuelosBase.get(rowIndex).getCodigoVuelo();
             }
            case 1 -> {
                return lstVuelosBase.get(rowIndex).getAeropuertoOrigen();
             }
            case 2 -> {
                return lstVuelosBase.get(rowIndex).getAeropuertoDestino();
             }
            case 3 -> {
                return lstVuelosBase.get(rowIndex).getNumeroPlazas();
             }
            case 4 -> {
                return lstVuelosBase.get(rowIndex).getHoraSalida();
             } 
            case 5 -> {
                return lstVuelosBase.get(rowIndex).getHoraLlegada();
             }
            case 6 -> {
                return lstVuelosBase.get(rowIndex).getDiasOperativo();
             }

          
          
        }
        return null;
    }
    
        @Override
    public String getColumnName(int column) {
        return Columnas[column];
    }
      
      
    
}
