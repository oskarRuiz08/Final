/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc.edu.controller;

/**
 *
 * @author osqui
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import jdc.edu.modelo.NotacionPolacaModelo;
import jdc.edu.vista.NotacionPolacaVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotacionPolacaControlador {
    private NotacionPolacaModelo modelo;
    private NotacionPolacaVista vista;

    public NotacionPolacaControlador(NotacionPolacaModelo modelo, NotacionPolacaVista vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.agregarListenerEvaluar(new EvaluarListener());
    }

    class EvaluarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String expresion = vista.getExpresion();
            try {
                int resultado = modelo.evaluarExpresion(expresion);
                vista.mostrarResultado(resultado);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
