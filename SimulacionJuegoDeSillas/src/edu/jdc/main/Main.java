/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.main;

import edu.jdc.controlador.JuegoController;
import edu.jdc.vista.InterfazUsuario;

/**
 *
 * @author osqui
 */
public class Main {

    public static void main(String[] args) {
        int numSillas = 10; // Número inicial de sillas (y jugadores)

        JuegoController juego = new JuegoController(numSillas);
        juego.jugar();
    }

}
