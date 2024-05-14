/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc;

/**
 *
 * @author osqui
 */
public class AtributosYMetodos {
    String nombre="oscar fernador ruiz ruiz ";
    short edad =20;
    int poblacion = 1_200_000;
    long enteroLargo = 200_045__320_202l;
    char vocal = 'k';
    float altura =1_500.253f;
    double distancia = 194_000_200_230.0000494;
    boolean esNoche = false;
    
    void mostrarVariables(){
        System.out.println("Nombre:            "+nombre);
        System.out.println("Edad:              "+edad);
        System.out.println("Poblacion          "+poblacion);
        System.out.println("Entero Largo       "+enteroLargo);
        System.out.println("Vocal              "+vocal);
        System.out.println("Altura             "+altura);
        System.out.println("Distancia          "+distancia);
        System.out.println("Es de noche?       "+esNoche);
    }  
    
  void dividirDosNumeros(){
      float numero220f;
      float valor=12;
      float numero = 0;
      float resultado = numero / valor;
      System.out.println("resultado"+resultado);
  }
  void multiplicarDosNumeros(int catidad, int precio){
      int total = precio * catidad;
      System.out.println("total"+total);
  }
  int restarDosNumeros(int cotizacion,int presupuesto){
      int respuesta = cotizacion - presupuesto;
      return respuesta;       
  }
    double sumarDosNumeros(double poblacion, double  dato){
       double salida=poblacion+dato;
       return salida;
    }
    void mostrarSumaryRestar(){
       int resta = restarDosNumeros(50,23);
       double suma = sumarDosNumeros(89.29,233.022);
       System.out.println("La resta da = "+resta);
       System.out.println("La suma es= "+suma);
       
    }
    
}
