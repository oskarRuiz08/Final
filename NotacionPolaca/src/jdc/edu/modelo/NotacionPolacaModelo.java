/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc.edu.modelo;

/**
 *
 * @author osqui
 */
public class NotacionPolacaModelo {

    private Pila pila;

    public NotacionPolacaModelo() {
        this.pila = new Pila();
    }

    public int evaluarExpresion(String expresion) {
        String[] tokens = expresion.split(" ");
        for (String token : tokens) {
            if (esNumero(token)) {
                pila.apilar(Integer.parseInt(token));
            } else {
                int segundoOperando = pila.desapilar();
                int primerOperando = pila.desapilar();
                int resultado = operar(token, primerOperando, segundoOperando);
                pila.apilar(resultado);
            }
        }
        return pila.desapilar();
    }

    private boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private int operar(String operador, int a, int b) {
        switch (operador) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("División por cero");
                }
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}
