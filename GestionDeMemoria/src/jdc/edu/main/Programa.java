/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc.edu.main;

import jdc.edu.controlador.MemoriaControlador;
import jdc.edu.controlador.MemoriaModelo;
import jdc.edu.vista.MemoriaVista;

/**
 *
 * @author osqui
 */
public class Programa {
  public static void main(String[] args) {
       MemoriaModelo modelo = new MemoriaModelo();
        MemoriaVista vista = new MemoriaVista();
        MemoriaControlador controlador = new MemoriaControlador(modelo, vista);
    }
}
