/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.vista;

import edu.jdc.controlador.HistorialNavegacion;
import edu.jdc.modelo.PaginaWeb;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author osqui
 */
public class VistaHistorial extends JFrame {

   private JButton botonRetroceder;
    private JButton botonAvanzar;
    private JButton botonAgregar;
    private JButton botonMostrar;
    private JTextField campoURL;
    private JTextArea areaHistorial;
    private HistorialNavegacion historial;

    public VistaHistorial(HistorialNavegacion historial) {
        this.historial = historial;

        setTitle("Gestor de Navegación de Historial Web");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        botonRetroceder = new JButton("Retroceder");
        botonAvanzar = new JButton("Avanzar");
        botonAgregar = new JButton("Agregar");
        botonMostrar = new JButton("Mostrar");
        campoURL = new JTextField(20);
        areaHistorial = new JTextArea(10, 20);

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonRetroceder);
        panelBotones.add(botonAvanzar);
        panelBotones.add(botonAgregar);
        panelBotones.add(botonMostrar);

        JPanel panelNavegacion = new JPanel();
        panelNavegacion.add(new JLabel("URL:"));
        panelNavegacion.add(campoURL);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(panelBotones, BorderLayout.NORTH);
        panelPrincipal.add(panelNavegacion, BorderLayout.CENTER);
        panelPrincipal.add(new JScrollPane(areaHistorial), BorderLayout.SOUTH);

        add(panelPrincipal);

        // Mostrar la página actual al iniciar
        mostrarPaginaActual();

        // Agregar listeners
        botonRetroceder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PaginaWeb pagina = historial.retroceder();
                if (pagina != null) {
                    mostrarPaginaActual();
                } else {
                    JOptionPane.showMessageDialog(VistaHistorial.this, "No hay más páginas hacia atrás.");
                }
            }
        });

        botonAvanzar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PaginaWeb pagina = historial.avanzar();
                if (pagina != null) {
                    mostrarPaginaActual();
                } else {
                    JOptionPane.showMessageDialog(VistaHistorial.this, "No hay más páginas hacia adelante.");
                }
            }
        });

        botonAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String url = campoURL.getText();
                if (!url.isEmpty()) {
                    historial.visitarPagina(new PaginaWeb(url, url)); // El título es la URL en este caso
                    mostrarPaginaActual();
                    campoURL.setText(""); // Limpiar el campo de texto después de visitar la página
                }
            }
        });

        botonMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarHistorial();
            }
        });

        setVisible(true);
    }

    private void mostrarPaginaActual() {
        PaginaWeb paginaActual = historial.getPaginaActual();
        if (paginaActual != null) {
            areaHistorial.setText("Página Actual: " + paginaActual.getTitulo() + " (" + paginaActual.getUrl() + ")\n");
        } else {
            areaHistorial.setText("No hay páginas visitadas.\n");
        }
    }

    private void mostrarHistorial() {
        StringBuilder historialStr = new StringBuilder("Historial de Navegación:\n");
        for (PaginaWeb pagina : historial.getHistorial()) {
            historialStr.append(pagina.getTitulo()).append(" (").append(pagina.getUrl()).append(")\n");
        }
        areaHistorial.setText(historialStr.toString());
    }
}
