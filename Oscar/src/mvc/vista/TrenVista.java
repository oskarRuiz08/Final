
package mvc.vista;
//oscar ruiz ruiz 
import java.util.ArrayList;
import java.util.Scanner;


public class TrenVista {
        private Scanner scanner;

    public TrenVista() {
        scanner = new Scanner(System.in);
    }

    public int solicitarOpcion() {
        System.out.println("1. Agregar vagón");
        System.out.println("2. Desenganchar vagón");
        System.out.println("3. Mostrar tren");
        System.out.println("4. Salir");
        System.out.print("Ingrese su opción: ");
        return scanner.nextInt();
    }

    public int solicitarDato() {
        System.out.print("Ingrese el dato del nuevo vagón: ");
        return scanner.nextInt();
    }

    public void mostrarTren(ArrayList<Integer> vagones) {
        System.out.print("Tren: ");
        for (int vagon : vagones) {
            System.out.print(vagon + " ");
        }
        System.out.println();
    }
}
