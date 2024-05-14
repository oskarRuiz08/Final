/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.main;

import edu.jdc.controlador.HistorialNavegacion;
import edu.jdc.vista.VistaHistorial;

/**
 *
 * @author osqui
 */
public class Programa {

    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();
        VistaHistorial vista = new VistaHistorial(historial);
    }
}
