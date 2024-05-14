package edu.jdc.formularios;

import com.formdev.flatlaf.FlatDarkLaf;
import edu.jdc.clases.MiArreglo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame {

    private MiArreglo miArreglito;
    private static final long serialVersionUID = 1L;
    private final DefaultListModel<String> miModelito = new DefaultListModel<>();

    public FrmPrincipal() {
        initComponents();
        addWindowListener(
                new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cerrarVentana();
            }
        }
        );
        listaSalida.setModel(miModelito);
    }

    private void cerrarVentana() {
        String[] textos = {"SI", "NO"};
        int opcion = JOptionPane.showOptionDialog(panelSalida, "¿Esta seguro de salir?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, textos, textos[0]);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelOpcion = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnAleatorio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgFinal = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        panelResultados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelSalida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSalida = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTitulo.setBackground(new java.awt.Color(255, 255, 0));

        lblTitulo.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        lblTitulo.setText("Taller Entregar");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitulo)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        panelOpcion.setBackground(new java.awt.Color(204, 0, 0));

        btnCrear.setText("Crear Arreglo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnAleatorio.setText("Crear Aleatorio");
        btnAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAleatorioActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAgFinal.setText("Agregar Final");
        btnAgFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgFinalActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar Final");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnVaciar.setText("Vaciar Arreglo");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionLayout = new javax.swing.GroupLayout(panelOpcion);
        panelOpcion.setLayout(panelOpcionLayout);
        panelOpcionLayout.setHorizontalGroup(
            panelOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelOpcionLayout.setVerticalGroup(
            panelOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimir)
                .addGap(18, 18, 18)
                .addComponent(btnAleatorio)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(18, 18, 18)
                .addComponent(btnAgFinal)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar)
                .addGap(18, 18, 18)
                .addComponent(btnVaciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelResultados.setBackground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setText("Resultados");

        javax.swing.GroupLayout panelResultadosLayout = new javax.swing.GroupLayout(panelResultados);
        panelResultados.setLayout(panelResultadosLayout);
        panelResultadosLayout.setHorizontalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelResultadosLayout.setVerticalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        panelSalida.setBackground(new java.awt.Color(0, 51, 255));

        jScrollPane1.setViewportView(listaSalida);

        javax.swing.GroupLayout panelSalidaLayout = new javax.swing.GroupLayout(panelSalida);
        panelSalida.setLayout(panelSalidaLayout);
        panelSalidaLayout.setHorizontalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSalidaLayout.setVerticalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarVentana();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String cantiTexto = JOptionPane.showInputDialog(null, "¿Cuantos elementos?", "TAMAÑO", JOptionPane.INFORMATION_MESSAGE);
        if (cantiTexto != null) {
            try {
                int i, cantidad;
                cantidad = Integer.parseInt(cantiTexto);
                miArreglito = new MiArreglo(cantidad);
                miModelito.clear();
                for (i = 0; i < cantidad; i++) {
                    String datoTexto = JOptionPane.showInputDialog(null, "¿INGRESA EL NUMERO?", "NUMERO", JOptionPane.INFORMATION_MESSAGE);
                    if (datoTexto == null) {
                        miModelito.addElement("uhm, vemos");
                        i = cantidad;
                    } else {
                        try {
                            Double valorcito = Double.parseDouble(datoTexto);
                            miArreglito.agregarElemento(i, valorcito);
                        } catch (NumberFormatException error) {
                            JOptionPane.showMessageDialog(null, "SOLO DEBES COLOCAR NUMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
                            i--;
                        }
                    }
                }
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "SOLO DEBES COLOCAR NUMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        miModelito.clear();
        if (miArreglito == null) {
            miModelito.addElement("No hay arreglo");
        } else {
            miArreglito.imprimir(miModelito);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatorioActionPerformed
        miModelito.clear();
        miArreglito = new MiArreglo(0);
        miArreglito.crearAleatorio(5, 10, 100, 200);
        miModelito.addElement("listo arreglo aleatorio");
    }//GEN-LAST:event_btnAleatorioActionPerformed

    private void btnAgFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgFinalActionPerformed
        String datoValor = JOptionPane.showInputDialog(null, "Agregar  número", "uyyyyy", JOptionPane.QUESTION_MESSAGE);
        try {
            if (miArreglito == null) {
                miModelito.addElement("No existe");
                miArreglito = new MiArreglo(0);
            } else {
                Double valorcito = Double.parseDouble(datoValor);
                miArreglito.agregarElemento(valorcito);
                miModelito.clear();
                miModelito.addElement("Los datos han sido guardados puede ir a imprimir");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Pailas", "nooooo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAgFinalActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (miArreglito == null) {
            miModelito.addElement("No hay arreglo");
        } else {
            miModelito.clear();
            miModelito.addElement("El elemento ha sido eliminado");
            miArreglito.eliminarElemento(miModelito);

        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        miArreglito.vaciarArreglo();
        miModelito.clear();
        miModelito.addElement("El arreglo se ha vaciado");
    }//GEN-LAST:event_btnVaciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgFinal;
    private javax.swing.JButton btnAleatorio;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> listaSalida;
    private javax.swing.JPanel panelOpcion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelResultados;
    private javax.swing.JPanel panelSalida;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
