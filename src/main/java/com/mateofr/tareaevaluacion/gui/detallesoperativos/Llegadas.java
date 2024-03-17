/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.detallesoperativos;

import com.mateofr.tareaevaluacion.gui.tablemodel.VuelosDiariosTableModel;
import com.mateofr.tareaevaluacion.logicanegocio.Logica;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Mateo
 */
public class Llegadas extends javax.swing.JDialog {
    private final Logica logica = new Logica();

    Calendar fecha_actual = new GregorianCalendar();

    public Llegadas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logica.ponLaAyudaDialog(itmAyuda, "llegadas",this);
        fechaFiltroLlegada.setCalendar(fecha_actual);
        tblVuelosSalida.setModel(new VuelosDiariosTableModel(Logica.ObtenerLlegadasAeropuertoActual(fechaFiltroLlegada)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVuelosSalida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fechaFiltroLlegada = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        btnFiltrarLlegadas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblVuelosSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblVuelosSalida);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LLEGADAS");

        fechaFiltroLlegada.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("FILTRAR POR FECHA:");

        btnFiltrarLlegadas.setText("FILTRAR");
        btnFiltrarLlegadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarLlegadasActionPerformed(evt);
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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaFiltroLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnFiltrarLlegadas)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFiltrarLlegadas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel2))
                        .addComponent(fechaFiltroLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarLlegadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarLlegadasActionPerformed
        tblVuelosSalida.setModel(new VuelosDiariosTableModel(Logica.ObtenerLlegadasAeropuertoActual(fechaFiltroLlegada)));
    }//GEN-LAST:event_btnFiltrarLlegadasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrarLlegadas;
    private com.toedter.calendar.JDateChooser fechaFiltroLlegada;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVuelosSalida;
    // End of variables declaration//GEN-END:variables
}
