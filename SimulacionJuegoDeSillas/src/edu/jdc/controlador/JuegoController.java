/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.controlador;

import edu.jdc.modelo.Silla;
import edu.jdc.vista.InterfazUsuario;
import java.util.Random;

/**
 *
 * @author osqui
 */
public class JuegoController {

    private Silla[] sillas;
    private InterfazUsuario vista;

    public JuegoController(int numSillas) {
        sillas = new Silla[numSillas];
        vista = new InterfazUsuario();

        // Inicializar las sillas
        for (int i = 0; i < numSillas; i++) {
            sillas[i] = new Silla("continua");
        }
    }

    public void simularMusica() {
        Random rand = new Random();
        int movimientos = rand.nextInt(100);

        // Realizar movimientos aleatorios
        for (int i = 0; i < movimientos; i++) {
            Silla temp = sillas[0];
            for (int j = 0; j < sillas.length - 1; j++) {
                sillas[j] = sillas[j + 1];
            }
            sillas[sillas.length - 1] = temp;
        }
    }

    public void ocuparSilla() {
        sillas[0].estado = "eliminado";
        Silla[] nuevasSillas = new Silla[sillas.length - 1];
        System.arraycopy(sillas, 1, nuevasSillas, 0, nuevasSillas.length);
        sillas = nuevasSillas;
    }

    public boolean hayGanador() {
        return sillas.length == 1;
    }

    public void jugar() {
        int numJugadores = vista.obtenerNumeroJugadores();
        JuegoController juego = new JuegoController(numJugadores);
        Silla[] sillasOriginales = sillas.clone(); // Copia de las sillas originales

        while (!hayGanador()) {
            simularMusica();
            ocuparSilla();
            vista.mostrarMensaje("BIENVENIDO AL JUEGO DE LAS SILLAS");
            vista.mostrarMensaje("Estado del juego después de esta ronda:");
            for (Silla silla : sillasOriginales) {
                if (silla != null) {
                    vista.mostrarMensaje("Silla estado: " + silla.estado);
                }
            }
            vista.mostrarMensaje("");
        }
        vista.mostrarMensaje("¡El juego ha terminado! ¡El ganador es el último jugador!");
    }
}
