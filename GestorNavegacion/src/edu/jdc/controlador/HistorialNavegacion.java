/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.controlador;

import edu.jdc.modelo.PaginaWeb;
import java.util.LinkedList;

/**
 *
 * @author osqui
 */
public class HistorialNavegacion {

   private LinkedList<PaginaWeb> historial;
    private int indiceActual;

    public HistorialNavegacion() {
        historial = new LinkedList<>();
        indiceActual = -1; // No hay páginas en el historial inicialmente
    }

    public void visitarPagina(PaginaWeb pagina) {
        // Eliminar las páginas que están adelante del índice actual
        while (indiceActual < historial.size() - 1) {
            historial.removeLast();
        }
        historial.add(pagina);
        indiceActual++;
    }

    public PaginaWeb retroceder() {
        if (indiceActual > 0) {
            indiceActual--;
            return historial.get(indiceActual);
        }
        return null; // No hay más páginas hacia atrás
    }

    public PaginaWeb avanzar() {
        if (indiceActual < historial.size() - 1) {
            indiceActual++;
            return historial.get(indiceActual);
        }
        return null; // No hay más páginas hacia adelante
    }

    public PaginaWeb getPaginaActual() {
        if (indiceActual >= 0 && indiceActual < historial.size()) {
            return historial.get(indiceActual);
        }
        return null;
    }

    public LinkedList<PaginaWeb> getHistorial() {
        return historial;
    }
}
