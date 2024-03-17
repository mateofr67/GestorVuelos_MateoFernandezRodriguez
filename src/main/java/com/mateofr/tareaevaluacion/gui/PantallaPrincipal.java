/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui;

import com.mateofr.tareaevaluacion.gui.companyas.GestorCompanyas;
import com.mateofr.tareaevaluacion.gui.detallesoperativos.GestorDetallesOperativos;
import com.mateofr.tareaevaluacion.gui.vuelosbase.GestorVuelosBase;
import com.mateofr.tareaevaluacion.gui.vuelosdiarios.GestorVuelosDiarios;
import com.mateofr.tareaevaluacion.logicanegocio.Logica;

import java.io.File;

import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;

/**
 *
 * @author mateofr
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private static GestorCompanyas gc;
    private static GestorVuelosBase gvb;
    private static GestorVuelosDiarios gvd;
    private static GestorDetallesOperativos gdo;

    public PantallaPrincipal() {
        Logica.VuelosDiariosExiste();
        Logica.VuelosBaseExiste();
        Logica.CompanyasExiste();
        initComponents();
        ponLaAyuda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCompanyas = new javax.swing.JButton();
        btnVuelosBase = new javax.swing.JButton();
        btnVuelosDiarios = new javax.swing.JButton();
        btnDetallesOperativos = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        MnuAyuda = new javax.swing.JMenu();
        AyudaItem = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  AeroGestor Pro");

        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        btnCompanyas.setBackground(new java.awt.Color(255, 102, 102));
        btnCompanyas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCompanyas.setText("GESTIÓN DE COMPAÑÍAS");
        btnCompanyas.setFocusable(false);
        btnCompanyas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompanyas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompanyasActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompanyas);

        btnVuelosBase.setBackground(new java.awt.Color(102, 204, 255));
        btnVuelosBase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVuelosBase.setText("GESTIÓN DE VUELOS BASE");
        btnVuelosBase.setFocusable(false);
        btnVuelosBase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVuelosBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosBaseActionPerformed(evt);
            }
        });
        jPanel1.add(btnVuelosBase);

        btnVuelosDiarios.setBackground(new java.awt.Color(153, 255, 102));
        btnVuelosDiarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVuelosDiarios.setText("GESTIÓN DE VUELOS DIARIOS");
        btnVuelosDiarios.setFocusable(false);
        btnVuelosDiarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVuelosDiarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosDiariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVuelosDiarios);

        btnDetallesOperativos.setBackground(new java.awt.Color(255, 255, 102));
        btnDetallesOperativos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDetallesOperativos.setText("DETALLES OPERATIVOS");
        btnDetallesOperativos.setFocusable(false);
        btnDetallesOperativos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDetallesOperativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesOperativosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetallesOperativos);

        MnuAyuda.setText("Ayuda");
        MnuAyuda.setFocusable(false);
        MnuAyuda.setRequestFocusEnabled(false);
        MnuAyuda.setVerifyInputWhenFocusTarget(false);

        AyudaItem.setText("Mostrar ayuda");
        AyudaItem.setRequestFocusEnabled(false);
        AyudaItem.setVerifyInputWhenFocusTarget(false);
        AyudaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaItemActionPerformed(evt);
            }
        });
        MnuAyuda.add(AyudaItem);

        jMenuBar2.add(MnuAyuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                        .addGap(47, 47, 47))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompanyasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompanyasActionPerformed
        if (gc == null) {
            gc = new GestorCompanyas();
        }
        gc.setVisible(true);
    }//GEN-LAST:event_btnCompanyasActionPerformed

    private void btnVuelosBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosBaseActionPerformed
        if (gvb == null) {
            gvb = new GestorVuelosBase(this, false);
        }
        gvb.setVisible(true);
    }//GEN-LAST:event_btnVuelosBaseActionPerformed

    private void btnVuelosDiariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosDiariosActionPerformed
        if (gvd == null) {
            gvd = new GestorVuelosDiarios(this, false);
        }
        gvd.setVisible(true);
    }//GEN-LAST:event_btnVuelosDiariosActionPerformed

    private void btnDetallesOperativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesOperativosActionPerformed
        if (gdo == null) {
            gdo = new GestorDetallesOperativos(this, false);
        }
        gdo.setVisible(true);
    }//GEN-LAST:event_btnDetallesOperativosActionPerformed

    private void AyudaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AyudaItemActionPerformed
    private void ponLaAyuda() {
        try {
            File fichero = new File("help" + File.separator + "help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            hb.enableHelpOnButton(AyudaItem, "pantalla_principal", helpset);

            hb.enableHelpKey(this.getRootPane(), "pantalla_principal", helpset);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AyudaItem;
    private javax.swing.JMenu MnuAyuda;
    private javax.swing.JButton btnCompanyas;
    private javax.swing.JButton btnDetallesOperativos;
    private javax.swing.JButton btnVuelosBase;
    private javax.swing.JButton btnVuelosDiarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
