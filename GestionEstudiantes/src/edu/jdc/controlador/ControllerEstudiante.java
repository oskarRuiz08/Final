
package edu.jdc.controlador;

import edu.jdc.modelo.ModeloEstudiantes.Estudiante;
import edu.jdc.vista.InterfazUsuarioConsola;

public class ControllerEstudiante {

    private Estudiante modelo;
    private InterfazUsuarioConsola vista;

    // Constructor
    public ControllerEstudiante(Estudiante modelo, InterfazUsuarioConsola vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setNombreEstudiante(String nombre) {
        modelo.setNombre(nombre);
    }

    public void setIdEstudiante(int id) {
        modelo.setId(id);
    }

    public String getNombreEstudiante() {
        return modelo.getNombre();
    }

    public int getIdEstudiante() {
        return modelo.getId();
    }

    public void actualizarVista() {
        vista.printDetallesEstudiante(modelo.getNombre(), String.valueOf(modelo.getId()));
    }
}