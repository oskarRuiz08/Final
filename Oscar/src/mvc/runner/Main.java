
package mvc.runner;
//oscar ruiz ruiz 
import mvc.controlador.TrenControlador;
import mvc.modelo.TrenModelo;
import mvc.vista.TrenVista;


public class Main {
      public static void main(String[] args) {
        TrenModelo modelo = new TrenModelo();
        TrenVista vista = new TrenVista();
        TrenControlador controlador = new TrenControlador(modelo, vista);

        controlador.ejecutar();
    }
}
