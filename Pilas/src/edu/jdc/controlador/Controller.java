/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.controlador;

import edu.jdc.modelo.Model;
import javax.swing.text.View;

/**
 *
 * @author osqui
 */
public class Controller {

     private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void checkParentheses() {
        String input = view.getInput();
        boolean balanced = model.areParenthesesBalanced(input);
        view.displayResult(balanced);
    }
}