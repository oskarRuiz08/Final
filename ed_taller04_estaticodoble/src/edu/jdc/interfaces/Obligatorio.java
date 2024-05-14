
package edu.jdc.interfaces;

import javax.swing.DefaultListModel;


public interface Obligatorio {
    
    public void agregarElemento(int posicion, double elvalor);

    public void imprimir(DefaultListModel<String> salida);

    public void crearAleatorio(int tamanoMin, int tamanoMax, int desde, int hasta);

    public void agregarElemento(double elvalor);

    public void eliminarElemento(DefaultListModel<String> salida);

    public void vaciarArreglo();
}

