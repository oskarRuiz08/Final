/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc.edu.main;

import jdc.edu.controller.NotacionPolacaControlador;
import jdc.edu.modelo.NotacionPolacaModelo;
import jdc.edu.vista.NotacionPolacaVista;

/**
 *
 * @author osqui
 */
public class Main {
    public static void main(String[] args) {
        NotacionPolacaModelo modelo = new NotacionPolacaModelo();
        NotacionPolacaVista vista = new NotacionPolacaVista();
        NotacionPolacaControlador controlador = new NotacionPolacaControlador(modelo, vista);
    }
}
