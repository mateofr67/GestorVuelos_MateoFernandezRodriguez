/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.detallesoperativos;

import com.mateofr.tareaevaluacion.logicanegocio.Logica;

/**
 *
 * @author Mateo
 */
public class GestorDetallesOperativos extends javax.swing.JDialog {
private final Logica logica = new Logica();
    private static Aeropuertos aero;
    private static Salidas sal;
    private static Llegadas lle;
    private static VuelosCompanya vc;
    private static Recaudaciones rec;
    private static VuelosPrevistos vp;

    /**
     * Creates new form GestorDetallesOperativos
     */
    public GestorDetallesOperativos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logica.ponLaAyudaDialog(itmAyuda, "gestor_detallesoperativos",this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAeropuertos = new javax.swing.JButton();
        btnSalidas = new javax.swing.JButton();
        btnLlegadas = new javax.swing.JButton();
        btnRecaudaciones = new javax.swing.JButton();
        btnVuelosCompanya = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVuelosPrevistos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAeropuertos.setBackground(new java.awt.Color(255, 255, 102));
        btnAeropuertos.setText("MOSTRAR AEROPUERTOS");
        btnAeropuertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAeropuertosActionPerformed(evt);
            }
        });

        btnSalidas.setBackground(new java.awt.Color(255, 255, 102));
        btnSalidas.setText("SALIDAS ");
        btnSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidasActionPerformed(evt);
            }
        });

        btnLlegadas.setBackground(new java.awt.Color(255, 255, 102));
        btnLlegadas.setText("LLEGADAS");
        btnLlegadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlegadasActionPerformed(evt);
            }
        });

        btnRecaudaciones.setBackground(new java.awt.Color(255, 255, 102));
        btnRecaudaciones.setText("RECAUDACIONES");
        btnRecaudaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecaudacionesActionPerformed(evt);
            }
        });

        btnVuelosCompanya.setBackground(new java.awt.Color(255, 255, 102));
        btnVuelosCompanya.setText("VUELOS POR COMPAÑÍA");
        btnVuelosCompanya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosCompanyaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DETALLES OPERATIVOS");

        btnVuelosPrevistos.setBackground(new java.awt.Color(255, 255, 102));
        btnVuelosPrevistos.setText("VUELOS PREVISTOS ");
        btnVuelosPrevistos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosPrevistosActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAeropuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLlegadas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVuelosCompanya, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRecaudaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVuelosPrevistos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAeropuertos, btnLlegadas, btnRecaudaciones, btnSalidas, btnVuelosCompanya, btnVuelosPrevistos});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAeropuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecaudaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVuelosCompanya, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVuelosPrevistos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLlegadas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAeropuertos, btnLlegadas, btnRecaudaciones, btnSalidas, btnVuelosCompanya, btnVuelosPrevistos});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAeropuertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAeropuertosActionPerformed
        if (aero == null) {
            aero = new Aeropuertos(null, false);
        }
        aero.setVisible(true);
    }//GEN-LAST:event_btnAeropuertosActionPerformed

    private void btnSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidasActionPerformed
        if (sal == null) {
            sal = new Salidas(null, false);
        }
        sal.setVisible(true);
    }//GEN-LAST:event_btnSalidasActionPerformed

    private void btnLlegadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlegadasActionPerformed
        if (lle == null) {
            lle = new Llegadas(null, false);
        }
        lle.setVisible(true);
    }//GEN-LAST:event_btnLlegadasActionPerformed

    private void btnVuelosCompanyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosCompanyaActionPerformed
        if (vc == null) {
            vc = new VuelosCompanya(null, false);
        }
        vc.setVisible(true);
    }//GEN-LAST:event_btnVuelosCompanyaActionPerformed

    private void btnRecaudacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecaudacionesActionPerformed
        if (rec == null) {
            rec = new Recaudaciones(null, false);
        }
        rec.setVisible(true);
    }//GEN-LAST:event_btnRecaudacionesActionPerformed

    private void btnVuelosPrevistosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosPrevistosActionPerformed
        if (vp == null) {
            vp = new VuelosPrevistos(null, false);
        }
        vp.setVisible(true);
    }//GEN-LAST:event_btnVuelosPrevistosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAeropuertos;
    private javax.swing.JButton btnLlegadas;
    private javax.swing.JButton btnRecaudaciones;
    private javax.swing.JButton btnSalidas;
    private javax.swing.JButton btnVuelosCompanya;
    private javax.swing.JButton btnVuelosPrevistos;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
