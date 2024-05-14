
package modelo;

import java.util.Scanner;

 public class Nodo {
    String tarea;
    boolean completada;
    Nodo siguiente;

    public Nodo(String tarea) {
        this.tarea = tarea;
        this.completada = false; // Por defecto, la tarea se agrega como pendiente
        this.siguiente = null;
    }
}