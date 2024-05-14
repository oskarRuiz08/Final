/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc;

import java.util.Scanner;
/**
 *
 * @author osqui
 */
public class jdcDos {
    int estrato;
    
    void pedirEstrato(){
        Scanner teclado=new Scanner(System.in);
        System.out.println ("EScribir estrato");
        estrato = teclado.nextInt();        
    }
    String ciudad, nombreCompleto;
    float estatura;
    double distancia;
    
    void pedirCiudad(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escribir Ciudad");
        ciudad=teclado.next();
        System.out.println("escriba su estatura");
        estatura=teclado.nextFloat();
        System.err.println("escriba la distancia");
        distancia=teclado.nextDouble();
        System.err.println("Escriba nombres y apelliudos");
        nombreCompleto= teclado.nextLine();
    }
    public class EstratoCliente{
        
        short estrato;
        void pedirEstrato(){
            Scanner teclado=new Scanner(System.in);
            estrato = teclado.nextShort();
        }
        
        void clasicarEstrato(){
            if(estrato<3){
                System.err.println("estrato bajo");
            }else{
                System.err.println("estrato alto");
            }
        }
               
        public void ejecutar(){
            pedirEstrato();
            clasicarEstrato();
        }
    }
}
