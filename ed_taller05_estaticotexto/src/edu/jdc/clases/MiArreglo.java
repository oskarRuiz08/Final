
package edu.jdc.clases;

import edu.jdc.interfaces.Obligatorio;
import javax.swing.DefaultListModel;

public class MiArreglo implements Obligatorio {
      private String arregloTexto[];
        public MiArreglo(int tamanio) {
        arregloTexto = new String[tamanio];
    }

    @Override
    public void agregarElemento(int posicion, String elvalor) {
            arregloTexto[posicion]=elvalor;
    }

    @Override
    public void imprimir(DefaultListModel<String> salida) {
        int i, tamanio;
        tamanio=arregloTexto.length;
        if (tamanio>0) {
            for (  i = 0; i < tamanio; i++) {
                salida.addElement("ARREGLO["+i+"]="+arregloTexto[i]);
            }
        } else {
            salida.addElement("ARREGLO VACIO");
        }
    }

    @Override
    public void crearAleatorio(int tamanoMin, int tamanoMax, int cantidadCaracteres) {
               int i, tamanio;
               String cadenita;
        tamanio= Aleatorio.numerito(tamanoMin, tamanoMax);
        arregloTexto = new String[tamanio];
        for (  i = 0;i < tamanio; i++) {
            cadenita=Aleatorio.textito(cantidadCaracteres);
            arregloTexto[i]=cadenita;
        }
    }

    @Override
    public void agregarElemento(String elvalor) {
    int i, tamanio;
    String arregloTemporal[];
        tamanio = arregloTexto.length;
        arregloTemporal = arregloTexto;
        arregloTexto = new String[tamanio + 1];
        for (i = 0; i < tamanio; i++) {
            arregloTexto[i] = arregloTemporal[i];
        }
        arregloTexto[tamanio] = elvalor;
    }

    @Override
    public void eliminarElemento(DefaultListModel<String> salida) {
       int i, tamanio, nuevoLimite;
        String arregloTemporal[];
        tamanio = arregloTexto.length;
        if (tamanio == 0) {
            salida.addElement("No hay elemenos");
        } else {
            arregloTemporal = arregloTexto;
            nuevoLimite = tamanio - 1;
            arregloTexto = new String[nuevoLimite];
            for (i = 0; i < nuevoLimite; i++) {
                arregloTexto[i] = arregloTemporal[i];          
            }
            salida.addElement("El elemento ha sido borrado, por favor imprimir");
        }
    }

    @Override
    public void vaciarArreglo() {
              arregloTexto = new String[0];
    }
}

