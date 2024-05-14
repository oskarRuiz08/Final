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
public class EstratoEstudiante {
    
    String[] nombreEstudiante=new String [7];
    int [] estratoEstudiante = new int [7];
    
    void pedirNombreYEstrato(){
        Scanner teclado= new Scanner(System.in);
        for (int i = 0; i < nombreEstudiante.length;i++ ){
            System.out.println("escribir nombre");
            String unNombreEmpleado = teclado.next();
            System.out.println("escribir estarto");
            int unEstratoEmpleado = teclado.nextInt();
            nombreEstudiante[i] = unNombreEmpleado;
            estratoEstudiante[i] = unEstratoEmpleado;
        }
    }
    public void mostrarEstudianteTres(){
        pedirNombreYEstrato();
        for(int i = 0; i< estratoEstudiante.length;i++){
            int elEstrato = estratoEstudiante[i];
            if(elEstrato==3){
                System.out.println("estudiante" +nombreEstudiante[i]+" es 3 ");
            }
        }
    }
}
