/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.companyas;

import com.mateofr.tareaevaluacion.gui.validadores.Validacion;
import com.mateofr.tareaevaluacion.logicanegocio.Logica;

/**
 *
 * @author mateofr
 */
public class AltaCompanyas extends javax.swing.JFrame {
    private final Logica logica = new Logica();
    public AltaCompanyas() {
 
        initComponents();
        logica.ponLaAyudaFrame(itmAyuda, "alta_companyas",this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigoCompanya = new javax.swing.JTextField();
        txtNombreCompanya = new javax.swing.JTextField();
        txtDireccionCompanya = new javax.swing.JTextField();
        txtMunicipioCompanya = new javax.swing.JTextField();
        txtTel_InfoPasajeros = new javax.swing.JTextField();
        txtTel_InfoAeropuertos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAltaCompanya = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alta de compañías");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 30, 520, 50));
        getContentPane().add(txtCodigoCompanya, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 104, 24));
        getContentPane().add(txtNombreCompanya, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 104, 27));
        getContentPane().add(txtDireccionCompanya, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 104, 26));
        getContentPane().add(txtMunicipioCompanya, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 104, 27));
        getContentPane().add(txtTel_InfoPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 104, 25));
        getContentPane().add(txtTel_InfoAeropuertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 104, 26));

        jLabel2.setText("Código de Compañía:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 252, 20));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 252, 20));

        jLabel4.setText("Dirección:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 252, 20));

        jLabel5.setText("Municipio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 252, 20));

        jLabel6.setText("Teléfono de información al pasajero:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 332, 20));

        jLabel7.setText("Teléfono de información a aeropuertos:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 457, 25));

        btnAltaCompanya.setText("ALTA");
        btnAltaCompanya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaCompanyaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAltaCompanya, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 100, 40));

        jMenu1.setText("Ayuda");

        itmAyuda.setText("Mostrar Ayuda");
        jMenu1.add(itmAyuda);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaCompanyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaCompanyaActionPerformed
        int prefijo = logica.CalcularPrefijoCompanya();
        if (Validacion.validarFormularioAltaCompanya(prefijo, txtCodigoCompanya.getText(),
                txtNombreCompanya.getText(), txtDireccionCompanya.getText(), txtMunicipioCompanya.getText(),
                txtTel_InfoPasajeros.getText(), txtTel_InfoAeropuertos.getText())) {

            String prefijoCadena = prefijo + "";

            Logica.agregarNuevaCompania(prefijoCadena, txtCodigoCompanya.getText(),
                    txtNombreCompanya.getText(), txtDireccionCompanya.getText(), txtMunicipioCompanya.getText(),
                    txtTel_InfoPasajeros.getText(), txtTel_InfoAeropuertos.getText());
        }
    }//GEN-LAST:event_btnAltaCompanyaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaCompanya;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtCodigoCompanya;
    private javax.swing.JTextField txtDireccionCompanya;
    private javax.swing.JTextField txtMunicipioCompanya;
    private javax.swing.JTextField txtNombreCompanya;
    private javax.swing.JTextField txtTel_InfoAeropuertos;
    private javax.swing.JTextField txtTel_InfoPasajeros;
    // End of variables declaration//GEN-END:variables

}
