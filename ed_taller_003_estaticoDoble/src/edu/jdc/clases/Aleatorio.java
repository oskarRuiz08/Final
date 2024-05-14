
package edu.jdc.clases;

import java.util.Random;

/**
 *
 * @author ANDRES
 */
public class Aleatorio {
    public static  int numerito(int inicio,int fin){
        Random ale = new Random();
        int valor = ale.nextInt(inicio,fin+1);
        return valor ;  
    }
}
