/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.vuelosdiarios;

import com.mateofr.tareaevaluacion.gui.validadores.Validacion;
import com.mateofr.tareaevaluacion.logicanegocio.Logica;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateo
 */
public class BajaVuelosDiarios extends javax.swing.JDialog {

    private final Logica logica = new Logica();

    public BajaVuelosDiarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logica.ponLaAyudaDialog(itmAyuda, "baja_vuelosdiarios", this);
        Logica.cargarPrefijosVuelosDiarios(cbPrefijoVueloBaja);
    }
  
    public void actualizarComboBox(){
             Logica.cargarPrefijosVuelosDiarios(cbPrefijoVueloBaja);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBajaVueloDiario = new javax.swing.JButton();
        cbPrefijoVueloBaja = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Baja de vuelos diarios");

        jLabel1.setText("Prefijo del vuelo a eliminar:");

        btnBajaVueloDiario.setText("BAJA");
        btnBajaVueloDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaVueloDiarioActionPerformed(evt);
            }
        });

        cbPrefijoVueloBaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBajaVueloDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(cbPrefijoVueloBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbPrefijoVueloBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBajaVueloDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBajaVueloDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaVueloDiarioActionPerformed

        try {

            if (Validacion.validarFormularioBajaVuelosDiarios(cbPrefijoVueloBaja.getSelectedItem().toString())) {

                Logica.eliminarVuelosDiarios(cbPrefijoVueloBaja.getSelectedItem().toString());
                Logica.cargarPrefijosVuelosDiarios(cbPrefijoVueloBaja);
            }

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No existen vuelos diarios para borrar", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnBajaVueloDiarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBajaVueloDiario;
    private javax.swing.JComboBox<String> cbPrefijoVueloBaja;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
