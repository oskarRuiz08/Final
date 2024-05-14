
package modelo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ListaTareas listaTareas = new ListaTareas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Completar Tarea");
            System.out.println("3. Mostrar Lista de Tareas");
            System.out.println("4. Eliminar Tarea");
            System.out.println("5. Contar Tareas Pendientes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea a agregar: ");
                    String nuevaTarea = scanner.nextLine();
                    listaTareas.agregarTarea(nuevaTarea);
                    break;
                case 2:
                    System.out.print("Ingrese la tarea a marcar como completa: ");
                    String tareaCompleta = scanner.nextLine();
                    listaTareas.completarTarea(tareaCompleta);
                    break;
                case 3:
                    listaTareas.listaTareas();
                    break;
                case 4:
                    System.out.print("Ingrese la tarea a eliminar: ");
                    String tareaEliminar = scanner.nextLine();
                    listaTareas.eliminarTarea(tareaEliminar);
                    break;
                case 5:
                    int pendientes = listaTareas.contarTareasPendientes();
                    System.out.println("Número de tareas pendientes: " + pendientes);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
