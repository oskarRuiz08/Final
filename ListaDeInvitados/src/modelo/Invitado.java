/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author osqui
 */
public class Invitado {

   String nombre;
    int cedula;
    String ciudad;
    int numeroTarjeta;
    
    // Constructor
    public Invitado(String nombre, int cedula, String ciudad, int numeroTarjeta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.numeroTarjeta = numeroTarjeta;
    }
}
