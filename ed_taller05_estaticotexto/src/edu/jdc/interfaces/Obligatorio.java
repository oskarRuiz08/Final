
package edu.jdc.interfaces;

import javax.swing.DefaultListModel;

public interface Obligatorio {
        public void agregarElemento(int posicion, String elvalor);

    public void imprimir(DefaultListModel<String> salida);

    public void crearAleatorio(int tamanoMin, int tamanoMax, int cantidadCaracteres);

    public void agregarElemento(String elvalor);

    public void eliminarElemento(DefaultListModel<String> salida);

    public void vaciarArreglo();
}
