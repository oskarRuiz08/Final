
package modelo;

   public class ListaTareas {
    Nodo cabeza;

    public ListaTareas() {
        this.cabeza = null;
    }

    public void agregarTarea(String tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    public void completarTarea(String tarea) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.tarea.equals(tarea)) {
                temp.completada = true;
                System.out.println("Tarea marcada como completa: " + tarea);
                return;
            }
            temp = temp.siguiente;
        }
        System.out.println("La tarea no existe en la lista.");
    }

    public void listaTareas() {
        System.out.println("Lista de Tareas:");
        Nodo temp = cabeza;
        while (temp != null) {
            String estado = temp.completada ? "Completa" : "Pendiente";
            System.out.println(temp.tarea + " - " + estado);
            temp = temp.siguiente;
        }
    }

    public void eliminarTarea(String tarea) {
        if (cabeza == null) {
            System.out.println("La lista de tareas está vacía.");
            return;
        }

        if (cabeza.tarea.equals(tarea)) {
            cabeza = cabeza.siguiente;
            System.out.println("Tarea eliminada: " + tarea);
            return;
        }

        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.siguiente.tarea.equals(tarea)) {
                temp.siguiente = temp.siguiente.siguiente;
                System.out.println("Tarea eliminada: " + tarea);
                return;
            }
            temp = temp.siguiente;
        }

        System.out.println("La tarea no existe en la lista.");
    }

    public int contarTareasPendientes() {
        int contador = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            if (!temp.completada) {
                contador++;
            }
            temp = temp.siguiente;
        }
        return contador;
    }
}
 