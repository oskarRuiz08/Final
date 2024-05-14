/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.vista;

import java.util.Scanner;

/**
 *
 * @author osqui
 */
public class view {

    private Scanner scanner;

    public void View() {
        scanner = new Scanner(System.in);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String getInput() {
        displayMessage("Ingrese una cadena de caracteres:");
        return scanner.nextLine();
    }

    public void displayResult(boolean balanced) {
        if (balanced) {
            displayMessage("Los paréntesis están correctamente balanceados.");
        } else {
            displayMessage("Los paréntesis no están balanceados.");
        }
    }
}
