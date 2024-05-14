/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc.edu.modelo;

/**
 *
 * @author osqui
 */
public class Pila {

    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void apilar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cima);
            cima = nuevoNodo;
        }
    }

    public int desapilar() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        int valor = cima.getValor();
        cima = cima.getSiguiente();
        return valor;
    }
}
