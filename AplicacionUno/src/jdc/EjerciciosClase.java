/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author osqui
 */
public class EjerciciosClase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena en mayúsculas: ");
        String mayusculas = scanner.nextLine();

        String minusculas = mayusculas.toLowerCase();
        System.out.println("La cadena en minúsculas es: " + minusculas);
    }

    public void tangen() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        double valor = scanner.nextDouble();

        double tangente = Math.tan(valor);
        System.out.println("La tangente de " + valor + " es: " + tangente);

    }

    public void arry() {
        int[] numeros = {5, 2, 8, 1, 9, 4};

        Arrays.sort(numeros);

        for (int i = 0;
                i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }

    public class SumaMultiplos {

        public static void main(String[] args) {
            int suma = 0;

            for (int i = 1; i <= 1000; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    suma += i;
                }
            }

            System.out.println("La suma de los múltiplos de 3 y 5 entre 1 y 1000 es: " + suma);
        }
    }

    public class pruvascodigos {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Ingrese un texto: ");
            String texto = input.nextLine();

            int contadorVocales = 0;
            for (int i = 0; i < texto.length(); i++) {
                char letra = texto.charAt(i);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
                        || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                    contadorVocales++;
                }
            }

            System.out.println("La cantidad de vocales en el texto es: " + contadorVocales);

        }
    }

    public class NumeroPrimo {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int numero;
            char respuesta;
            boolean esPrimo;

            do {
                System.out.print("Ingrese un número: ");
                numero = input.nextInt();
                esPrimo = true;

                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (numero < 2) {
                    esPrimo = false;
                }

                if (esPrimo) {
                    System.out.println(numero + " es primo.");
                } else {
                    System.out.println(numero + " no es primo.");
                }

                System.out.print("¿Desea verificar otro número? (s/n): ");
                respuesta = input.next().charAt(0);
            } while (respuesta == 's' || respuesta == 'S');
        }
    }
    
}
