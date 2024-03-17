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
public class ModificarVuelosDiarios extends javax.swing.JDialog {
    private final Logica logica = new Logica();
    Calendar fecha_actual = new GregorianCalendar();

    public ModificarVuelosDiarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logica.ponLaAyudaDialog(itmAyuda, "modificacion_vuelosdiarios",this);
         jdateFechaVuelo.setCalendar(fecha_actual);
        Logica.cargarPrefijosVuelosDiarios(comboBoxPrefijoVueloBaja);
        Logica.cargarCodigoVueloBase(comboBoxCodigoVuelo);
        
    }
    
        public void actualizarComboBox(){
        Logica.cargarCodigoVueloBase(comboBoxCodigoVuelo);
        Logica.cargarPrefijosVuelosDiarios(comboBoxPrefijoVueloBaja);
     }

      private void actualizarRetrasoLlegada() {
        // Obtener los valores seleccionados
        String codigoVuelo = comboBoxCodigoVuelo.getSelectedItem().toString();
        String horasString = (String) comboBoxHorasLlegadaReal.getSelectedItem();
        String minutosString = (String) comboBoxMinutosLlegadaReal.getSelectedItem();

// Convertir las cadenas a enteros
        int horas = Integer.parseInt(horasString);
        int minutos = Integer.parseInt(minutosString);
        // Calcular retraso
        LocalTime horaPrevista = Logica.obtenerHoraLlegadaBase(codigoVuelo);
        LocalTime horaReal = LocalTime.of(horas, minutos);

        String retraso = Logica.calcularRetraso(horaPrevista, horaReal);

        // Actualizar la etiqueta de resultado
        lblRetrasoLlegada.setText("Retraso: " + retraso);
    }

    private void actualizarRetrasoSalida() {
        // Obtener los valores seleccionados
        String codigoVuelo = comboBoxCodigoVuelo.getSelectedItem().toString();
        String horasString = (String) comboBoxHorasSalidaReal.getSelectedItem();
        String minutosString = (String) comboBoxMinutosSalidaReal.getSelectedItem();

// Convertir las cadenas a enteros
        int horas = Integer.parseInt(horasString);
        int minutos = Integer.parseInt(minutosString);
        // Calcular retraso
        LocalTime horaPrevista = Logica.obtenerHoraSalidaBase(codigoVuelo);
        LocalTime horaReal = LocalTime.of(horas, minutos);

        String retraso = Logica.calcularRetraso(horaPrevista, horaReal);

        // Actualizar la etiqueta de resultado
        lblRetrasoSalida.setText("Retraso: " + retraso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnModVueloDiario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblRetrasoSalida = new javax.swing.JLabel();
        lblRetrasoLlegada = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboBoxPrefijoVueloBaja = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificación de Vuelos Diarios");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hora de Salida Real:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 132, -1));

        jLabel6.setText("Precio de Vuelo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 22));

        comboBoxMinutosLlegadaReal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        comboBoxMinutosLlegadaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMinutosLlegadaRealActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxMinutosLlegadaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 128, -1));
        jPanel1.add(txtPrecioVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 120, -1));

        comboBoxHorasLlegadaReal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        comboBoxHorasLlegadaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHorasLlegadaRealActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxHorasLlegadaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 121, -1));

        jdateFechaVuelo.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(jdateFechaVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 110, -1));

        jLabel9.setText("Nº Plazas Ocupadas:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));
        jPanel1.add(txtPlazasOcupadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 120, -1));

        comboBoxCodigoVuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxCodigoVuelo.setVerifyInputWhenFocusTarget(false);
        comboBoxCodigoVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCodigoVueloActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxCodigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 110, -1));

        jLabel2.setText("Código de Vuelo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel4.setText("Hora de Llegada Real:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel3.setText("Fecha de Vuelo: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 22));

        comboBoxHorasSalidaReal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        comboBoxHorasSalidaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHorasSalidaRealActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxHorasSalidaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 121, -1));

        comboBoxMinutosSalidaReal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        comboBoxMinutosSalidaReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMinutosSalidaRealActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxMinutosSalidaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 128, -1));

        btnModVueloDiario.setText("MODIFICAR");
        btnModVueloDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModVueloDiarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnModVueloDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, 29));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setText("Formato: dd/MM/yyyy");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        lblRetrasoSalida.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblRetrasoSalida.setText("Retraso");
        jPanel1.add(lblRetrasoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 160, -1));

        lblRetrasoLlegada.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblRetrasoLlegada.setText("Retraso");
        jPanel1.add(lblRetrasoLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 140, -1));

        jLabel11.setText("Plazas");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jLabel8.setText("Prefijo del Vuelo a Modificar:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        comboBoxPrefijoVueloBaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBoxPrefijoVueloBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 110, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setText("DATOS A ACTUALIZAR:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

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
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxMinutosLlegadaRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMinutosLlegadaRealActionPerformed
        actualizarRetrasoLlegada();
    }//GEN-LAST:event_comboBoxMinutosLlegadaRealActionPerformed

    private void comboBoxHorasLlegadaRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHorasLlegadaRealActionPerformed
        actualizarRetrasoLlegada();
    }//GEN-LAST:event_comboBoxHorasLlegadaRealActionPerformed

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

    private void btnModVueloDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModVueloDiarioActionPerformed
        Date fechaDate = jdateFechaVuelo.getDate();
       

        String diaSemanaVuelo = Logica.obtenerLetraDiaSemana(fechaDate);

        String fecha = logica.obtenerFechaComoString(fechaDate);
        String horaSalida = Logica.formatearHora(comboBoxHorasSalidaReal, comboBoxMinutosSalidaReal);
        String horaLlegada = Logica.formatearHora(comboBoxHorasLlegadaReal, comboBoxMinutosLlegadaReal);
        String plazasOcupadas = txtPlazasOcupadas.getText();
        String precio = txtPrecioVuelo.getText();
    
        try {
                String prefijoSt = comboBoxPrefijoVueloBaja.getSelectedItem().toString();
            String codigoVuelo = comboBoxCodigoVuelo.getSelectedItem().toString();
         
            if (Validacion.validarFormularioModificacionVuelosDiarios(codigoVuelo, fecha, diaSemanaVuelo, horaSalida, horaLlegada, plazasOcupadas, precio)){
            
            Logica.modificarVueloDiario(prefijoSt, codigoVuelo, fecha, horaSalida, horaLlegada, plazasOcupadas, precio);}
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "No existen Vuelos Diarios para modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModVueloDiarioActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModVueloDiario;
    private javax.swing.JComboBox<String> comboBoxCodigoVuelo;
    private javax.swing.JComboBox<String> comboBoxHorasLlegadaReal;
    private javax.swing.JComboBox<String> comboBoxHorasSalidaReal;
    private javax.swing.JComboBox<String> comboBoxMinutosLlegadaReal;
    private javax.swing.JComboBox<String> comboBoxMinutosSalidaReal;
    private javax.swing.JComboBox<String> comboBoxPrefijoVueloBaja;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdateFechaVuelo;
    private javax.swing.JLabel lblRetrasoLlegada;
    private javax.swing.JLabel lblRetrasoSalida;
    private javax.swing.JTextField txtPlazasOcupadas;
    private javax.swing.JTextField txtPrecioVuelo;
    // End of variables declaration//GEN-END:variables
}
