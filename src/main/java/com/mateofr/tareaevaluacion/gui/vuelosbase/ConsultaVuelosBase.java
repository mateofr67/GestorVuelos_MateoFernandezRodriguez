/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.vuelosbase;

import com.mateofr.tareaevaluacion.datos.Aeropuerto;
import com.mateofr.tareaevaluacion.datos.VueloBase;
import com.mateofr.tareaevaluacion.gui.tablemodel.VuelosBaseTableModel;
import com.mateofr.tareaevaluacion.logicanegocio.Logica;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Mateo
 */
public class ConsultaVuelosBase extends javax.swing.JDialog {

    private final Logica logica = new Logica();

    String apikey = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtYXRlb2NvcjEyMEBnbWFpbC5jb20iLCJqdGkiOiJhMDk0ODZkYi0wZDBjLTRkMzQtYmM0Ni0zNWFhYjJiZDUxNjciLCJpc3MiOiJBRU1FVCIsImlhdCI6MTcwNDIyNjE4NCwidXNlcklkIjoiYTA5NDg2ZGItMGQwYy00ZDM0LWJjNDYtMzVhYWIyYmQ1MTY3Iiwicm9sZSI6IiJ9.Rc0Si2PLMZnwd7yUtzw5HB_MwRW2TOZHh37UKKdmMVg";

    public ConsultaVuelosBase(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        logica.ponLaAyudaDialog(itmAyuda, "consulta_vuelosbase", this);

        Logica.cargarCodigoVueloBase(cbFiltroCodigoVuelo);
        tblVuelosBase.setModel(new VuelosBaseTableModel(Logica.leerVuelosBaseDesdeCSV("./csv/VuelosBase.csv")));
    }

        public void actualizarComboBox(){
            Logica.cargarCodigoVueloBase(cbFiltroCodigoVuelo);
            tblVuelosBase.setModel(new VuelosBaseTableModel(Logica.leerVuelosBaseDesdeCSV("./csv/VuelosBase.csv")));
     }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVuelosBase = new javax.swing.JTable();
        cbFiltroCodigoVuelo = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        btnFiltrarVuelo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblMinimaOrigen = new javax.swing.JLabel();
        lblMaximaOrigen = new javax.swing.JLabel();
        lblmunicipioOrigen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMaximaDestino = new javax.swing.JLabel();
        lblMinimaDestino = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblmunicipioDestino = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Consulta de Vuelos Base");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1129, 50));

        tblVuelosBase.setModel(new javax.swing.table.DefaultTableModel(
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
        tblVuelosBase.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblVuelosBase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblVuelosBase.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblVuelosBase);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 900, 474));

        cbFiltroCodigoVuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbFiltroCodigoVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroCodigoVueloActionPerformed(evt);
            }
        });
        getContentPane().add(cbFiltroCodigoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 137, -1));

        jTextField2.setText("Filtrar por Código:");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, -1, -1));

        btnFiltrarVuelo.setText("FILTRAR");
        btnFiltrarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarVueloActionPerformed(evt);
            }
        });
        getContentPane().add(btnFiltrarVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, -1, -1));

        jButton2.setText("MOSTRAR TODOS ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, -1, -1));

        lblMinimaOrigen.setText("Temperatura Mínima:");

        lblMaximaOrigen.setText("Temperatura Máxima:");

        lblmunicipioOrigen.setText("Municipio:");

        jLabel1.setText("AEROPUERTO ORIGEN");

        lblMaximaDestino.setText("Temperatura Máxima:");

        lblMinimaDestino.setText("Temperatura Mínima:");

        jLabel2.setText("AEROPUERTO DESTINO");

        lblmunicipioDestino.setText("Municipio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmunicipioDestino)
                    .addComponent(lblMinimaDestino)
                    .addComponent(lblMaximaDestino)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMaximaDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMinimaDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmunicipioDestino)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1))
                    .addComponent(lblMinimaOrigen)
                    .addComponent(lblmunicipioOrigen)
                    .addComponent(lblMaximaOrigen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMaximaOrigen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMinimaOrigen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmunicipioOrigen)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, -1, -1));

        jMenu1.setText("Ayuda");

        itmAyuda.setText("Mostrar Ayuda");
        jMenu1.add(itmAyuda);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarVueloActionPerformed

        tblVuelosBase.setModel(new VuelosBaseTableModel(Logica.FiltrarVuelosBaseporCodigo(cbFiltroCodigoVuelo.getSelectedItem().toString())));
        try {
            String municipioOrigen = SacarMunicipioOrigen(cbFiltroCodigoVuelo);
            String municipioDestino = SacarMunicipioDestino(cbFiltroCodigoVuelo);
            if (municipioOrigen != null || "".equals(municipioOrigen)
                    || municipioDestino != null || "".equals(municipioDestino)) {
                obtenerTemperaturaOrigen(municipioOrigen, apikey);
                obtenerTemperaturaDestino(municipioDestino, apikey);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No hay vuelos para filtrar", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFiltrarVueloActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tblVuelosBase.setModel(new VuelosBaseTableModel(Logica.leerVuelosBaseDesdeCSV("./csv/VuelosBase.csv")));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbFiltroCodigoVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroCodigoVueloActionPerformed

    }//GEN-LAST:event_cbFiltroCodigoVueloActionPerformed

    public String get(String url) throws Exception {
        // Crear una conexión HTTP con la URL
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        // Establecer el método como GET
        connection.setRequestMethod("GET");
        // Obtener el flujo de entrada de la conexión
        // No usar GZIPInputStream, ya que la respuesta no está comprimida
        InputStream input = connection.getInputStream();
        // Crear un lector para leer los datos del flujo de entrada
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        // Crear un constructor de cadena para almacenar el resultado
        StringBuilder result = new StringBuilder();
        // Crear una variable para almacenar cada línea leída
        String line;
        // Mientras haya líneas por leer
        while ((line = reader.readLine()) != null) {
            // Añadir la línea al constructor de cadena
            result.append(line);
        }
        // Cerrar el lector
        reader.close();
        // Devolver el resultado como una cadena de texto
        return result.toString();
    }

    public void obtenerTemperaturaOrigen(String codigoMunicipio, String apiKey) {

        if (!codigoMunicipio.equals("0000")) {

            try {
                // Crear la URL de la API de la AEMET con el código del municipio y la clave de acceso
                String url = "https://opendata.aemet.es/opendata/api/prediccion/especifica/municipio/diaria/" + codigoMunicipio + "?api_key=" + apiKey;
                // Hacer una petición GET a la URL y obtener el resultado como una cadena de texto
                String response = get(url);
                // Crear un objeto JSON con la cadena de texto
                JSONObject json = new JSONObject(response);
                // Obtener el valor de la clave "datos", que es otra URL que contiene los datos de la predicción
                String urlDatos = json.getString("datos");
                // Hacer otra petición GET a la nueva URL y obtener el resultado como otra cadena de texto
                String responseDatos = get(urlDatos);
                // Crear otro objeto JSON con la nueva cadena de texto
                JSONObject jsonDatos = new JSONArray(responseDatos).getJSONObject(0);
                // Obtener el valor de la clave "nombre", que es el nombre del municipio
                String nombre = jsonDatos.getString("nombre");
                // Obtener el valor de la clave "prediccion", que es un arreglo JSON que contiene los datos de la predicción por días
                // Obtener el valor de la clave "prediccion", que es otro objeto JSON que contiene los datos de la predicción por días
                JSONObject prediccion = jsonDatos.getJSONObject("prediccion");
                JSONArray dia = prediccion.getJSONArray("dia");
                // Obtener el primer elemento del arreglo JSON, que es otro objeto JSON que contiene los datos de la predicción para el día actual
                JSONObject diaActual = dia.getJSONObject(0);
                // Obtener el valor de la clave "fecha", que es la fecha de la predicción
                String fecha = diaActual.getString("fecha");
                // Obtener el valor de la clave "temperatura", que es otro arreglo JSON que contiene los datos de la temperatura por horas
                JSONObject temperatura = diaActual.getJSONObject("temperatura");
                // Crear dos variables para almacenar la temperatura máxima y mínima
                double maxima = temperatura.getDouble("maxima");
                double minima = temperatura.getDouble("minima");
                lblmunicipioOrigen.setText("Municipio: " + nombre);
                lblMaximaOrigen.setText("Temperatura máxima: " + maxima + " °C");
                lblMinimaOrigen.setText("Temperatura mínima: " + minima + " °C");
            } catch (Exception ex) {
                System.out.println("Se ha producido una excepcion " + ex);
            }
        } else {
            lblmunicipioOrigen.setText("Municipio: No disponible  (Aeropuerto Internacional) ");
            lblMaximaOrigen.setText("Temperatura máxima: No disponible  (Aeropuerto Internacional) ");
            lblMinimaOrigen.setText("Temperatura mínima: No disponible  (Aeropuerto Internacional)");
        }

    }

    public void obtenerTemperaturaDestino(String codigoMunicipio, String apiKey) {

        if (!codigoMunicipio.equals("0000")) {

            try {
                // Crear la URL de la API de la AEMET con el código del municipio y la clave de acceso
                String url = "https://opendata.aemet.es/opendata/api/prediccion/especifica/municipio/diaria/" + codigoMunicipio + "?api_key=" + apiKey;
                // Hacer una petición GET a la URL y obtener el resultado como una cadena de texto
                String response = get(url);
                // Crear un objeto JSON con la cadena de texto
                JSONObject json = new JSONObject(response);
                // Obtener el valor de la clave "datos", que es otra URL que contiene los datos de la predicción
                String urlDatos = json.getString("datos");
                // Hacer otra petición GET a la nueva URL y obtener el resultado como otra cadena de texto
                String responseDatos = get(urlDatos);
                // Crear otro objeto JSON con la nueva cadena de texto
                JSONObject jsonDatos = new JSONArray(responseDatos).getJSONObject(0);
                // Obtener el valor de la clave "nombre", que es el nombre del municipio
                String nombre = jsonDatos.getString("nombre");
                // Obtener el valor de la clave "prediccion", que es un arreglo JSON que contiene los datos de la predicción por días
                // Obtener el valor de la clave "prediccion", que es otro objeto JSON que contiene los datos de la predicción por días
                JSONObject prediccion = jsonDatos.getJSONObject("prediccion");
                JSONArray dia = prediccion.getJSONArray("dia");
                // Obtener el primer elemento del arreglo JSON, que es otro objeto JSON que contiene los datos de la predicción para el día actual
                JSONObject diaActual = dia.getJSONObject(0);
                // Obtener el valor de la clave "fecha", que es la fecha de la predicción
                String fecha = diaActual.getString("fecha");
                // Obtener el valor de la clave "temperatura", que es otro arreglo JSON que contiene los datos de la temperatura por horas
                JSONObject temperatura = diaActual.getJSONObject("temperatura");
                // Crear dos variables para almacenar la temperatura máxima y mínima
                double maxima = temperatura.getDouble("maxima");
                double minima = temperatura.getDouble("minima");
                lblmunicipioDestino.setText("Municipio: " + nombre);
                lblMaximaDestino.setText("Temperatura máxima: " + maxima + " °C");
                lblMinimaDestino.setText("Temperatura mínima: " + minima + " °C");
            } catch (Exception ex) {
                Logger.getLogger(ConsultaVuelosBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lblmunicipioDestino.setText("Municipio: No disponible  (Aeropuerto Internacional) ");
            lblMaximaDestino.setText("Temperatura máxima: No disponible  (Aeropuerto Internacional) ");
            lblMinimaDestino.setText("Temperatura mínima: No disponible  (Aeropuerto Internacional)");
        }

    }

    public static String SacarMunicipioOrigen(JComboBox j) {
        String rutaArchivoVuelosBase = "./csv/VuelosBase.csv";
        String rutaAeropuertos = "./csv/Aeropuertos.csv";

        // Obtener el aeropuerto seleccionado del JComboBox
        String codigoVuelo = (String) j.getSelectedItem();

        if (codigoVuelo != null) {
            // Leer la lista de vuelos base desde el archivo CSV
            List<VueloBase> vuelosBase = Logica.leerVuelosBaseDesdeCSV(rutaArchivoVuelosBase);

            // Filtrar los vuelos base que tienen el mismo código de vuelo que el seleccionado
            Optional<String> aeropuertoOrigenOptional = vuelosBase.stream()
                    .filter(vuelo -> vuelo.getCodigoVuelo().equals(codigoVuelo))
                    .map(VueloBase::getAeropuertoOrigen)
                    .findFirst();

            // Obtener el nombre del aeropuerto de origen
            String aeroOrigen = aeropuertoOrigenOptional.orElse("");

            // Leer la lista de aeropuertos desde el archivo CSV
            List<Aeropuerto> aeropuertos = Logica.leerAeropuertosDesdeCSV(rutaAeropuertos);

            // Filtrar los aeropuertos que tienen el mismo nombre que el aeropuerto de origen
            Optional<String> codMunicipioOptional = aeropuertos.stream()
                    .filter(aeropuerto -> aeropuerto.getNombre().equals(aeroOrigen))
                    .map(Aeropuerto::getCodigoMunicipio)
                    .findFirst();

            // Obtener el código de municipio
            return codMunicipioOptional.orElse("");
        }

        // Manejar el caso en el que no hay aeropuerto seleccionado
        // Puedes devolver un valor predeterminado o lanzar una excepción según tus necesidades.
        return "";
    }

    public static String SacarMunicipioDestino(JComboBox j) {
        String rutaArchivoVuelosBase = "./csv/VuelosBase.csv";
        String rutaAeropuertos = "./csv/Aeropuertos.csv";

        // Obtener el aeropuerto seleccionado del JComboBox
        String codigoVuelo = (String) j.getSelectedItem();

        if (codigoVuelo != null) {
            // Leer la lista de vuelos base desde el archivo CSV
            List<VueloBase> vuelosBase = Logica.leerVuelosBaseDesdeCSV(rutaArchivoVuelosBase);

            // Filtrar los vuelos base que tienen el mismo código de vuelo que el seleccionado
            Optional<String> aeropuertoDestinoOptional = vuelosBase.stream()
                    .filter(vuelo -> vuelo.getCodigoVuelo().equals(codigoVuelo))
                    .map(VueloBase::getAeropuertoDestino)
                    .findFirst();

            // Obtener el nombre del aeropuerto de origen
            String aeroDestino = aeropuertoDestinoOptional.orElse("");

            // Leer la lista de aeropuertos desde el archivo CSV
            List<Aeropuerto> aeropuertos = Logica.leerAeropuertosDesdeCSV(rutaAeropuertos);

            // Filtrar los aeropuertos que tienen el mismo nombre que el aeropuerto de origen
            Optional<String> codMunicipioOptional = aeropuertos.stream()
                    .filter(aeropuerto -> aeropuerto.getNombre().equals(aeroDestino))
                    .map(Aeropuerto::getCodigoMunicipio)
                    .findFirst();

            // Obtener el código de municipio
            return codMunicipioOptional.orElse("");
        }

        // Manejar el caso en el que no hay aeropuerto seleccionado
        // Puedes devolver un valor predeterminado o lanzar una excepción según tus necesidades.
        return "";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrarVuelo;
    private javax.swing.JComboBox<String> cbFiltroCodigoVuelo;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblMaximaDestino;
    private javax.swing.JLabel lblMaximaOrigen;
    private javax.swing.JLabel lblMinimaDestino;
    private javax.swing.JLabel lblMinimaOrigen;
    private javax.swing.JLabel lblmunicipioDestino;
    private javax.swing.JLabel lblmunicipioOrigen;
    private javax.swing.JTable tblVuelosBase;
    // End of variables declaration//GEN-END:variables
}
