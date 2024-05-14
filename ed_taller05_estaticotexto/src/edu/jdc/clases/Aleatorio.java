
package edu.jdc.clases;

import java.util.Random;


public class Aleatorio {
      public static int numerito(int inicio,int fin){
        int valor;
        Random aleator = new Random();
        valor= aleator.nextInt(inicio,fin+1);
        return valor;
                
    }
       public static double numeritoDoble(double inicio,double fin){
        double valor;
        Random aleator = new Random();
        valor= aleator.nextDouble(inicio,fin+1);
        return valor;
                
    }
       public static String textito(int cantidadCaracteres){
           char caracter;
           String cadenita, diccionario ;
           int i , posicion, limiteDiccionario ;
           cadenita="";
           diccionario="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
           limiteDiccionario=diccionario.length()-1;
           for ( i = 0; i < limiteDiccionario; i++) {
               posicion=numerito(0,limiteDiccionario);
               caracter=diccionario.charAt(posicion);
               cadenita=cadenita+caracter;
           }
          return cadenita;
           
       }
}
