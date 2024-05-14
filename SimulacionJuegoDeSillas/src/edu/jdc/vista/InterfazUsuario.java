/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.vista;

import java.util.Scanner;

/**
 *
 * @author osqui
 */
public class InterfazUsuario {

   public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int obtenerNumeroJugadores() {
        Scanner scanner = new Scanner(System.in);
        int numJugadores;
        do {
            mostrarMensaje("Ingresa el número de jugadores (debe ser mayor que 1): ");
            while (!scanner.hasNextInt()) {
                mostrarMensaje("Por favor, ingresa un número válido.");
                scanner.next();
            }
            numJugadores = scanner.nextInt();
        } while (numJugadores <= 1);
        return numJugadores;
    }
}

