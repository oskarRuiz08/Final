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
public class TareaHoroscopo {
    
    String signoZoodialcal="";
    
    void pedirDatos(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escriba su signo zoodialcal:");
        signoZoodialcal=teclado.nextLine();
    }
     
    void procesarDatos(){
        signoZoodialcal = signoZoodialcal.trim();
        signoZoodialcal = signoZoodialcal.toLowerCase();
    }
    
    void mostrarMensaje(){
        System.out.println("Tu horoscopo es");
        switch(signoZoodialcal){
            case " aries ":
                System.out.println("te saldra oportunidad");
                break;
                case" picis ":
                    System.out.println("te llamaran al cel");
                break;
                case"tauro":
                    System.out.println("encontraras dinero ");
                break;
                default:
                    System.out.println("signo no existe");
        }
    }
}
