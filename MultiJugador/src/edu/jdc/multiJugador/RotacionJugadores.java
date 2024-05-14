/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.multiJugador;
import java.util.Scanner;

/**
 *
 * @author osqui
 */
public class RotacionJugadores {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCircular listaJugadores = new ListaCircular();

        System.out.println("Ingrese el número de jugadores:");
        int numJugadores = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Ingrese el nombre del jugador " + (i + 1) + ":");
            String nombreJugador = scanner.nextLine();
            listaJugadores.agregarJugador(nombreJugador);
        }

        boolean repetir = true;

        while (repetir) {
            System.out.println("Ingrese el número de veces que desea realizar la rotación:");
            int numRotaciones = scanner.nextInt();

            // Rotación de jugadores
            System.out.println("\nRotación de jugadores:");
            for (int i = 0; i < numRotaciones; i++) {
                Jugador jugadorActual = listaJugadores.siguienteJugador();
                System.out.println("Es el turno de: " + jugadorActual.nombre);
            }

            System.out.println("\n¿Desea repetir el ciclo de rotación de jugadores? (Sí/No):");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("Sí") && !respuesta.equalsIgnoreCase("Si")) {
                repetir = false;
            }
        }

        scanner.close();
    }
}