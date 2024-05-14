
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*oscar fernaod ruiz ruiz
fecha:06/03/2023
descripcion:vector llenado por JOptiopn
 */
/**
 * i
 *
 * @author osqui
 */
public class RecoridoVector {

    public static void main(String[] args) {
        int vector[] = new int[5];
        String mostrar = "";

        for (int i = 0; i < 5; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(" ingrese un numero para la posicion " + i));
        }
        for (int i = 0; i < 5; i++) {
            JOptionPane.showConfirmDialog(null, vector[i]);
        }

        for (int i = 0; i < 5; i++) {
            mostrar = mostrar + vector[i];
        }

        JOptionPane.showMessageDialog(null, mostrar);
    }
}
