/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.vuelosbase;

import com.mateofr.tareaevaluacion.logicanegocio.Logica;

/**
 *
 * @author Mateo
 */
public class GestorVuelosBase extends javax.swing.JDialog {
    private final Logica logica = new Logica();
    private static AltaVuelosBase avb;
    private static BajaVuelosBase bvb;
    private static ModificarVuelosBase mvb;
    private static ConsultaVuelosBase cvb;


    public GestorVuelosBase(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logica.ponLaAyudaDialog(itmAyuda, "gestor_vuelosbase",this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAltaVueloBase = new javax.swing.JButton();
        btnModVueloBase = new javax.swing.JButton();
        btnConsultaVueloBase = new javax.swing.JButton();
        btnBajaVueloBase = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTOR DE VUELOS BASE");

        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        btnAltaVueloBase.setBackground(new java.awt.Color(102, 204, 255));
        btnAltaVueloBase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAltaVueloBase.setText("ALTA DE VUELOS BASE");
        btnAltaVueloBase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAltaVueloBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaVueloBaseActionPerformed(evt);
            }
        });

        btnModVueloBase.setBackground(new java.awt.Color(102, 204, 255));
        btnModVueloBase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModVueloBase.setText("MODIFICACIÓN DE VUELOS BASE");
        btnModVueloBase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModVueloBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModVueloBaseActionPerformed(evt);
            }
        });

        btnConsultaVueloBase.setBackground(new java.awt.Color(102, 204, 255));
        btnConsultaVueloBase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultaVueloBase.setText("CONSULTA DE VUELOS BASE");
        btnConsultaVueloBase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultaVueloBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaVueloBaseActionPerformed(evt);
            }
        });

        btnBajaVueloBase.setBackground(new java.awt.Color(102, 204, 255));
        btnBajaVueloBase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBajaVueloBase.setText("BAJA DE VUELOS BASE");
        btnBajaVueloBase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBajaVueloBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaVueloBaseActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAltaVueloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultaVueloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModVueloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBajaVueloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAltaVueloBase, btnBajaVueloBase, btnConsultaVueloBase, btnModVueloBase});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltaVueloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBajaVueloBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModVueloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaVueloBase, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAltaVueloBase, btnBajaVueloBase, btnConsultaVueloBase, btnModVueloBase});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaVueloBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaVueloBaseActionPerformed
           if (avb == null){
        avb = new AltaVuelosBase();}
           avb.setVisible(true);
           avb.actualizarComboBox();
    }//GEN-LAST:event_btnAltaVueloBaseActionPerformed

    private void btnModVueloBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModVueloBaseActionPerformed
         if (mvb == null){
        mvb = new ModificarVuelosBase(null,false);}
           mvb.setVisible(true);
           mvb.actualizarComboBox();
    }//GEN-LAST:event_btnModVueloBaseActionPerformed

    private void btnConsultaVueloBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaVueloBaseActionPerformed
             if (cvb == null){
        cvb = new ConsultaVuelosBase(null, false);}
             cvb.setVisible(true);
             cvb.actualizarComboBox();
    }//GEN-LAST:event_btnConsultaVueloBaseActionPerformed

    private void btnBajaVueloBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaVueloBaseActionPerformed
          if (bvb == null ){
        bvb = new BajaVuelosBase(null,false);}
            bvb.setVisible(true);
            bvb.actualizarComboBox();
    }//GEN-LAST:event_btnBajaVueloBaseActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaVueloBase;
    private javax.swing.JButton btnBajaVueloBase;
    private javax.swing.JButton btnConsultaVueloBase;
    private javax.swing.JButton btnModVueloBase;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
