/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import modelo.Invitado;
import vista.ListaInvitados;

/**
 *
 * @author osqui
 */
public class Controlador {

    private ListaInvitados listaInvitados;
    private Scanner scanner;

    public Controlador() {
        listaInvitados = new ListaInvitados();
        scanner = new Scanner(System.in);
    }

    public void manejoRegistro() {
        boolean ingresarNuevos = true;
        while (ingresarNuevos) {
            System.out.println("ingrese el nombre del invitado");
            String nombre = scanner.nextLine();

            System.out.println("ingrese el numero de cedula");
            int cedula = scanner.nextInt();
            scanner.nextLine();

            System.out.println("ingrese la ciudad del donde vieene el invitado");
            String ciudad = scanner.nextLine();

            System.out.println("ingrese el numero de targeta recibido");
            int numeroTarjeta = scanner.nextInt();
            scanner.nextLine();

            Invitado nuevoInvitado = new Invitado(nombre, cedula, ciudad, numeroTarjeta);
            listaInvitados.agregarInvitado(nuevoInvitado);

            System.out.println("desea ingresar nuevos invitados si/no");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("SI")) {
                ingresarNuevos = false;
                System.err.println("Muchas gracias por indicarnos su decicion");
            }
        }
    }
}
