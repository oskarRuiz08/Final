package edu.jdc.vista;

import edu.jdc.controlador.ControllerEstudiante;
import edu.jdc.modelo.ModeloEstudiantes.Estudiante;
import java.util.Scanner;

public class InterfazUsuarioConsola {
    private ControllerEstudiante controlador;
    private Scanner scanner;

    // Constructor
    public InterfazUsuarioConsola(ControllerEstudiante controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    // Método para mostrar el menú y manejar las opciones del usuario
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Actualizar Estudiante");
            System.out.println("3. Eliminar Estudiante");
            System.out.println("4. Ver Estudiante");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    actualizarEstudiante();
                    break;
                case 3:
                    eliminarEstudiante();
                    break;
                case 4:
                    verEstudiante();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    // Método para agregar un estudiante
    private void agregarEstudiante() {
        System.out.println("Agregar Estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        controlador.setNombreEstudiante(nombre);
        controlador.setIdEstudiante(id);
        controlador.actualizarVista();
        System.out.println("Estudiante agregado correctamente.");
    }

    // Método para actualizar un estudiante
    private void actualizarEstudiante() {
        System.out.println("Actualizar Estudiante:");
        System.out.print("Nuevo Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Nuevo ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        controlador.setNombreEstudiante(nombre);
        controlador.setIdEstudiante(id);
        controlador.actualizarVista();
        System.out.println("Estudiante actualizado correctamente.");
    }

    // Método para eliminar un estudiante
    private void eliminarEstudiante() {
        System.out.println("Eliminar Estudiante:");
        System.out.print("ID del Estudiante a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.println("Estudiante eliminado correctamente.");
    }

    // Método para ver un estudiante
    private void verEstudiante() {
        System.out.println("Ver Estudiante:");
       
    }

    public static void main(String[] args) {
        Estudiante modelo = new Estudiante("", 0); // Estudiante por defecto
        InterfazUsuarioConsola vista = new InterfazUsuarioConsola(controlador);
        ControllerEstudiante controlador = new ControllerEstudiante(modelo, vista);
        InterfazUsuarioConsola interfaz = new InterfazUsuarioConsola(controlador);
        interfaz.mostrarMenu();
    }

    public void printDetallesEstudiante(String nombre, String valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

   

