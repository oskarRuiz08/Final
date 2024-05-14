/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc.edu.controlador;

import jdc.edu.modelo.Variable;

/**
 *
 * @author osqui
 */
public class MemoriaModelo {

    private Variable inicio;
    private Variable fin;

    public MemoriaModelo() {
        inicio = null;
        fin = null;
    }

    public void asignarVariable(String nombre, int tamaño) {
        Variable nuevaVariable = new Variable(nombre, tamaño);
        if (inicio == null) {
            inicio = nuevaVariable;
            fin = nuevaVariable;
        } else {
            nuevaVariable.setAnterior(fin);
            fin.setSiguiente(nuevaVariable);
            fin = nuevaVariable;
        }
    }

    public void liberarUltimaVariable() {
        if (fin != null) {
            fin = fin.getAnterior();
            if (fin != null) {
                fin.setSiguiente(null);
            } else {
                inicio = null; // No hay más variables en la memoria
            }
        }
    }

    public Variable getInicio() {
        return inicio;
    }
}
