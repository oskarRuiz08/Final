/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc;

import java.util.Scanner;

public class pruvascodigos {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio de la base: ");
        double radio = scanner.nextDouble();

        System.out.println("Ingrese la altura del sólido: ");
        double altura = scanner.nextDouble();

        double volumen = Math.PI * radio * radio * altura;

        System.out.println("El volumen del sólido de revolución es " + volumen);
    }
}
