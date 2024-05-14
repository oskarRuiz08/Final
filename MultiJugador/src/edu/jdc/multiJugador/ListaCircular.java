/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.multiJugador;

/**
 *
 * @author osqui
 */
public class ListaCircular {
    class Nodo {
        Jugador jugador;
        Nodo siguiente;

        public Nodo(Jugador jugador) {
            this.jugador = jugador;
            this.siguiente = null;
        }
    }

    Nodo primero;
    Nodo ultimo;

    public ListaCircular() {
        primero = null;
        ultimo = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void agregarJugador(String nombre) {
        Jugador nuevoJugador = new Jugador(nombre);
        Nodo nuevoNodo = new Nodo(nuevoJugador);

        if (estaVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            ultimo.siguiente = primero; // Hacer que el último nodo apunte al primero en una lista circular
        } else {
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = primero;
            ultimo = nuevoNodo;
        }
    }

    public Jugador siguienteJugador() {
        if (!estaVacia()) {
            Nodo temp = primero;
            primero = primero.siguiente; // Mover el primer nodo al siguiente nodo
            ultimo = temp; // El último nodo ahora será el primer nodo original
            return temp.jugador;
        }
        return null;
    }
    public void rotarLista() {
        if (!estaVacia()) {
            primero = primero.siguiente; // Mover el primer nodo al siguiente nodo
            ultimo = ultimo.siguiente; // Mover el último nodo al siguiente nodo
        }
    }
}
