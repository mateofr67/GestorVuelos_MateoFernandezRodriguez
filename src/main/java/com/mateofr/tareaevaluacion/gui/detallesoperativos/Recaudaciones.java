/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.detallesoperativos;

import com.mateofr.tareaevaluacion.datos.VueloDiario;
import com.mateofr.tareaevaluacion.logicanegocio.Logica;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateo
 */
public class Recaudaciones extends javax.swing.JDialog {
    private final Logica logica = new Logica();
    private final DefaultTableModel model;
   private final List<VueloDiario> vuelosDiarios;

   
    public Recaudaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logica.ponLaAyudaDialog(itmAyuda, "recaudaciones",this);
        model = (DefaultTableModel) jTable1.getModel();


String rutaArchivoVuelosDiarios = "./csv/VuelosDiarios.csv";
vuelosDiarios = Logica.leerVuelosDiariosDesdeCSV(rutaArchivoVuelosDiarios);


cargarDatosEnTabla(LocalDate.now());
    }

    private void cargarDatosEnTabla(LocalDate fechaSeleccionada) {

    model.setRowCount(0);


    double recaudacionTotal;
        recaudacionTotal = vuelosDiarios.stream()
                .filter(vueloDiario -> vueloDiario.getFechaVuelo().equals(fechaSeleccionada))
                .filter(vueloDiario -> {
                    if (vueloDiario.getFechaVuelo() != null) {
                        LocalDateTime salidaReal = LocalDateTime.of(vueloDiario.getFechaVuelo(), vueloDiario.getHoraSalidaReal());
                        return salidaReal.isBefore(LocalDateTime.now());
                    }
                    return false; 
                })
                .mapToDouble(this::calcularImporteRecaudado)
                .sum();

  
    model.addRow(new Object[]{fechaSeleccionada, recaudacionTotal});
}
   public double calcularImporteRecaudado(VueloDiario vueloDiario) {
        
        int plazasOcupadas = vueloDiario.getPlazasOcupadas();
        double precioPrevisto = vueloDiario.getPrecioVuelo();
        return plazasOcupadas * precioPrevisto;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtroRecaudacionFecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnFiltrarRecaudacion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        filtroRecaudacionFecha.setDateFormatString("dd/MM/yyyy");

        jLabel1.setText("Filtrar por fecha:");

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Recaudaciones de Vuelos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha", "Recaudación"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnFiltrarRecaudacion.setText("FILTRAR");
        btnFiltrarRecaudacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarRecaudacionActionPerformed(evt);
            }
        });

        jMenu1.setText("Ayuda");

        itmAyuda.setText("Mostrar Ayuda");
        jMenu1.add(itmAyuda);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtroRecaudacionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnFiltrarRecaudacion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addComponent(filtroRecaudacionFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFiltrarRecaudacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarRecaudacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarRecaudacionActionPerformed
         LocalDate fechaSeleccionada = filtroRecaudacionFecha.getDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

    // Cargar los datos en la tabla para la fecha seleccionada
    cargarDatosEnTabla(fechaSeleccionada);
    }//GEN-LAST:event_btnFiltrarRecaudacionActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrarRecaudacion;
    private com.toedter.calendar.JDateChooser filtroRecaudacionFecha;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
