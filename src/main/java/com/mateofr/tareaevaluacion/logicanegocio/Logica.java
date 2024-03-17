/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateofr.tareaevaluacion.logicanegocio;

import com.mateofr.tareaevaluacion.datos.Aeropuerto;
import com.mateofr.tareaevaluacion.datos.Companya;
import com.mateofr.tareaevaluacion.datos.VueloBase;
import com.mateofr.tareaevaluacion.datos.VueloDiario;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.toedter.calendar.JDateChooser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Collectors;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author mateofr
 */
public class Logica {

    public static List<Companya> lstCompanyas = new ArrayList<>();

    // Método que elimina Vuelos Diarios del CSV a partir de su prefijo.
    public static void eliminarVuelosDiarios(String prefijo) {
        String csvFilePath = "./csv/VuelosDiarios.csv";

        try {

            List<String[]> lines;
            try (
                    CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
                lines = reader.readAll();
            }

            List<String[]> updatedLines = new ArrayList<>();
            for (String[] line : lines) {
                if (!line[0].equals(prefijo)) {
                    updatedLines.add(line);
                }
            }

            try (
                    CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {
                writer.writeAll(updatedLines);
            }

        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);

        } catch (CsvException ex) {
            System.out.println("Se ha producido una CsvException ");
        }
    }

    // Método que elimina un Vuelo Base del CSV.
    public static void eliminarVueloBase(String codVuelo) {
        String csvFilePath = "./csv/VuelosBase.csv";
        boolean vueloBaseEncontrado = false;
        try {

            List<String[]> lines;
            try ( // Lee el archivo CSV
                    CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
                lines = reader.readAll();
            }

            List<String[]> updatedLines = new ArrayList<>();
            for (String[] line : lines) {
                if (!line[0].equals(codVuelo)) {
                    updatedLines.add(line);
                } else {
                    vueloBaseEncontrado = true;
                }
            }

            try (
                    CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {
                writer.writeAll(updatedLines);
            }

            if (vueloBaseEncontrado) {
                JOptionPane.showMessageDialog(null, "Vuelo con prefijo: " + codVuelo + " eliminado con éxito.", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);

        } catch (CsvException ex) {
            System.out.println("Se ha producido una CsvException ");
        }
    }

    //Método para agregar un nuevo vuelo diario al CSV.
    public static void agregarNuevoVueloDiario(String prefijo, String codigoVuelo,
            String fecha, String horaSalida, String horaLlegada,
            String plazasOcupadas, String precio) {
        String[] vueloDiario = {prefijo, codigoVuelo, fecha, horaSalida, horaLlegada, plazasOcupadas, precio};
        String nuevaLinea = String.join(",", vueloDiario);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./csv/VuelosDiarios.csv", true))) {
            writer.write(nuevaLinea);
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Vuelo Diario " + "[" + codigoVuelo + "]" + "añadido con éxito.", "Inserción exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);
        }
    }

    // Método para agregar un nuevo vuelo base al CSV.
    public static void agregarNuevoVueloBase(String codigoVuelo, String aeropuertoOrigen, String aeropuertoDestino, String plazas, String horaSalida,
            String horaLlegada, String diasOperativo) {
        String[] vueloBase = {codigoVuelo, aeropuertoOrigen, aeropuertoDestino, plazas, horaSalida, horaLlegada, diasOperativo};
        String nuevaLinea = String.join(",", vueloBase);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./csv/VuelosBase.csv", true))) {
            writer.write(nuevaLinea);
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Vuelo Base " + "[" + codigoVuelo + "]" + "añadido con éxito.", "Inserción exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);
        }
    }

    public static List<VueloBase> leerVuelosBaseDesdeCSV(String filePath) {
        List<VueloBase> vuelosBase = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = csvReader.readAll();

            for (String[] record : records) {
                String codigoVuelo = record[0];
                String aeropuertoOrigen = record[1];
                String aeropuertoDestino = record[2];
                String plazas = record[3];
                int plazasInt = Integer.parseInt(plazas);
                String horaSalida = record[4];
                String horaLlegada = record[5];
                LocalTime horaSalidaLT = LocalTime.parse(horaSalida, formatter);
                LocalTime horaLlegadaLT = LocalTime.parse(horaLlegada, formatter);
                String diasOperativo = record[6];

                VueloBase vueloBase = new VueloBase(codigoVuelo, aeropuertoOrigen, aeropuertoDestino, plazasInt, horaSalidaLT, horaLlegadaLT, diasOperativo);
                vuelosBase.add(vueloBase);
            }
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);

        } catch (CsvException e) {
            System.out.println("Se ha producido una CsvException " + e);
        }

        return vuelosBase;
    }

    public static void modificarVueloDiario(String prefijo, String codigoVuelo, String fecha,
            String horaSalida, String horaLlegada, String plazasOcupadas, String precio) {
        List<List<String>> filas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("./csv/VuelosDiarios.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                filas.add(new ArrayList<>(List.of(campos))); // Copia a una lista mutable
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);

        }

        for (List<String> fila : filas) {

            if (fila.get(0).equals(prefijo)) {

                fila.set(1, codigoVuelo);
                fila.set(2, fecha);
                fila.set(3, horaSalida);
                fila.set(4, horaLlegada);
                fila.set(5, plazasOcupadas);
                fila.set(6, precio);
                break;
            }
        }

        try (FileWriter writer = new FileWriter("./csv/VuelosDiarios.csv")) {
            for (List<String> fila : filas) {
                writer.write(String.join(",", fila) + "\n");
            }
            JOptionPane.showMessageDialog(null, "Vuelo diario con prefijo " + prefijo + " modificado con éxito.", "Modificación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            System.err.println("Se ha producido una IOException " + ex);
        }

    }

    public String obtenerFechaComoString(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }

    public static void modificarVueloBase(String codigoBuscar, String aeroOrigen, String aeroDestino,
            String plazas, String horaSalida, String horaLlegada, String diasOperativo) {
        List<List<String>> filas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("./csv/VuelosBase.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                filas.add(new ArrayList<>(List.of(campos))); // Copia a una lista mutable
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);

        }

        for (List<String> fila : filas) {

            if (fila.get(0).equals(codigoBuscar)) {

                fila.set(1, aeroOrigen);
                fila.set(2, aeroDestino);
                fila.set(3, plazas);
                fila.set(4, horaSalida);
                fila.set(5, horaLlegada);
                fila.set(6, diasOperativo);
                break;
            }
        }

        try (FileWriter writer = new FileWriter("./csv/VuelosBase.csv")) {
            for (List<String> fila : filas) {
                writer.write(String.join(",", fila) + "\n");
            }
            JOptionPane.showMessageDialog(null, "Vuelo base con código " + codigoBuscar + " modificada con éxito.", "Modificación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            System.err.println("Se ha producido una IOException " + ex);
        }

    }

    public static List<VueloDiario> leerVuelosDiariosDesdeCSV(String filePath) {
        List<VueloDiario> vuelosDiarios = new ArrayList<>();
        DateTimeFormatter formateadorFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formateadorHora = DateTimeFormatter.ofPattern("HH:mm");

        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = csvReader.readAll();

            for (String[] record : records) {
                String prefijo = record[0];
                int prefijoint = Integer.parseInt(prefijo);
                String codigoVuelo = record[1];
                String fecha = record[2];
                LocalDate fechaLD = LocalDate.parse(fecha, formateadorFecha);
                String horaSalida = record[3];
                LocalTime horaSalidaLT = LocalTime.parse(horaSalida, formateadorHora);
                String horaLlegada = record[4];
                LocalTime horaLlegadaLT = LocalTime.parse(horaLlegada, formateadorHora);
                String plazasOcupadasStr = record[5];
                int plazasOcupadas = Integer.parseInt(plazasOcupadasStr);
                String precioStr = record[6];
                double precio = Double.parseDouble(precioStr);

                VueloDiario vd = new VueloDiario(prefijoint, codigoVuelo, fechaLD,
                        horaSalidaLT, horaLlegadaLT, plazasOcupadas, precio);
                vuelosDiarios.add(vd);
            }
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);

        } catch (CsvException e) {
            System.out.println("Se ha producido una CsvException " + e);
        }

        return vuelosDiarios;
    }

    public static List<Companya> leerCompaniasDesdeCSV(String filePath) {
        List<Companya> companias = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = csvReader.readAll();

            for (String[] record : records) {
                String prefijost = record[0];
                int prefijo = Integer.parseInt(prefijost);
                String codigoIdentificacion = record[1];
                String nombre = record[2];
                String direccion = record[3];
                String municipio = record[4];
                String telPasajero = record[5];
                String telAeropuerto = record[6];

                Companya compania = new Companya(prefijo, codigoIdentificacion, nombre, direccion, municipio, telPasajero, telAeropuerto);
                companias.add(compania);
            }
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);

        } catch (CsvException e) {
            System.out.println("Se ha producido una CsvException " + e);
        }

        return companias;
    }

    public static List<Aeropuerto> leerAeropuertosDesdeCSV(String filePath) {
        List<Aeropuerto> aeropuertos = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = csvReader.readAll();

            for (String[] record : records) {
                String prefijost = record[0];
                int prefijo = Integer.parseInt(prefijost);
                String nombre = record[1];
                String IATA = record[2];
                String municipio = record[3];

                Aeropuerto aeropuerto = new Aeropuerto(prefijo, nombre, IATA, municipio);
                aeropuertos.add(aeropuerto);
            }
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);

        } catch (CsvException e) {
            System.out.println("Se ha producido una CsvException " + e);
        }

        return aeropuertos;
    }

    // Método que calcula automáticamente el prefijo de una nueva compañía.
    public int CalcularPrefijoCompanya() {

        int prefijoUltimo = 0;
        try (CSVReader csvReader = new CSVReader(new FileReader("./csv/Companyas.csv"))) {
            List<String[]> records = csvReader.readAll();

            for (String[] record : records) {
                String prefijost = record[0];
                prefijoUltimo = Integer.parseInt(prefijost);

            }

        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);

        } catch (CsvException e) {
            System.out.println("Se ha producido una CsvException " + e);
        }

        return prefijoUltimo + 1;
    }

    // Método que calcula automáticamente el prefijo de un nuevo vuelo diario.
    public int CalcularPrefijoVueloDiario() {

        int prefijoUltimo = 0;
        try (CSVReader csvReader = new CSVReader(new FileReader("./csv/VuelosDiarios.csv"))) {
            List<String[]> records = csvReader.readAll();

            for (String[] record : records) {
                String prefijost = record[0];
                prefijoUltimo = Integer.parseInt(prefijost);

            }

        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);

        } catch (CsvException e) {
            System.out.println("Se ha producido una CsvException " + e);
        }

        return prefijoUltimo + 1;
    }

    // Método que añade una nueva compañía al CSV.
    public static void agregarNuevaCompania(String prefijost, String codigo, String nombre, String direccion, String municipio,
            String telPasajero, String telAeropuerto) {
        String[] companya = {prefijost, codigo, nombre, direccion, municipio, telPasajero, telAeropuerto};
        String nuevaLinea = String.join(",", companya);  // Convierte el array en una cadena CSV

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./csv/Companyas.csv", true))) {
            writer.write(nuevaLinea);
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Compañía " + "[" + codigo + "] " + " añadida con éxito.", "Inserción exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);
        }
    }

    // Método que elimina una compañía de su CSV.
    public static void eliminarCompanya(String prefijo) {
        String csvFilePath = "./csv/Companyas.csv";
        boolean companyaEncontrada = false;
        try {

            List<String[]> lines;
            try (
                    CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
                lines = reader.readAll();
            }

            List<String[]> updatedLines = new ArrayList<>();
            for (String[] line : lines) {
                if (!line[0].equals(prefijo)) {
                    updatedLines.add(line);
                } else {
                    companyaEncontrada = true;
                }
            }

            try (
                    CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {
                writer.writeAll(updatedLines);
            }

            if (companyaEncontrada) {
                JOptionPane.showMessageDialog(null, "Compañía con prefijo: " + prefijo + " eliminada con éxito.", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "La compañía con prefijo: " + prefijo + " no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException e) {
            System.out.println("Se ha producido una IOException " + e);

        } catch (CsvException ex) {
            System.out.println("Se ha producido una CsvException ");
        }
    }

    public static void modificarCompanya(String prefijoBuscar, String codCompanya, String nombreCompanya,
            String direccionCompanya, String municipioCompanya, String telPasajeros, String telAeropuertos) {
        List<List<String>> filas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("./csv/Companyas.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                filas.add(new ArrayList<>(List.of(campos))); // Copia a una lista mutable
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);

        }

        for (List<String> fila : filas) {

            if (fila.get(0).equals(prefijoBuscar)) {

                fila.set(1, codCompanya);
                fila.set(2, nombreCompanya);
                fila.set(3, direccionCompanya);
                fila.set(4, municipioCompanya);
                fila.set(5, telPasajeros);
                fila.set(6, telAeropuertos);
                // ... Actualiza más campos según sea necesario
                break;
            }
        }

        try (FileWriter writer = new FileWriter("./csv/Companyas.csv")) {
            for (List<String> fila : filas) {
                writer.write(String.join(",", fila) + "\n");
            }
            JOptionPane.showMessageDialog(null, "Compañía con prefijo " + prefijoBuscar + " modificada con éxito.", "Modificación exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            System.err.println("Se ha producido una IOException " + ex);
        }

    }

    /* Método para comprobar 
      si el archivo Companyas.csv existe,
      si no existe lo crea.*/
    public static void CompanyasExiste() {
        String filePath = "./csv/Companyas.csv";
        File Companyas = new File(filePath);
        if (!Companyas.exists()) {
            try {
                Companyas.createNewFile();
            } catch (IOException ex) {
                System.out.println("Se ha producido una IOException " + ex);
            }
        }

    }

    /* Método para comprobar 
      si el archivo VuelosBase.csv existe,
      si no existe lo crea.*/
    public static void VuelosBaseExiste() {
        String filePath = "./csv/VuelosBase.csv";
        File VuelosBase = new File(filePath);
        if (!VuelosBase.exists()) {
            try {
                VuelosBase.createNewFile();
            } catch (IOException ex) {
                System.out.println("Se ha producido una IOException " + ex);
            }
        }

    }

    /* Método para comprobar 
      si el archivo VuelosDiarios.csv existe,
      si no existe lo crea.*/
    public static void VuelosDiariosExiste() {
        String filePath = "./csv/VuelosDiarios.csv";
        File VuelosBase = new File(filePath);
        if (!VuelosBase.exists()) {
            try {
                VuelosBase.createNewFile();
            } catch (IOException ex) {
                System.out.println("Se ha producido una IOException " + ex);
            }
        }

    }

// Método que comprueba si el código de Companya está en el CSV.
    public static boolean buscarCodigoCompanyaEnCSV(String codigo) {

        List<String[]> lines;
        try (CSVReader reader = new CSVReader(new FileReader("./csv/Companyas.csv"))) {
            try {
                lines = reader.readAll();
                for (String[] line : lines) {
                    if (line[1].equals(codigo)) {

                        return true;
                    }
                }
            } catch (CsvException ex) {
                System.out.println("Se ha producido una CsvException " + ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        return false;
    }

    // Método que busca si un código ya existe excluyendo la propia compañía que se esta manejando.
    public static boolean buscarCodigoEnCsvExcluyendoModificada(String codigo, String prefijoActual) {
        List<List<String>> filas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("./csv/Companyas.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                filas.add(List.of(campos));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        for (List<String> fila : filas) {
            // Excluir la compañía actual por prefijo
            if (!fila.get(0).equals(prefijoActual) && fila.get(1).equals(codigo)) {
                return true;
            }
        }

        return false;
    }

    // Método que devuelve true si encuentra un código en el CSV de VuelosBase.
    public static boolean buscarCodigoVueloBaseEnCSV(String codigo) {

        List<String[]> lines;
        try (CSVReader reader = new CSVReader(new FileReader("./csv/VuelosBase.csv"))) {
            try {
                lines = reader.readAll();
                for (String[] line : lines) {
                    if (line[0].equals(codigo)) {

                        return true;
                    }
                }
            } catch (CsvException ex) {
                System.out.println("Se ha producido una CsvException " + ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        return false;
    }

    // Método que mira si un código esta en el CSV de VuelosDiarios.
    public static boolean buscarCodigoVueloDiarioEnCSV(String codigo) {

        List<String[]> lines;
        try (CSVReader reader = new CSVReader(new FileReader("./csv/VuelosDiarios.csv"))) {
            try {
                lines = reader.readAll();
                for (String[] line : lines) {
                    if (line[1].equals(codigo)) {

                        return true;
                    }
                }
            } catch (CsvException ex) {
                System.out.println("Se ha producido una CsvException " + ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        return false;
    }

    // Método que comprueba si el prefijo de Companya está en el CSV.
    public static boolean buscarPrefijoEnCSV(String prefijo) {
        List<String[]> lines;
        try (CSVReader reader = new CSVReader(new FileReader("./csv/Companyas.csv"))) {
            try {
                lines = reader.readAll();
                for (String[] line : lines) {
                    if (line[0].equals(prefijo)) {
                        return true;
                    }
                }
            } catch (CsvException ex) {
                System.out.println("Se ha producido una CsvException " + ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        return false;
    }

    //Método que calcula el retraso en minutos de un Vuelo Diario respecto al establecido en el Base.
    public static String calcularRetraso(LocalTime horaOriginal, LocalTime horaReal) {
        int minutosOriginales = horaOriginal.getHour() * 60 + horaOriginal.getMinute();
        int minutosReales = horaReal.getHour() * 60 + horaReal.getMinute();
        int diferenciaMinutos = minutosReales - minutosOriginales;

        int horas = diferenciaMinutos / 60;
        int minutosRestantes = diferenciaMinutos % 60;

        return String.format("%02d:%02d", horas, minutosRestantes);

    }

    //Método para obtener la hora de Salida del Vuelo Base.
    public static LocalTime obtenerHoraSalidaBase(String codigo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        List<String[]> lineas;
        LocalTime horaSalida = null;
        String horaSalidaBase = "";
        try (CSVReader reader = new CSVReader(new FileReader("./csv/VuelosBase.csv"))) {
            try {
                lineas = reader.readAll();
                for (String[] linea : lineas) {
                    if (linea[0].equals(codigo)) {
                        horaSalidaBase = linea[4];

                    }
                }
                horaSalida = LocalTime.parse(horaSalidaBase, formatter);

            } catch (CsvException ex) {
                System.out.println("Se ha producido una CsvException " + ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        return horaSalida;

    }

    //Método para obtener la hora de Llegada del Vuelo Base.
    public static LocalTime obtenerHoraLlegadaBase(String codigo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        List<String[]> lineas;
        LocalTime horaLlegada = null;
        String horaLlegadaBase = "";
        try (CSVReader reader = new CSVReader(new FileReader("./csv/VuelosBase.csv"))) {
            try {
                lineas = reader.readAll();
                for (String[] linea : lineas) {
                    if (linea[0].equals(codigo)) {
                        horaLlegadaBase = linea[5];

                    }
                }
                horaLlegada = LocalTime.parse(horaLlegadaBase, formatter);

            } catch (CsvException ex) {
                System.out.println("Se ha producido una CsvException " + ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        return horaLlegada;

    }

    private static String obtenerFormatoHorasMinutos(int minutos) {
        // Calcula las horas dividiendo los minutos entre 60
        int horas = minutos / 60;

        // Calcula los minutos restantes tomando el módulo 60
        int minutosRestantes = minutos % 60;

        // Usa String.format para formatear las horas y minutos en el formato HH:mm
        return String.format("%02d:%02d", horas, minutosRestantes);
    }

    // Método que carga el código de las compañías del CSV a un JComboBox
    public static void cargarCodigoCompanyas(JComboBox<String> comboBox) {

        String csvFilePath = "./csv/Companyas.csv";

        comboBox.removeAllItems();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFilePath))) {
            List<String[]> filas = csvReader.readAll();

            for (String[] fila : filas) {
                String codigoCompanya = fila[1];
                comboBox.addItem(codigoCompanya);
            }
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);

        } catch (CsvException ex) {
            System.out.println("Se ha producido una CsvException " + ex);
        }
    }

    public static void cargarPrefijoCompanyas(JComboBox<String> comboBox) {

        String csvFilePath = "./csv/Companyas.csv";

        comboBox.removeAllItems();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFilePath))) {
            List<String[]> filas = csvReader.readAll();

            for (String[] fila : filas) {
                String prefijoCompanya = fila[0];
                comboBox.addItem(prefijoCompanya);
            }
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);

        } catch (CsvException ex) {
            System.out.println("Se ha producido una CsvException " + ex);
        }
    }

    public static void cargarCodigoVueloBase(JComboBox<String> comboBox) {

        String csvFilePath = "./csv/VuelosBase.csv";

        comboBox.removeAllItems();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFilePath))) {
            List<String[]> filas = csvReader.readAll();

            for (String[] fila : filas) {
                String codigoVuelo = fila[0];
                comboBox.addItem(codigoVuelo);
            }
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);

        } catch (CsvException ex) {
            System.out.println("Se ha producido una CsvException " + ex);
        }
    }

    // Método que carga en un comboBox los prefijos de los vuelos diarios del CSV.
    public static void cargarPrefijosVuelosDiarios(JComboBox<String> comboBox) {

        String csvFilePath = "./csv/VuelosDiarios.csv";

        comboBox.removeAllItems();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFilePath))) {
            List<String[]> filas = csvReader.readAll();

            for (String[] fila : filas) {
                String prefijo = fila[0];
                comboBox.addItem(prefijo);
            }
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);

        } catch (CsvException ex) {
            System.out.println("Se ha producido una CsvException " + ex);
        }
    }

    // Método que carga el nombre de los aeropuertos que están en el CSV en un JComboBox
    public static void cargarAeropuertos(JComboBox<String> comboBox) {

        String csvFilePath = "./csv/Aeropuertos.csv";

        comboBox.removeAllItems();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFilePath))) {

            List<String[]> filas = csvReader.readAll();

            for (String[] fila : filas) {

                String nombreAeropuerto = fila[1];
                comboBox.addItem(nombreAeropuerto);
            }
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);

        } catch (CsvException ex) {
            System.out.println("Se ha producido una CsvException " + ex);
        }

    }

    // Método que devuelve el codigo de vuelo a partir de los dos campos.
    public static String calcularCodigoVuelo(JComboBox codigoVuelo1, JTextField codigoVuelo2) {
        String codVuelo1 = codigoVuelo1.getSelectedItem().toString();
        String codVuelo2 = codigoVuelo2.getText();
        return codVuelo1 + codVuelo2;
    }

    // Método que formatea la hora introducida en los comboBox.
    public static String formatearHora(JComboBox horasComboBox, JComboBox minutosComboBox) {
        String horasSalidaStr = (String) horasComboBox.getSelectedItem();
        String minutosSalidaStr = (String) minutosComboBox.getSelectedItem();

        int horas = Integer.parseInt(horasSalidaStr);
        int minutos = Integer.parseInt(minutosSalidaStr);

        return String.format("%02d:%02d", horas, minutos);

    }

    // Método que obtiene las plazas de un vuelo base a partir de su código.
    public static int ObtenerPlazasTotales(String codigo) {
        List<String[]> lineas;
        int plazasTotales = -1;
        try (CSVReader reader = new CSVReader(new FileReader("./csv/VuelosBase.csv"))) {
            try {
                lineas = reader.readAll();
                for (String[] linea : lineas) {
                    if (linea[0].equals(codigo)) {
                        String plazasTotalesStr = linea[3];

                        plazasTotales = Integer.parseInt(plazasTotalesStr);

                    }
                }

            } catch (CsvException ex) {
                System.out.println("Se ha producido una CsvException " + ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        return plazasTotales;

    }

    // Método que obtiene la cadena de los días operativos de un vuelo base 
    // a partir de su código.
    public static String ObtenerDiasOperativos(String codigo) {
        List<String[]> lineas;
        String diasOperativos = "";
        try (CSVReader reader = new CSVReader(new FileReader("./csv/VuelosBase.csv"))) {
            try {
                lineas = reader.readAll();
                for (String[] linea : lineas) {
                    if (linea[0].equals(codigo)) {

                        diasOperativos = linea[6];

                    }
                }

            } catch (CsvException ex) {
                System.out.println("Se ha producido una CsvException " + ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        return diasOperativos;

    }

    public static boolean validarPlazasOcupadas(String codigo, String plazasOcupadasStr) {
        List<String[]> lineas;
        int plazasTotales = -1;
        int plazasOcupadas = -1;
        try (CSVReader reader = new CSVReader(new FileReader("./csv/VuelosBase.csv"))) {
            try {
                lineas = reader.readAll();
                for (String[] linea : lineas) {
                    if (linea[0].equals(codigo)) {
                        String plazasTotalesStr = linea[3];
                        plazasTotales = Integer.parseInt(plazasTotalesStr);
                    }
                }

                plazasOcupadas = Integer.parseInt(plazasOcupadasStr);
            } catch (CsvException ex) {
                System.out.println("Se ha producido una CsvException " + ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        return plazasOcupadas <= plazasTotales && plazasOcupadas > 0;
    }

    // Método que devuelve true si es un número entero y si se introduce otra cosa entra en la excepcion y da false.
    public static boolean esNumero(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

// Método que devuelve true si es un double y si se introduce otra cosa entra en la excepcion y da false.
    public static boolean esNumeroDecimal(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String obtenerLetraDiaSemana(Date fecha) {
        SimpleDateFormat formatoDia = new SimpleDateFormat("u");
        int numeroDia = Integer.parseInt(formatoDia.format(fecha));

        String[] letrasDias = {"", "L", "M", "X", "J", "V", "S", "D"};

        if (numeroDia >= 1 && numeroDia <= 7) {
            return letrasDias[numeroDia];
        } else {
            throw new IllegalArgumentException("Número de día de la semana no válido");
        }
    }

    // Función para combinar fecha y hora
    public static LocalDateTime combinarFechaYHora(String fechaStr, String horaStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime fechaHora = LocalDateTime.parse(fechaStr + " " + horaStr, formatter);
        return fechaHora;
    }

    // Función para comparar con la fecha y hora actual
    private static boolean compararConFechaActual(LocalDateTime fechaHoraCombinada) {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        return fechaHoraActual.isAfter(fechaHoraCombinada);
    }

    public static String ObtenerIATAporNombre(String nombreAero) {
        List<String[]> lineas;
        String IATA = "";
        try (CSVReader reader = new CSVReader(new FileReader("./csv/Aeropuertos.csv"))) {
            try {
                lineas = reader.readAll();
                for (String[] linea : lineas) {
                    if (linea[1].equals(nombreAero)) {
                        IATA = linea[2];

                    }
                }

            } catch (CsvException ex) {
                System.out.println("Se ha producido una CsvException " + ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Se ha producido una FileNotFoundException " + ex);
        } catch (IOException ex) {
            System.out.println("Se ha producido una IOException " + ex);
        }

        return IATA;
    }

    // Método que obtiene un recurso del 
    // archivo de propiedades a partir de su clave
    public static String obtenerRecurso(String clave) {
        Properties propiedades = new Properties();

        try (InputStream entrada = Logica.class.getClassLoader().getResourceAsStream("config.properties")) {

            propiedades.load(entrada);

            return propiedades.getProperty(clave);

        } catch (Exception e) {
            System.out.println("Se ha producido una Excepción " + e);

            return null;
        }
    }

    // Método que obtiene las salidas del Aeropuerto 
    //que tenga el nombre establecido en el archivo de propiedades.
    public static List<VueloDiario> ObtenerSalidasAeropuertoActual(JDateChooser jd) {
        String rutaArchivoVuelosBase = "./csv/VuelosBase.csv";
        String rutaArchivoVuelosDiarios = "./csv/VuelosDiarios.csv";

        String nombreActual = Logica.obtenerRecurso("nombreAeropuerto");

        List<VueloBase> vuelosBase = Logica.leerVuelosBaseDesdeCSV(rutaArchivoVuelosBase);

        List<String> codigosVuelosBase = vuelosBase.stream()
                .filter(vuelo -> vuelo.getAeropuertoOrigen().equalsIgnoreCase(nombreActual))
                .map(VueloBase::getCodigoVuelo)
                .collect(Collectors.toList());

        List<VueloDiario> vuelosDiarios = Logica.leerVuelosDiariosDesdeCSV(rutaArchivoVuelosDiarios);

        List<VueloDiario> vuelosDiariosFiltrados = vuelosDiarios.stream()
                .filter(vueloDiario -> codigosVuelosBase.contains(vueloDiario.getCodigoVuelo()))
                .sorted(Comparator.comparing(VueloDiario::getHoraSalidaReal))
                .collect(Collectors.toList());

        Date fechaSeleccionada = jd.getDate();
        LocalDate fechaUsuario = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        List<VueloDiario> vuelosDiariosFiltradosPorFecha = vuelosDiariosFiltrados.stream()
                .filter(vueloDiario -> vueloDiario.getFechaVuelo().equals(fechaUsuario))
                .collect(Collectors.toList());

        return vuelosDiariosFiltradosPorFecha;
    }

    // Método que obtiene las llegadas del Aeropuerto 
    //que tenga el nombre establecido en el archivo de propiedades.
    public static List<VueloDiario> ObtenerLlegadasAeropuertoActual(JDateChooser jd) {
        String rutaArchivoVuelosBase = "./csv/VuelosBase.csv";
        String rutaArchivoVuelosDiarios = "./csv/VuelosDiarios.csv";

        String nombreActual = Logica.obtenerRecurso("nombreAeropuerto");

        List<VueloBase> vuelosBase = Logica.leerVuelosBaseDesdeCSV(rutaArchivoVuelosBase);

        List<String> codigosVuelosBase = vuelosBase.stream()
                .filter(vuelo -> vuelo.getAeropuertoDestino().equalsIgnoreCase(nombreActual))
                .map(VueloBase::getCodigoVuelo)
                .collect(Collectors.toList());

        List<VueloDiario> vuelosDiarios = Logica.leerVuelosDiariosDesdeCSV(rutaArchivoVuelosDiarios);

        // Filtrar los vuelos diarios por los códigos de vuelos base y ordenar por hora de salida
        List<VueloDiario> vuelosDiariosFiltrados = vuelosDiarios.stream()
                .filter(vueloDiario -> codigosVuelosBase.contains(vueloDiario.getCodigoVuelo()))
                .sorted(Comparator.comparing(VueloDiario::getHoraLlegadaReal))
                .collect(Collectors.toList());

        Date fechaSeleccionada = jd.getDate();
        LocalDate fechaUsuario = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        List<VueloDiario> vuelosDiariosFiltradosPorFecha = vuelosDiariosFiltrados.stream()
                .filter(vueloDiario -> vueloDiario.getFechaVuelo().equals(fechaUsuario))
                .collect(Collectors.toList());

        return vuelosDiariosFiltradosPorFecha;

    }

    // Método que filtra y devuelve una lista con los vuelos 
    //por el código de compañía en una fecha determinada.
    public static List<VueloDiario> ObtenerVuelosPorCompania(JDateChooser jd, String codigoCompania) {
        String rutaArchivoVuelosDiarios = "./csv/VuelosDiarios.csv";

        List<VueloDiario> vuelosDiarios = Logica.leerVuelosDiariosDesdeCSV(rutaArchivoVuelosDiarios);

        Date fechaSeleccionada = jd.getDate();
        LocalDate fechaUsuario = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        List<VueloDiario> vuelosDiariosFiltradosPorFecha = vuelosDiarios.stream()
                .filter(vueloDiario -> vueloDiario.getFechaVuelo().equals(fechaUsuario))
                .collect(Collectors.toList());

        List<VueloDiario> vuelosDiariosFiltradosPorCompania = vuelosDiariosFiltradosPorFecha.stream()
                .filter(vueloDiario -> vueloDiario.getCodigoVuelo().startsWith(codigoCompania))
                .collect(Collectors.toList());

        return vuelosDiariosFiltradosPorCompania;
    }

    public static double calcularRecaudaciones(LocalDate fechaSeleccionada) {
        String rutaArchivoVuelosDiarios = "./csv/VuelosDiarios.csv";

        // Leer Vuelos Diarios desde el Archivo CSV
        List<VueloDiario> vuelosDiarios = Logica.leerVuelosDiariosDesdeCSV(rutaArchivoVuelosDiarios);

        // Obtener la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();

        // Calcular la recaudación total
        double recaudacionTotal = vuelosDiarios.stream()
                .filter(vueloDiario -> vueloDiario.getFechaVuelo().equals(fechaSeleccionada))
                .filter(vueloDiario -> {
                    if (vueloDiario.getFechaVuelo() != null) {

                        LocalDateTime salidaReal = LocalDateTime.of(vueloDiario.getFechaVuelo(), vueloDiario.getHoraSalidaReal());

                        if (salidaReal.isBefore(ahora)) {

                            return true;
                        }
                    }
                    return false; // Vuelo no aplicable
                })
                .mapToDouble(vueloDiario -> calcularImporteRecaudado(vueloDiario))
                .sum();

        return recaudacionTotal;
    }

    public static double calcularImporteRecaudado(VueloDiario vueloDiario) {
        // Calcular el importe recaudado considerando el número de plazas ocupadas y el precio previsto
        int plazasOcupadas = vueloDiario.getPlazasOcupadas();
        double precioPrevisto = vueloDiario.getPrecioVuelo();
        return plazasOcupadas * precioPrevisto;
    }

    public static List<VueloDiario> obtenerVuelosPrevistos(String destino) {
        String rutaArchivoVuelosBase = "./csv/VuelosBase.csv";
        String rutaArchivoVuelosDiarios = "./csv/VuelosDiarios.csv";

        // 1. Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // 2. Calcular la fecha límite (actual + 7 días)
        LocalDate fechaLimite = fechaActual.plusDays(7);

        List<VueloBase> vuelosBase = Logica.leerVuelosBaseDesdeCSV(rutaArchivoVuelosBase);

        List<String> codigosVuelosBase = vuelosBase.stream()
                .filter(vuelo -> vuelo.getAeropuertoDestino().equalsIgnoreCase(destino))
                .map(VueloBase::getCodigoVuelo)
                .collect(Collectors.toList());

        List<VueloDiario> vuelosDiarios = Logica.leerVuelosDiariosDesdeCSV(rutaArchivoVuelosDiarios);

        List<VueloDiario> vuelosDiariosFiltrados = vuelosDiarios.stream()
                .filter(vuelo -> vuelo.getFechaVuelo().isAfter(fechaActual) && vuelo.getFechaVuelo().isBefore(fechaLimite.plusDays(1)))
                .filter(vueloDiario -> codigosVuelosBase.contains(vueloDiario.getCodigoVuelo()))
                .collect(Collectors.toList());

        vuelosDiariosFiltrados.sort((vuelo1, vuelo2) -> {
            LocalDateTime salida1 = LocalDateTime.of(vuelo1.getFechaVuelo(), vuelo1.getHoraSalidaReal());
            LocalDateTime salida2 = LocalDateTime.of(vuelo2.getFechaVuelo(), vuelo2.getHoraSalidaReal());
            return salida1.compareTo(salida2);
        });

        return vuelosDiariosFiltrados;
    }

    public static List<VueloBase> FiltrarVuelosBaseporCodigo(String codigo) {
        String rutaArchivoVuelosBase = "./csv/VuelosBase.csv";

        List<VueloBase> vuelosBase = Logica.leerVuelosBaseDesdeCSV(rutaArchivoVuelosBase);

        List<VueloBase> vueloBaseFiltrado = vuelosBase.stream()
                .filter(vuelo -> vuelo.getCodigoVuelo().equalsIgnoreCase(codigo))
                .collect(Collectors.toList());

        return vueloBaseFiltrado;
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

    // Método para acceder a la ayuda de la aplicación a partir de un item de menú.
    public void ponLaAyudaDialog(JMenuItem AyudaItem, String pantalla, JDialog dialogo) {
        try {
            File fichero = new File("help" + File.separator + "help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            hb.enableHelpOnButton(AyudaItem, pantalla, helpset);
            hb.enableHelpKey(dialogo.getRootPane(), pantalla, helpset);
            
           
            hb.setLocation(null);

        } catch (IllegalArgumentException | MalformedURLException | HelpSetException e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al mostrar la ayuda", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public  void ponLaAyudaFrame(JMenuItem ayudaItem, String pantalla, JFrame frame) {
        try {
            File fichero = new File("help" + File.separator + "help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            HelpSet helpSet = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker helpBroker = helpSet.createHelpBroker();

            helpBroker.enableHelpOnButton(ayudaItem, pantalla, helpSet);
            helpBroker.enableHelpKey(frame.getRootPane(), pantalla, helpSet);
        } catch (IllegalArgumentException | MalformedURLException | HelpSetException e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al mostrar la ayuda", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
   

}
