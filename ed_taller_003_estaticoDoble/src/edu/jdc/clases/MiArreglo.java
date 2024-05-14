package edu.jdc.clases;

import edu.jdc.interfaces.Obligatorio;
import javax.swing.DefaultListModel;

/**
 *
 * @author ANDRES
 */
public class MiArreglo implements Obligatorio {

    private int[] arregloEnteros;

    public MiArreglo() {
        arregloEnteros = new int[0];
    }

    public MiArreglo(int canti) {
        arregloEnteros = new int[canti];
    }

    @Override
    public void agregarElemento(int posicion, int valor) {
        arregloEnteros[posicion] = valor;
    }

    @Override
    public void imprimit(DefaultListModel<String> salida) {
        int i, tamanio;
        tamanio = arregloEnteros.length;
        if (tamanio > 0) {
            for (i = 0; i < tamanio; i++) {
                salida.addElement("arreglo[" + i + "]=" + arregloEnteros[i]);
            }
        } else {
            salida.addElement("que pasa no hay nada de nada ");
        }
    }

    @Override
    public void crearAleatorio(int tamMin, int tamMax, int desde, int hasta) {
        int i, tamanio, valor;
        tamanio = Aleatorio.numerito(tamMin, tamMax);
        arregloEnteros = new int[tamanio];
        for (i = 0; i < tamanio; i++) {
            valor = Aleatorio.numerito(desde, hasta);
            arregloEnteros[i] = valor;

        }
    }

    @Override
    public void agregarElemento(int elValor) {
        int i, tamanio, arregloTemporal[];
        tamanio = arregloEnteros.length;
        arregloTemporal = arregloEnteros;
        arregloEnteros = new int[tamanio + 1];
        for (i = 0; i < tamanio; i++) {
            arregloEnteros[i] = arregloTemporal[i];
        }
        arregloEnteros[tamanio] = elValor;
    }

    @Override
    public void eliminarElemento(DefaultListModel<String> salida) {
        int i, tamanio, nuevoLimite, arregloTemporal[];
        tamanio = arregloEnteros.length;
        if (tamanio == 0) {
            salida.addElement("no hay nada para borrar");
        } else {
            arregloTemporal = arregloEnteros;
            nuevoLimite = tamanio - 1;
            arregloEnteros = new int[nuevoLimite];
            for (i = 0; i < nuevoLimite; i++) {
                arregloEnteros[i] = arregloTemporal[i];
            }
            salida.addElement("se elimino un elemento ");
        }
    }

    @Override
    public void vaciarArreglo() {
        arregloEnteros = new int[0];

    }

}
