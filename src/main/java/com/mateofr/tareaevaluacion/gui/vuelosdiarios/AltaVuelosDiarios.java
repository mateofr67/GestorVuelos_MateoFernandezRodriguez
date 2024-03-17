/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.vuelosdiarios;

import com.mateofr.tareaevaluacion.gui.validadores.Validacion;
import com.mateofr.tareaevaluacion.logicanegocio.Logica;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateo
 */
public class AltaVuelosDiarios extends javax.swing.JDialog {

    private final Logica logica = new Logica();
    Calendar fecha_actual = new GregorianCalendar();

    public AltaVuelosDiarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logica.ponLaAyudaDialog(itmAyuda, "alta_vuelosdiarios", this);
        jdateFechaVuelo.setCalendar(fecha_actual);
        Logica.cargarCodigoVueloBase(comboBoxCodigoVuelo);

    }
    
        public void actualizarComboBox(){
        Logica.cargarCodigoVueloBase(comboBoxCodigoVuelo);
     }
    

    private void actualizarRetrasoLlegada() {
        String codigoVuelo = comboBoxCodigoVuelo.getSelectedItem().toString();
        String horasString = (String) comboBoxHorasLlegadaReal.getSelectedItem();
        String minutosString = (String) comboBoxMinutosLlegadaReal.getSelectedItem();

        int horas = Integer.parseInt(horasString);
        int minutos = Integer.parseInt(minutosString);

        LocalTime horaPrevista = Logica.obtenerHoraLlegadaBase(codigoVuelo);
        LocalTime horaReal = LocalTime.of(horas, minutos);
        String retraso = Logica.calcularRetraso(horaPrevista, horaReal);
        lblRetrasoLlegada.setText("Retraso: " + retraso);
    }

    private void actualizarRetrasoSalida() {

        String codigoVuelo = comboBoxCodigoVuelo.getSelectedItem().toString();
        String horasString = (String) comboBoxHorasSalidaReal.getSelectedItem();
        String minutosString = (String) comboBoxMinutosSalidaReal.getSelectedItem();

        int horas = Integer.parseInt(horasString);
        int minutos = Integer.parseInt(minutosString);

        LocalTime horaPrevista = Logica.obtenerHoraSalidaBase(codigoVuelo);
        LocalTime horaReal = LocalTime.of(horas, minutos);

        String retraso = Logica.calcularRetraso(horaPrevista, horaReal);

        lblRetrasoSalida.setText("Retraso: " + retraso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxMinutosLlegadaReal = new javax.swing.JComboBox<>();
        txtPrecioVuelo = new javax.swing.JTextField();
        comboBoxHorasLlegadaReal = new javax.swing.JComboBox<>();
        jdateFechaVuelo = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtPlazasOcupadas = new javax.swing.JTextField();
        comboBoxCodigoVuelo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxHorasSalidaReal = new javax.swing.JComboBox<>();
        comboBoxMinutosSalidaReal = new javax.swing.JComboBox<>();
        btnAltaVueloDiario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblRetrasoSalida = new javax.swing.JLabel();
        lblRetrasoLlegada = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alta de Vuelos Diarios");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hora de Salida Real:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 77, 132, -1));

        jLabel6.setText("Precio de Vuelo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 22));

        comboBoxMinutosLlegadaReal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        comboBoxMinutosLlegadaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMinutosLlegadaRealActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxMinutosLlegadaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 110, 128, -1));
        jPanel1.add(txtPrecioVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 180, 120, -1));

        comboBoxHorasLlegadaReal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        comboBoxHorasLlegadaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHorasLlegadaRealActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxHorasLlegadaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 110, 121, -1));

        jdateFechaVuelo.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(jdateFechaVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, -1));

        jLabel9.setText("Nº Plazas Ocupadas:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 150, -1, -1));
        jPanel1.add(txtPlazasOcupadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 150, 120, -1));

        comboBoxCodigoVuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxCodigoVuelo.setVerifyInputWhenFocusTarget(false);
        comboBoxCodigoVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCodigoVueloActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxCodigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 110, -1));

        jLabel2.setText("Código de Vuelo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, -1, -1));

        jLabel4.setText("Hora de Llegada Real:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 110, -1, -1));

        jLabel3.setText("Fecha de Vuelo: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 22));

        comboBoxHorasSalidaReal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        comboBoxHorasSalidaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHorasSalidaRealActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxHorasSalidaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 74, 121, -1));

        comboBoxMinutosSalidaReal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        comboBoxMinutosSalidaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMinutosSalidaRealActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxMinutosSalidaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 74, 128, -1));

        btnAltaVueloDiario.setText("ALTA");
        btnAltaVueloDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaVueloDiarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnAltaVueloDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, 29));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setText("Formato: dd/MM/yyyy");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        lblRetrasoSalida.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jPanel1.add(lblRetrasoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 160, -1));

        lblRetrasoLlegada.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jPanel1.add(lblRetrasoLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 240, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaVueloDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaVueloDiarioActionPerformed

        int prefijo = logica.CalcularPrefijoVueloDiario();

        String horaSalida = Logica.formatearHora(comboBoxHorasSalidaReal, comboBoxMinutosSalidaReal);
        String horaLlegada = Logica.formatearHora(comboBoxHorasLlegadaReal, comboBoxMinutosLlegadaReal);
        String plazasOcupadas = txtPlazasOcupadas.getText();
        String precio = txtPrecioVuelo.getText();
        String prefijoSt = "" + prefijo;
        try {
            Date fechaDate = jdateFechaVuelo.getDate();
            String diaSemanaVuelo = Logica.obtenerLetraDiaSemana(fechaDate);

            String fecha = logica.obtenerFechaComoString(fechaDate);
            Logica.combinarFechaYHora(fecha, horaSalida);
            String codigoVuelo = comboBoxCodigoVuelo.getSelectedItem().toString();
            if (Validacion.validarFormularioAltaVuelosDiarios(codigoVuelo, fecha, diaSemanaVuelo, horaSalida, horaLlegada, plazasOcupadas, precio)) {
                Logica.agregarNuevoVueloDiario(prefijoSt, codigoVuelo, fecha, horaSalida, horaLlegada, plazasOcupadas, precio);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No existen Vuelos Base para el código de vuelo", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAltaVueloDiarioActionPerformed

    private void comboBoxCodigoVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCodigoVueloActionPerformed
        if (comboBoxCodigoVuelo.getItemCount() > 0) {
            int plazasTotales = Logica.ObtenerPlazasTotales(comboBoxCodigoVuelo.getSelectedItem().toString());
            jLabel11.setText("Plazas totales: " + plazasTotales);

            actualizarRetrasoSalida();
            actualizarRetrasoLlegada();
            LocalTime horaLlegadaBase = Logica.obtenerHoraLlegadaBase(comboBoxCodigoVuelo.getSelectedItem().toString());
            String formatoHoraLlegada = horaLlegadaBase.format(DateTimeFormatter.ofPattern("HH:mm"));

            int horasLlegadaBase = Integer.parseInt(formatoHoraLlegada.substring(0, 2));

            comboBoxHorasLlegadaReal.setSelectedIndex(horasLlegadaBase);

            int minutosLlegadaBase = Integer.parseInt(formatoHoraLlegada.substring(3, 5));

            comboBoxMinutosLlegadaReal.setSelectedIndex(minutosLlegadaBase);

            LocalTime horaSalidaBase = Logica.obtenerHoraSalidaBase(comboBoxCodigoVuelo.getSelectedItem().toString());
            String formatoHoraSalida = horaSalidaBase.format(DateTimeFormatter.ofPattern("HH:mm"));

            int horasSalidaBase = Integer.parseInt(formatoHoraSalida.substring(0, 2));

            comboBoxHorasSalidaReal.setSelectedIndex(horasSalidaBase);

            int minutosSalidaBase = Integer.parseInt(formatoHoraSalida.substring(3, 5));

            comboBoxMinutosSalidaReal.setSelectedIndex(minutosSalidaBase);

        }
    }//GEN-LAST:event_comboBoxCodigoVueloActionPerformed

    private void comboBoxHorasSalidaRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHorasSalidaRealActionPerformed
        actualizarRetrasoSalida();
    }//GEN-LAST:event_comboBoxHorasSalidaRealActionPerformed

    private void comboBoxMinutosSalidaRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMinutosSalidaRealActionPerformed
        actualizarRetrasoSalida();
    }//GEN-LAST:event_comboBoxMinutosSalidaRealActionPerformed

    private void comboBoxHorasLlegadaRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHorasLlegadaRealActionPerformed
        actualizarRetrasoLlegada();
    }//GEN-LAST:event_comboBoxHorasLlegadaRealActionPerformed

    private void comboBoxMinutosLlegadaRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMinutosLlegadaRealActionPerformed
        actualizarRetrasoLlegada();
    }//GEN-LAST:event_comboBoxMinutosLlegadaRealActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaVueloDiario;
    private javax.swing.JComboBox<String> comboBoxCodigoVuelo;
    private javax.swing.JComboBox<String> comboBoxHorasLlegadaReal;
    private javax.swing.JComboBox<String> comboBoxHorasSalidaReal;
    private javax.swing.JComboBox<String> comboBoxMinutosLlegadaReal;
    private javax.swing.JComboBox<String> comboBoxMinutosSalidaReal;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdateFechaVuelo;
    private javax.swing.JLabel lblRetrasoLlegada;
    private javax.swing.JLabel lblRetrasoSalida;
    private javax.swing.JTextField txtPlazasOcupadas;
    private javax.swing.JTextField txtPrecioVuelo;
    // End of variables declaration//GEN-END:variables

}
