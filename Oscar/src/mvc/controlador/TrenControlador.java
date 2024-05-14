
package mvc.controlador;
//oscar ruiz ruiz 
import mvc.modelo.TrenModelo;
import mvc.vista.TrenVista;


public class TrenControlador {
    private TrenModelo modelo;
    private TrenVista vista;

    public TrenControlador(TrenModelo modelo, TrenVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        boolean ejecutando = true;
        while (ejecutando) {
            int opcion = vista.solicitarOpcion();
            switch (opcion) {
                case 1:
                    int datoAgregar = vista.solicitarDato();
                    modelo.agregarVagon(datoAgregar);
                    break;
                case 2:
                    int datoDesenganchar = vista.solicitarDato();
                    modelo.desengancharVagon(datoDesenganchar);
                    break;
                case 3:
                    vista.mostrarTren(modelo.getVagones());
                    break;
                case 4:
                    ejecutando = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}



