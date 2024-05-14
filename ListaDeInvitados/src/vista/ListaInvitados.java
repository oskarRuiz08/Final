/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Invitado;
import modelo.Nodo;

/**
 *
 * @author osqui
 */
public class ListaInvitados {
 private Nodo cabeza;
    
    // Método para añadir un invitado a la lista
    public void agregarInvitado(Invitado invitado) {
        Nodo nuevoNodo = new Nodo(invitado);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }
    
    // Método para eliminar un invitado de la lista por número de tarjeta
    public void eliminarInvitado(int numeroTarjeta) {
        if (cabeza == null) {
            System.out.println("La lista de invitados está vacía.");
            return;
        }
        
        if (cabeza.invitado.numeroTarjeta == numeroTarjeta) {
            cabeza = cabeza.siguiente;
            return;
        }
        
        Nodo previo = cabeza;
        Nodo actual = cabeza.siguiente;
        
        while (actual != null && actual.invitado.numeroTarjeta != numeroTarjeta) {
            previo = actual;
            actual = actual.siguiente;
        }
        
        if (actual == null) {
            System.out.println("No se encontró un invitado con el número de tarjeta especificado.");
            return;
        }
        
        previo.siguiente = actual.siguiente;
    }
    
    // Método para actualizar los datos de un invitado por número de tarjeta
    public void actualizarInvitado(int numeroTarjeta, Invitado nuevoInvitado) {
        eliminarInvitado(numeroTarjeta);
        agregarInvitado(nuevoInvitado);
    }
    
    // Método para buscar un invitado por número de tarjeta
    public Invitado buscarPorNumeroTarjeta(int numeroTarjeta) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.invitado.numeroTarjeta == numeroTarjeta) {
                return actual.invitado;
            }
            actual = actual.siguiente;
        }
        return null;
    }
    
    // Método para imprimir la lista de invitados
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("Nombre: " + actual.invitado.nombre);
            System.out.println("Cedula: " + actual.invitado.cedula);
            System.out.println("Ciudad: " + actual.invitado.ciudad);
            System.out.println("Número de tarjeta: " + actual.invitado.numeroTarjeta);
            System.out.println("------------------------");
            actual = actual.siguiente;
        }
    }
}
