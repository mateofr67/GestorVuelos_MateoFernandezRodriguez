/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateofr.tareaevaluacion.gui.validadores;

import com.mateofr.tareaevaluacion.logicanegocio.Logica;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateo
 */
public class Validacion {

  //Método validarFormularioAltaVueloDiario
    public static boolean validarFormularioModificacionVuelosDiarios(String codigo, String fecha,String diaSemanaVuelo,
            String horaSalida, String horaLlegada, String plazasOcupadas, String precio) {
        String diasOperativos = Logica.ObtenerDiasOperativos(codigo);
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatearFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaLocalDate = LocalDate.parse(fecha, formatearFecha);
        DateTimeFormatter formatearHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaS = LocalTime.parse(horaSalida, formatearHora);
        LocalTime horaLL = LocalTime.parse(horaLlegada, formatearHora);

        if (fecha == null || "".equals(fecha)) {
            JOptionPane.showMessageDialog(null, "El campo fecha esta vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (fechaLocalDate.isBefore(fechaActual)) {
            JOptionPane.showMessageDialog(null, "El campo fecha no puede ser anterior a la fecha actual", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
         }else if (!diasOperativos.contains(diaSemanaVuelo)) {
            JOptionPane.showMessageDialog(null, "La fecha no concuerda con los días operativos del vuelo base", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }  else if (horaLL.isBefore(horaS)) {
            JOptionPane.showMessageDialog(null, "La hora de salida debe ser anterior a la de llegada", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (horaSalida.equals(horaLlegada)) {
            JOptionPane.showMessageDialog(null, "La hora de salida y llegada no puede ser la misma", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (plazasOcupadas == null || "".equals(plazasOcupadas)) {
            JOptionPane.showMessageDialog(null, "El campo plazas ocupadas esta vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }  else if (!Logica.esNumero(plazasOcupadas)) {
        JOptionPane.showMessageDialog(null, "El campo plazas ocupadas debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }else if (!Logica.validarPlazasOcupadas(codigo, plazasOcupadas)) {
            JOptionPane.showMessageDialog(null, "Las plazas ocupadas no concuerdan con el número de plazas totales o has introducido un valor igual o inferior a 0", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (precio == null || "".equals(precio)) {
        JOptionPane.showMessageDialog(null, "El campo precio está vacío", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    } else if (!Logica.esNumeroDecimal(precio)) {
        JOptionPane.showMessageDialog(null, "El campo precio debe ser un número (admite decimales con punto de separador)", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

        return true;
    }  
    
    
    
    
//Método validarFormularioAltaVueloDiario
    public static boolean validarFormularioAltaVuelosDiarios(String codigo, String fecha,String diaSemanaVuelo,
            String horaSalida, String horaLlegada, String plazasOcupadas, String precio) {
        String diasOperativos = Logica.ObtenerDiasOperativos(codigo);
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatearFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaLocalDate = LocalDate.parse(fecha, formatearFecha);
        DateTimeFormatter formatearHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaS = LocalTime.parse(horaSalida, formatearHora);
        LocalTime horaLL = LocalTime.parse(horaLlegada, formatearHora);

        if (fecha == null || "".equals(fecha)) {
            JOptionPane.showMessageDialog(null, "El campo fecha esta vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (fechaLocalDate.isBefore(fechaActual)) {
            JOptionPane.showMessageDialog(null, "El campo fecha no puede ser anterior a la fecha actual", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
         }else if (!diasOperativos.contains(diaSemanaVuelo)) {
            JOptionPane.showMessageDialog(null, "La fecha no concuerda con los días operativos del vuelo base", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }  else if (horaLL.isBefore(horaS)) {
            JOptionPane.showMessageDialog(null, "La hora de salida debe ser anterior a la de llegada", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (horaSalida.equals(horaLlegada)) {
            JOptionPane.showMessageDialog(null, "La hora de salida y llegada no puede ser la misma", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (plazasOcupadas == null || "".equals(plazasOcupadas)) {
            JOptionPane.showMessageDialog(null, "El campo plazas ocupadas esta vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }  else if (!Logica.esNumero(plazasOcupadas)) {
        JOptionPane.showMessageDialog(null, "El campo plazas ocupadas debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }else if (!Logica.validarPlazasOcupadas(codigo, plazasOcupadas)) {
            JOptionPane.showMessageDialog(null, "Las plazas ocupadas no concuerdan con el número de plazas totales o has introducido un valor igual o inferior a 0", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (precio == null || "".equals(precio)) {
        JOptionPane.showMessageDialog(null, "El campo precio está vacío", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    } else if (!Logica.esNumeroDecimal(precio)) {
        JOptionPane.showMessageDialog(null, "El campo precio debe ser un número (admite decimales con punto de separador)", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

        return true;
    }
    // Método de Validación del formulario de Alta de Compañías

    public static boolean validarFormularioAltaCompanya(int prefijo, String codigo, String nombre, String direccion, String municipio, String telPasajero, String telAeropuerto) {

        if (prefijo > 999) {
            JOptionPane.showMessageDialog(null, "Máximo de compañías alcanzado, disculpe las molestias", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (codigo == null || "".equals(codigo) || !validarCodigoCompanya(codigo)) {
            JOptionPane.showMessageDialog(null, "El código está vacío o no cumple los requisitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (Logica.buscarCodigoCompanyaEnCSV(codigo)) {
            JOptionPane.showMessageDialog(null, "El código de compañía está repetido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (nombre == null || "".equals(nombre)) {
            JOptionPane.showMessageDialog(null, "El campo nombre está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (direccion == null || "".equals(direccion)) {
            JOptionPane.showMessageDialog(null, "El campo dirección está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (municipio == null || "".equals(municipio)) {
            JOptionPane.showMessageDialog(null, "El campo municipio está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (telPasajero == null || "".equals(telPasajero) || !validarTelefono(telPasajero)) {
            JOptionPane.showMessageDialog(null, "El campo de Télefono de información al pasajero está vacío o no cumple los requísitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (telAeropuerto == null || "".equals(telAeropuerto) || !validarTelefono(telAeropuerto)) {
            JOptionPane.showMessageDialog(null, "El campo de Télefono de información a aeropuertos está vacío o no cumple los requisitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    // Método de Validación del formulario de Baja de Compañías
    public static boolean validarFormularioBajaCompanya(String prefijo) {
        if (prefijo == null || "".equals(prefijo)) {
            JOptionPane.showMessageDialog(null, "El campo prefijo está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!Logica.buscarPrefijoEnCSV(prefijo)) {
            JOptionPane.showMessageDialog(null, "El prefijo de compañía introducido no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    // Método de Validación del formulario de Modificación de Compañías
    public static boolean validarFormularioModificacionCompanya(String prefijo, String codigo,
            String nombre, String direccion, String municipio, String telPasajero, String telAeropuerto) {

        if (prefijo == null || "".equals(prefijo)) {
            JOptionPane.showMessageDialog(null, "El campo prefijo está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!Logica.buscarPrefijoEnCSV(prefijo)) {
            JOptionPane.showMessageDialog(null, "El prefijo de compañía introducido no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (codigo == null || "".equals(codigo) || !validarCodigoCompanya(codigo)) {
            JOptionPane.showMessageDialog(null, "El código está vacío o no cumple los requisitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (Logica.buscarCodigoEnCsvExcluyendoModificada(codigo, prefijo)) {
            JOptionPane.showMessageDialog(null, "El código de compañía está repetido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (nombre == null || "".equals(nombre)) {
            JOptionPane.showMessageDialog(null, "El campo nombre está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (direccion == null || "".equals(direccion)) {
            JOptionPane.showMessageDialog(null, "El campo dirección está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (municipio == null || "".equals(municipio)) {
            JOptionPane.showMessageDialog(null, "El campo municipio está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (telPasajero == null || "".equals(telPasajero) || !validarTelefono(telPasajero)) {
            JOptionPane.showMessageDialog(null, "El campo de télefono de información al pasajero está vacío o no cumple los requísitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (telAeropuerto == null || "".equals(telAeropuerto) || !validarTelefono(telAeropuerto)) {
            JOptionPane.showMessageDialog(null, "El campo de télefono de información a aeropuertos está vacío o no cumple los requisitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;

    }

    // Método que valida el formulario de modificación de vuelos base.
    public static boolean validarFormularioModificacionVuelosBase(String codigo, String aeroOrigen,
            String aeroDestino, String plazas, String horaSalida, String horaLlegada, String diasOperativo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaS = LocalTime.parse(horaSalida, formatter);
        LocalTime horaLL = LocalTime.parse(horaLlegada, formatter);

        if (codigo == null || "".equals(codigo)) {
            JOptionPane.showMessageDialog(null, "El campo código está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            
        } else if (Logica.buscarCodigoVueloDiarioEnCSV(codigo)) {
            JOptionPane.showMessageDialog(null, "No se puede modificar el vuelo base, ya que ya hay vuelos diarios asociados", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if (aeroOrigen.equals(aeroDestino)) {
            JOptionPane.showMessageDialog(null, "El aeropuerto de origen y destino no puede ser el mismo", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (plazas == null || "".equals(plazas)) {
            JOptionPane.showMessageDialog(null, "El campo de plazas está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!plazas.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El campo de plazas debe contener solo números", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (horaLL.isBefore(horaS)) {
            JOptionPane.showMessageDialog(null, "La hora de salida debe ser anterior a la de llegada", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (horaSalida.equals(horaLlegada)) {
            JOptionPane.showMessageDialog(null, "La hora de salida y llegada no puede ser la misma", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (diasOperativo == null || "".equals(diasOperativo)) {
            JOptionPane.showMessageDialog(null, "Los días operativos están vacíos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!validarDiasOperativos(diasOperativo)) {
            JOptionPane.showMessageDialog(null, "El formato de días operativos no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    // Método que valida el formulario de baja de vuelos base.
    public static boolean validarFormularioBajaVueloBase(String codigoVuelo) {
        if (codigoVuelo == null || "".equals(codigoVuelo)) {
            JOptionPane.showMessageDialog(null, "El código de vuelo está vacío o no existen vuelos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

       // Método que valida el formulario de baja de vuelos diarios.
    public static boolean validarFormularioBajaVuelosDiarios(String prefijo) {
        if (prefijo == null || "".equals(prefijo)) {
            JOptionPane.showMessageDialog(null, "El prefijo de vuelo está vacío o no existen vuelos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    // Método que valida el formulario de alta de Vuelos Base
    public static boolean validarFormularioAltaVueloBase(String codigoVueloNumerico, String codigoVuelo,
            String aeroOrigen, String aeroDestino, String plazas,
            String horaSalida, String horaLlegada, String diasOperativo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaS = LocalTime.parse(horaSalida, formatter);
        LocalTime horaLL = LocalTime.parse(horaLlegada, formatter);

        try {
        int codigoVueloNum = Integer.parseInt(codigoVueloNumerico);

        if (codigoVuelo == null || "".equals(codigoVuelo)) {
            JOptionPane.showMessageDialog(null, "El código de vuelo está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (codigoVueloNum > 9999 || codigoVueloNum <= 0) {
            JOptionPane.showMessageDialog(null, "La parte numérica del código debe ser un número entre 1-9999 (inclusive) ", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!validarCodigoVuelo(codigoVuelo)) {
            JOptionPane.showMessageDialog(null, "El código de vuelo no cumple los requisitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (Logica.buscarCodigoVueloBaseEnCSV(codigoVuelo)) {
            JOptionPane.showMessageDialog(null, "El código de vuelo ya está en uso", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (aeroOrigen == null || "".equals(aeroOrigen)) {
            JOptionPane.showMessageDialog(null, "El aeropuerto de origen está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (aeroDestino == null || "".equals(aeroDestino)) {
            JOptionPane.showMessageDialog(null, "El aeropuerto de destino está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (aeroOrigen.equals(aeroDestino)) {
            JOptionPane.showMessageDialog(null, "El aeropuerto de origen y destino no puede ser el mismo", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (plazas == null || "".equals(plazas)) {
            JOptionPane.showMessageDialog(null, "El campo de plazas está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!Logica.esNumero(plazas)) {
            JOptionPane.showMessageDialog(null, "El campo de plazas debe contener solo números", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (horaLL.isBefore(horaS)) {
            JOptionPane.showMessageDialog(null, "La hora de salida debe ser anterior a la de llegada", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (horaSalida.equals(horaLlegada)) {
            JOptionPane.showMessageDialog(null, "La hora de salida y llegada no puede ser la misma", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (diasOperativo == null || "".equals(diasOperativo)) {
            JOptionPane.showMessageDialog(null, "Los días operativos están vacíos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!validarDiasOperativos(diasOperativo)) {
            JOptionPane.showMessageDialog(null, "El formato de días operativos no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Carácteres inválidos en la parte numérica del código de Vuelo", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //Método para validar los Días Operativos de los Vuelos
    private static boolean validarDiasOperativos(String diasOperativos) {
        String patron = "^(?!.*(.).*\\1)[LMXJVSD]+$";

        Pattern pattern = Pattern.compile(patron);

        Matcher matcher = pattern.matcher(diasOperativos);

        return matcher.matches();
    }

    // Método para validar que el código de la compañía esté bien.
    private static boolean validarCodigoCompanya(String codigo) {

        String patron = "^[A-Z]{2}$|^[A-Z][0-9]$";

        Pattern pattern = Pattern.compile(patron);

        Matcher matcher = pattern.matcher(codigo);

        return matcher.matches();
    }

    // Método para validar que el código de la compañía esté bien.
    private static boolean validarCodigoVuelo(String codigoVuelo) {

        String patron = "^[A-Z]{2}[0-9]{1,4}$|^[A-Z][0-9][0-9]{1,4}$";

        Pattern pattern = Pattern.compile(patron);

        Matcher matcher = pattern.matcher(codigoVuelo);

        return matcher.matches();
    }

    private static boolean validarTelefono(String telefono) {
        // Expresión regular para el formato del teléfono
        String valTel = "\\+\\d{3}\\d{1,12}";


        if (telefono.matches(valTel)) {
            return true; // El teléfono es válido
        } else {
            JOptionPane.showMessageDialog(null, "El teléfono no es válido. Debe seguir el formato: +1231234567890", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // El teléfono no es válido
        }
    }

}
