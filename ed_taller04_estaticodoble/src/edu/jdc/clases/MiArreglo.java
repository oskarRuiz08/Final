
package edu.jdc.clases;

import edu.jdc.interfaces.Obligatorio;
import javax.swing.DefaultListModel;


public class MiArreglo implements Obligatorio {
    private double arregloDobles[];

    public MiArreglo() {
        arregloDobles = new double[0];
    }

    public MiArreglo(int tamanio) {
        arregloDobles = new double[tamanio];
    }


    @Override
    public void agregarElemento(int posicion, double elvalor) {
         arregloDobles[posicion]=elvalor;
    }

    @Override
    public void imprimir(DefaultListModel<String> salida) {
       int i, tamanio;
        tamanio=arregloDobles.length;
        if (tamanio>0) {
            for (  i = 0; i < tamanio; i++) {
                salida.addElement("ARREGLO["+i+"]="+arregloDobles[i]);
            }
        } else {
            salida.addElement("ARREGLO VACIO");
        }
    }

    @Override
    public void crearAleatorio(int tamanoMin, int tamanoMax, int desde, int hasta) {
          int i, tamanio;
          double valor;
        tamanio= Aleatorio.numerito(tamanoMin, tamanoMax);
        arregloDobles = new double[tamanio];
        for (  i = 0;i < tamanio; i++) {
            valor=Aleatorio.numeritoDoble(desde, hasta);
            arregloDobles[i]=valor;
        }
        
    }

    @Override
    public void agregarElemento(double elvalor) {
    int i, tamanio;
    double arregloTemporal[];
        tamanio = arregloDobles.length;
        arregloTemporal = arregloDobles;
        arregloDobles = new double[tamanio + 1];
        for (i = 0; i < tamanio; i++) {
            arregloDobles[i] = arregloTemporal[i];
        }
        arregloDobles[tamanio] = elvalor;
    }

    @Override
    public void eliminarElemento(DefaultListModel<String> salida) {
       int i, tamanio, nuevoLimite;
        double arregloTemporal[];
        tamanio = arregloDobles.length;
        if (tamanio == 0) {
            salida.addElement("No hay elemenos");
        } else {
            arregloTemporal = arregloDobles;
            nuevoLimite = tamanio - 1;
            arregloDobles = new double[nuevoLimite];
            for (i = 0; i < nuevoLimite; i++) {
                arregloDobles[i] = arregloTemporal[i];          
            }
            salida.addElement("El elemento ha sido borrado, por favor imprimir");
        }
    }

    @Override
    public void vaciarArreglo() {
       arregloDobles = new double[0];
    }
    
    
}
