/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import Dominio.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author tomas
 */
public class VentanaGenerarPagina extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaGenerarPagina.class.getName());
    private Sistema modelo;
    private String rutaGenerada = "";
    
    
    /**
     * Creates new form VentanaGenerarPagina
     * @param unSistema
     */
    public VentanaGenerarPagina(Sistema unSistema) {
        this.modelo = unSistema;
        initComponents();
        btnAbrir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelUbicacion = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        textFieldUbicacion = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        btnExaminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 300));
        setResizable(false);

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setToolTipText("");

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitulo.setText("Generar Página Web");

        labelNombre.setText("Nombre del Archivo:");

        labelUbicacion.setText("Ubicacion del Archivo:");

        btnAbrir.setBackground(new java.awt.Color(241, 255, 236));
        btnAbrir.setForeground(new java.awt.Color(4, 101, 4));
        btnAbrir.setText("Abrir Página");
        btnAbrir.addActionListener(this::btnAbrirActionPerformed);

        btnGenerar.setBackground(new java.awt.Color(241, 255, 236));
        btnGenerar.setForeground(new java.awt.Color(4, 101, 4));
        btnGenerar.setText("Generar Página");
        btnGenerar.addActionListener(this::btnGenerarActionPerformed);

        btnExaminar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnExaminar.setText("Examinar...");
        btnExaminar.addActionListener(this::btnExaminarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUbicacion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExaminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnGenerar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(labelUbicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        try {
            File archivo = new File(rutaGenerada);
            Desktop.getDesktop().open(archivo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "No se pudo abrir el navegador. error de excepción", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String nombre = textFieldNombre.getText().trim();
        String ubicacion = textFieldUbicacion.getText().trim();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre para el archivo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            // si el usuario no escribió ".html" al final, se lo agrega
            if (!nombre.toLowerCase().endsWith(".html")) {
                nombre = nombre + ".html";
            }

            // Si no indicó ubicación, queda directo en la carpeta del proyecto; si indicó, armamos la ruta completa
            String rutaFinal;
            if (ubicacion.isEmpty()) {
                rutaFinal = nombre;
            } else {
                rutaFinal = new File(ubicacion, nombre).getPath();
            }

            try {
                modelo.generarPaginaHtml(rutaFinal);
                rutaGenerada = rutaFinal;
                btnAbrir.setEnabled(true);
                JOptionPane.showMessageDialog(this, "Página generada correctamente: " + rutaFinal, "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "No se pudo crear el archivo en la ubicación indicada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        JFileChooser selec = new JFileChooser();
        selec.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int opcion = selec.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            textFieldUbicacion.setText(selec.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnExaminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUbicacion;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldUbicacion;
    // End of variables declaration//GEN-END:variables
}
