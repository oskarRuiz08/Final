package edu.jdc.interfaces;

import javax.swing.DefaultListModel;
/**
 *
 * @author ANDRES
 */
public interface Obligatorio {
    public void agregarElemento(int posicion,int valor);
    public void imprimit(DefaultListModel<String> salida );
    public void crearAleatorio(int tamMin,int tamMax,int desde,int hasta);
    public void agregarElemento(int elValor);
    public void  eliminarElemento(DefaultListModel<String> salida );
    public void  vaciarArreglo();
}
