/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc.edu.vista;

/**
 *
 * @author osqui
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotacionPolacaVista extends JFrame {

    private JTextField campoExpresion;
    private JButton botonEvaluar;
    private JLabel etiquetaResultado;

    public NotacionPolacaVista() {
        setTitle("Notación Polaca Inversa");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        campoExpresion = new JTextField(20);
        botonEvaluar = new JButton("Evaluar");
        etiquetaResultado = new JLabel();

        JPanel panelEntrada = new JPanel();
        panelEntrada.add(new JLabel("Expresión:"));
        panelEntrada.add(campoExpresion);

        JPanel panelBoton = new JPanel();
        panelBoton.add(botonEvaluar);

        JPanel panelResultado = new JPanel();
        panelResultado.add(new JLabel("Resultado:"));
        panelResultado.add(etiquetaResultado);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(3, 1));
        panelPrincipal.add(panelEntrada);
        panelPrincipal.add(panelBoton);
        panelPrincipal.add(panelResultado);

        add(panelPrincipal);

        setVisible(true);
    }

    public String getExpresion() {
        return campoExpresion.getText();
    }

    public void mostrarResultado(int resultado) {
        etiquetaResultado.setText(String.valueOf(resultado));
    }

    public void agregarListenerEvaluar(ActionListener listener) {
        botonEvaluar.addActionListener(listener);
    }
}
