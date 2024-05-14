/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package modelo;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author osqui
 */
public class ConexionBD {
    
    public static Connection conexion;
    
    private ConexionBD() {
        try {
            String driveBD   ="com,mysql.jdbc.Driver";
            String urlBD     ="jdbc:mysql://localhost/SistemaEjemplo";
            String usuarioBD ="root";
            Class.forName(driverBD);
            conexion = DriveManager.getConnection(urLBD, usuarioBD, claveBD);
        } catch(ClassnotFoundException ex){
          System.err.println("no encuentro el driver: "+ex.getMessage());
        }catch (SQLException ex){
            System.err.print("Error al conectarme: "+ex.getMessage());            
        }
    }
    
    public static ConexionBD getInstance() {
        return ConexionBDHolder.INSTANCE;
    }
    
    private static class ConexionBDHolder {

        private static final ConexionBD INSTANCE = new ConexionBD();
    }

    private static class ClassnotFoundException {

        public ClassnotFoundException() {
        }
    }
}
