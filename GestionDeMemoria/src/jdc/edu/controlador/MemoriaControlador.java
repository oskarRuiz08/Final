/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc.edu.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jdc.edu.modelo.Variable;
import jdc.edu.vista.MemoriaVista;

/**
 *
 * @author osqui
 */
public class MemoriaControlador {
 private MemoriaModelo modelo;
    private MemoriaVista vista;

    public MemoriaControlador(MemoriaModelo modelo, MemoriaVista vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.agregarListenerAsignar(new AsignarListener());
        this.vista.agregarListenerLiberar(new LiberarListener());

        actualizarVista();
    }

    class AsignarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String nombre = vista.getNombreVariable();
            int tamaño = vista.getTamañoVariable();
            modelo.asignarVariable(nombre, tamaño);
            actualizarVista();
        }
    }

    class LiberarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            modelo.liberarUltimaVariable();
            actualizarVista();
        }
    }

    private void actualizarVista() {
        vista.mostrarMemoria(modelo.getInicio());
    }
}
