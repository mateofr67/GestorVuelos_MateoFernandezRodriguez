/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.vuelosdiarios;

import com.mateofr.tareaevaluacion.logicanegocio.Logica;



/**
 *
 * @author Mateo
 */
public class GestorVuelosDiarios extends javax.swing.JDialog {
    private final Logica logica = new Logica();
   private static AltaVuelosDiarios avd;
    private static BajaVuelosDiarios bvd;
    private static ModificarVuelosDiarios mvd;
    private static ConsultaVuelosDiarios cvd;

    
    
    public GestorVuelosDiarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logica.ponLaAyudaDialog(itmAyuda, "gestor_vuelosdiarios",this);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAltaVueloDiario = new javax.swing.JButton();
        btnModVueloDiario = new javax.swing.JButton();
        btnConsultaVueloDiario = new javax.swing.JButton();
        btnBajaVueloDiario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTOR DE VUELOS DIARIOS");

        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        btnAltaVueloDiario.setBackground(new java.awt.Color(102, 255, 102));
        btnAltaVueloDiario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAltaVueloDiario.setText("ALTA DE VUELOS DIARIOS");
        btnAltaVueloDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAltaVueloDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaVueloDiarioActionPerformed(evt);
            }
        });

        btnModVueloDiario.setBackground(new java.awt.Color(102, 255, 102));
        btnModVueloDiario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModVueloDiario.setText("MODIFICACIÓN DE VUELOS DIARIOS");
        btnModVueloDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModVueloDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModVueloDiarioActionPerformed(evt);
            }
        });

        btnConsultaVueloDiario.setBackground(new java.awt.Color(102, 255, 102));
        btnConsultaVueloDiario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultaVueloDiario.setText("CONSULTA DE VUELOS DIARIOS");
        btnConsultaVueloDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultaVueloDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaVueloDiarioActionPerformed(evt);
            }
        });

        btnBajaVueloDiario.setBackground(new java.awt.Color(102, 255, 102));
        btnBajaVueloDiario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBajaVueloDiario.setText("BAJA DE VUELOS DIARIOS");
        btnBajaVueloDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBajaVueloDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaVueloDiarioActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAltaVueloDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultaVueloDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModVueloDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBajaVueloDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAltaVueloDiario, btnBajaVueloDiario, btnConsultaVueloDiario, btnModVueloDiario});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltaVueloDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBajaVueloDiario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModVueloDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaVueloDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAltaVueloDiario, btnBajaVueloDiario, btnConsultaVueloDiario, btnModVueloDiario});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaVueloDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaVueloDiarioActionPerformed
         if (avd == null){
        avd = new AltaVuelosDiarios(null, false);}
      avd.setVisible(true);
      avd.actualizarComboBox();
    }//GEN-LAST:event_btnAltaVueloDiarioActionPerformed

    private void btnModVueloDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModVueloDiarioActionPerformed
          if (mvd == null){
        mvd = new ModificarVuelosDiarios(null, false);}
    mvd.setVisible(true);
    mvd.actualizarComboBox();
    }//GEN-LAST:event_btnModVueloDiarioActionPerformed

    private void btnConsultaVueloDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaVueloDiarioActionPerformed
        if (cvd == null){
        cvd = new ConsultaVuelosDiarios(null, false);}
       cvd.setVisible(true);
       cvd.actualizarTabla();
    }//GEN-LAST:event_btnConsultaVueloDiarioActionPerformed

    private void btnBajaVueloDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaVueloDiarioActionPerformed
        if (bvd == null){
        bvd = new BajaVuelosDiarios(null, false);}
      bvd.setVisible(true);
      bvd.actualizarComboBox();
    }//GEN-LAST:event_btnBajaVueloDiarioActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaVueloDiario;
    private javax.swing.JButton btnBajaVueloDiario;
    private javax.swing.JButton btnConsultaVueloDiario;
    private javax.swing.JButton btnModVueloDiario;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
