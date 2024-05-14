/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author osqui
 */
public class Nodo {

   public Invitado invitado;
   public Nodo siguiente;

    // Constructor
    public Nodo(Invitado invitado) {
        this.invitado = invitado;
        this.siguiente = null;
    }
}
