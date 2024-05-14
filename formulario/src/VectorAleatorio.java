/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author osqui
 */
public class VectorAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // int[] vector= new int[100];
        //   for(int i =0;i<100 ;i++ ){
        //      vector [i] =i+1;
        //        System.out.println(vector[i]);

//    }  
        int numero = 0;
        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector ");
        numero = tec.nextInt();
        int[] vector = new int[numero];

        for (int i = 0; i < numero; i++) {
            vector[i] = i + 1;
            System.out.println(vector[i]);

        }

    }
    //public static void main(String[] args) {
    //		Agrupacion objeto=new Agrupacion(); 
    //		objeto.aproximacion();
    //	}
}