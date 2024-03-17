/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.companyas;

import com.mateofr.tareaevaluacion.gui.validadores.Validacion;
import com.mateofr.tareaevaluacion.logicanegocio.Logica;
import javax.swing.JOptionPane;

/**
 *
 * @author mateofr
 */
public class BajaCompanyas extends javax.swing.JDialog {
private final Logica logica = new Logica();

    /**
     * Creates new form BajaCompanyas
     * @param parent
     * @param modal
     */
    public BajaCompanyas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Logica.cargarPrefijoCompanyas(cbPrefijoCompanyaBaja);
        logica.ponLaAyudaDialog(itmAyuda, "baja_companyas",this);
    }

    
        public void actualizarComboBox() {
  Logica.cargarPrefijoCompanyas(cbPrefijoCompanyaBaja);
}
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBajaCompanya = new javax.swing.JButton();
        cbPrefijoCompanyaBaja = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Baja de compañías");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 470, 79));

        jLabel1.setText("Prefijo de la compañía a eliminar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btnBajaCompanya.setText("BAJA");
        btnBajaCompanya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaCompanyaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBajaCompanya, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 90, 30));

        cbPrefijoCompanyaBaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbPrefijoCompanyaBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 90, 30));

        jMenu1.setText("Ayuda");

        itmAyuda.setText("Mostrar Ayuda");
        jMenu1.add(itmAyuda);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBajaCompanyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaCompanyaActionPerformed
       
        try{
            
        
        if(Validacion.validarFormularioBajaCompanya(cbPrefijoCompanyaBaja.getSelectedItem().toString())){
              Logica.eliminarCompanya(cbPrefijoCompanyaBaja.getSelectedItem().toString());
              Logica.cargarPrefijoCompanyas(cbPrefijoCompanyaBaja);
        }
        }catch(NullPointerException ex){
        JOptionPane.showMessageDialog(null, "No existen compañías para borrar", "Error", JOptionPane.ERROR_MESSAGE);
         
     }
        
        
     
         
    }//GEN-LAST:event_btnBajaCompanyaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBajaCompanya;
    private javax.swing.JComboBox<String> cbPrefijoCompanyaBaja;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
