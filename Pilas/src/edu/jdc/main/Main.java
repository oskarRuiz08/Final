/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.main;

import edu.jdc.controlador.Controller;
import edu.jdc.modelo.Model;
import edu.jdc.vista.view;
import javax.swing.text.View;

/**
 *
 * @author osqui
 */
public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.checkParentheses();
    }
}
